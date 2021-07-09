package br.com.devdojo.serializacao.classes;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Aluno extends Pessoa implements Serializable {

    private static final String nomeEscola = "DevDojo";
    private long id;
    private transient String password;
    private String nomeCurso;
    private Turma turma;

    public Aluno(String nome, long id, String password, String nomeCurso) {
        super(nome);
        this.id = id;
        this.password = password;
        this.nomeCurso = nomeCurso;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + super.getNome() + '\'' +
                ", password='" + password + '\'' +
                ", nomeCurso='" + nomeCurso + '\'' +
                ", turma='" + turma.getNome() + '\'' +
                '}';
    }

    public static String getNomeEscola() {
        return nomeEscola;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

// Todas as classes que tenha um relacionamento de associação com sua class que será
// serializada, precisão implementar a interface 'Serializable', o mesmo não é valido
// para relacionamentos de herança.

// No caso da sua class ter uma associação com outra class que não implementa a interface
// 'Serializable', e vc não tenha permissão para implementar a interface nesta class,
// é possível sobrescrever esse método do background da interface 'Serializable' para tentar
// resolver.
//    DETALHE!: A assinatura do método deve ser exatamente esta:
    private void writeObject(ObjectOutputStream objectOutputStream) {
        try {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeUTF(turma.getNome());
            objectOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

// Este método serve pra tentar ler um objeto de um class que não implementa a interface 'Serializable'
// e tbm é um método em background da interface 'Serializable'
//    DETALHE!: A assinatura do método deve ser exatamente esta:
    private void readObject(ObjectInputStream objectInputStream) {

        try {
            objectInputStream.defaultReadObject();
            Turma turma = new Turma(objectInputStream.readUTF());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

