package br.com.devdojo.serializacao.test;

import br.com.devdojo.serializacao.classes.Aluno;
import br.com.devdojo.serializacao.classes.Turma;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {
    public static void main(String[] args) {

        gravadorObjeto();
        leitoObjeto();
    }

    // Serializando um objeto:
    // Serialização é um processo que converte um objeto em um fluxo de dados ou "stream de dado",
    // com o objetivo de armazenar ou transmitir, o objeto pode ser reconstruído no mesmo ou
    // em outro ambiente computacional.

    // Detalhe! para informar ao java que um determinado atributo de um objeto não deve ser serializado
    // basta adicionar 'transient' na declaração do atributo desta forma: 'private transient String password;'.
    public static void gravadorObjeto() {

        Aluno aluno = new Aluno("Eduardo Rodrigues Dos Santos", 1111111, "senhaTeste", "maratona java");
        Turma turma = new Turma("3ºADS");
        aluno.setTurma(turma);
        Path file = Paths.get("pastaTeste/aluno.txt");

        try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file.toFile()))) {
            ObjectOutput objectOutput = new ObjectOutputStream(bufferedOutputStream);
            objectOutput.writeObject(aluno);
            objectOutput.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Des-serializando um objeto:

    // Detalhe!: ao des-serializar ou seja: "reconstruir o objeto" o construtor da class que criou esta
    // instância não sera chamado.
    public static void leitoObjeto() {

        Path file = Paths.get("pastaTeste/aluno.txt");

        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file.toFile()));
             ObjectInputStream objectInputStream = new ObjectInputStream(bufferedInputStream)) {

            Aluno aluno1 = (Aluno) objectInputStream.readObject();
            System.out.println(aluno1);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
