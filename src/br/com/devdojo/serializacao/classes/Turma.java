package br.com.devdojo.serializacao.classes;

import java.io.Serializable;

public class Turma implements Serializable {

    private String nome;

    public Turma(String turma) {
        this.nome = turma;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "turma='" + nome + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
