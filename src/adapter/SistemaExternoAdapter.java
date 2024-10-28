package adapter;

import models.Paciente;

public class SistemaExternoAdapter {
    private SistemaExterno sistemaExterno;

    public SistemaExternoAdapter() {
        sistemaExterno = new SistemaExterno();
    }

    public void registrarPacienteNoSistemaExterno(Paciente paciente) {
        sistemaExterno.registrarPaciente(paciente.getNome(), paciente.getIdade());
    }
}
