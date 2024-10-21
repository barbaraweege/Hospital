package singleton;

import models.Paciente;
import models.Medico;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private static Hospital instance;
    private List<Paciente> pacientes;
    private List<Medico> medicos;

    // Construtor privado
    private Hospital() {
        pacientes = new ArrayList<>();
        medicos = new ArrayList<>();
    }

    // Método para obter a instância do Hospital
    public static Hospital getInstance() {
        if (instance == null) {
            instance = new Hospital();
        }
        return instance;
    }

    // Método para adicionar um paciente
    public void addPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    // Método para adicionar um médico
    public void addMedico(Medico medico) {
        medicos.add(medico);
    }

    // Métodos para listar pacientes e médicos
    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public List<Medico> getMedicos() {
        return medicos;
    }
}
