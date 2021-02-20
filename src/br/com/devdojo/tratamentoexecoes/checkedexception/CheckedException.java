package br.com.devdojo.tratamentoexecoes.checkedexception;

import java.io.File;
import java.io.IOException;

public class CheckedException {

    public static void main(String[] args) {
        try {
            System.out.println(abrirArquivo());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void criarArquivo() throws IOException {

        File file = new File("Arquivo.txt");
        try {
            System.out.println("Arquivo criado? " + file.createNewFile());
        } catch (IOException exception) {
            exception.printStackTrace();
            throw exception;
        }
    }

    public static int dividirDoisNumeros(int num1, int num2) {

        if (num2 == 0) {
            throw new IllegalArgumentException("Passe um valor diferente de zero para num2!");
        }

        int result = num1 / num2;
        return result;
    }

    public static boolean abrirArquivo() {

        try {
            System.out.println("abrindo arquivo");
            System.out.println("lendo arquivo");
            System.out.println("escrevendo no arquivo");

        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            System.out.println("fechando o arquivo");
            return true;
        }


    }
}
