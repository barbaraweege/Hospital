package observer;

import models.Paciente;

public interface EventObserver {
    void onPacienteAdicionado(Paciente paciente);
}
