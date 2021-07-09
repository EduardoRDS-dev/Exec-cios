package br.com.devdojo.serializacao.serial_teste;

import java.io.Serializable;

public class Turma implements Serializable {

    private String turmaNome;

    public Turma(String turmaNome) {
        this.turmaNome = turmaNome;
    }

    public String getTurmaNome() {
        return turmaNome;
    }

    public void setTurmaNome(String turmaNome) {
        this.turmaNome = turmaNome;
    }
}
