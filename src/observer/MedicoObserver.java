package observer;

import models.Medico;
import models.Paciente;

public class MedicoObserver implements EventObserver {
    private Medico medico;

    public MedicoObserver(Medico medico) {
        this.medico = medico;
    }

    @Override
    public void onPacienteAdicionado(Paciente paciente) {
        System.out.println("Médico " + medico.getNome() + " foi notificado: Novo paciente adicionado - " + paciente.getNome());
    }
}
