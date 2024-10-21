package builder;

import models.Paciente;

public class PacienteBuilder {
    private String nome;
    private int idade;
    private String endereco;

    public PacienteBuilder setNome(String nome) {
        this.nome = nome;
        return this; 
    }

    public PacienteBuilder setIdade(int idade) {
        this.idade = idade;
        return this;
    }

    public PacienteBuilder setEndereco(String endereco) {
        this.endereco = endereco;
        return this;
    }

    public Paciente build() {
        return new Paciente(nome, idade, endereco);
    }
}
