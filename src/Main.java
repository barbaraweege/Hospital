import adapter.SistemaExternoAdapter;
import builder.MedicoBuilder;
import builder.PacienteBuilder;
import models.Medico;
import models.Paciente;
import singleton.Hospital;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = Hospital.getInstance();
        SistemaExternoAdapter sistemaExternoAdapter = new SistemaExternoAdapter();

        Paciente paciente = new PacienteBuilder()
                .setNome("João Silva")
                .setIdade(45)
                .setEndereco("Rua das Flores, 123")
                .build();

        hospital.addPaciente(paciente);
        sistemaExternoAdapter.registrarPacienteNoSistemaExterno(paciente);

        Medico medico = new MedicoBuilder()
                .setNome("Dra. Maria Santos")
                .setEspecialidade("Cardiologia")
                .build();

        hospital.addMedico(medico);

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
