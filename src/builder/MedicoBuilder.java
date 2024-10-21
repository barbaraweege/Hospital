package builder;

import models.Medico;

public class MedicoBuilder {
    private String nome;
    private String especialidade;

    public MedicoBuilder setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public MedicoBuilder setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
        return this;
    }

    public Medico build() {
        return new Medico(nome, especialidade);
    }
}