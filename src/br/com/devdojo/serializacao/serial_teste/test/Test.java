package br.com.devdojo.serializacao.serial_teste.test;

import br.com.devdojo.serializacao.serial_teste.Professor;
import br.com.devdojo.serializacao.serial_teste.Turma;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {
    public static void main(String[] args) {

         gravador();
         leitor();
    }

    public static void gravador() {
        Path file = Paths.get("mensagem/professor.txt");
        Turma turma = new Turma("programação");
        Professor professor = new Professor(216546464, "Eduardo Santos", "Email@protomail.ch", "123456", "java backend", turma);

        try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file.toFile()));
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(bufferedOutputStream)) {

            objectOutputStream.writeObject(professor);
            bufferedOutputStream.flush();
            objectOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void leitor() {
        Path file = Paths.get("mensagem/professor.txt");

        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file.toFile()));
             ObjectInputStream objectInputStream = new ObjectInputStream(bufferedInputStream)) {
            Professor professor0 = (Professor) objectInputStream.readObject();
            System.out.println(professor0.toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
