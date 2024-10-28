package observer;

import models.Paciente;
import java.util.ArrayList;
import java.util.List;

public class PacienteEventNotifier {
    private List<EventObserver> observers = new ArrayList<>();

    public void addObserver(EventObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(EventObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(Paciente paciente) {
        for (EventObserver observer : observers) {
            observer.onPacienteAdicionado(paciente);
        }
    }
}
