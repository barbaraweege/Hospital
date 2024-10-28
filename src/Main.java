import adapter.SistemaExternoAdapter;
import builder.MedicoBuilder;
import builder.PacienteBuilder;
import models.Medico;
import models.Paciente;
import observer.MedicoObserver;
import observer.PacienteEventNotifier;
import singleton.Hospital;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = Hospital.getInstance();
        SistemaExternoAdapter sistemaExternoAdapter = new SistemaExternoAdapter();

        //Notificador
        PacienteEventNotifier eventNotifier = new PacienteEventNotifier();

        Paciente paciente = new PacienteBuilder()
                .setNome("Taylor Swift")
                .setIdade(34)
                .setEndereco("West Reading, Pensilvânia, EUA")
                .build();

        hospital.addPaciente(paciente);
        sistemaExternoAdapter.registrarPacienteNoSistemaExterno(paciente);

        Paciente pacienteCantor = new PacienteBuilder()
        .setNome("Michael Jackson")
        .setIdade(50)
        .setEndereco("Beverly Hills, Califórnia")
        .build();
        
        hospital.addPaciente(pacienteCantor);
        sistemaExternoAdapter.registrarPacienteNoSistemaExterno(pacienteCantor);

        Medico medico = new MedicoBuilder()
                .setNome("Doutor Estranho")
                .setEspecialidade("Neurocirurgião")
                .build();

        hospital.addMedico(medico);

        Medico medicoCardiologista= new MedicoBuilder()
        .setNome("Jeffrey Dahmer")
        .setEspecialidade("Cardiologista")
        .build();

        hospital.addMedico(medicoCardiologista);

        // Registrando o médico como observador
        MedicoObserver medicoObserver = new MedicoObserver(medico);
        eventNotifier.addObserver(medicoObserver);

        // Notificando os médicos observadores sobre o novo paciente
        eventNotifier.notifyObservers(paciente);
        eventNotifier.notifyObservers(pacienteCantor);

        System.out.println("Pacientes no hospital:");
        for (Paciente p : hospital.getPacientes()) {
            System.out.println(p);
        }

        System.out.println("\nMédicos no hospital:");
        for (Medico m : hospital.getMedicos()) {
            System.out.println(m);
        }
    }
}
