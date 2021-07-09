package br.com.devdojo.serializacao.serial_teste;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Professor implements Serializable {

    private long id;
    private String nome;
    private String email;
    private transient String pass;
    private String especialidade;
    private Turma turma;

    public Professor(long id, String nome, String email, String pass, String especialidade, Turma turma) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.pass = pass;
        this.especialidade = especialidade;
        this.turma = turma;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", pass='" + pass + '\'' +
                ", especialidade='" + especialidade + '\'' +
                ", Turma='" + turma.getTurmaNome() + '\'' +
                '}';
    }

    private void writeObject(ObjectOutputStream objectOutputStream){
        try {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeUTF(turma.getTurmaNome());
            objectOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readObject(ObjectInputStream objectInputStream){
        try{
            objectInputStream.defaultReadObject();
            Turma turma = new Turma(objectInputStream.readUTF());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
}
