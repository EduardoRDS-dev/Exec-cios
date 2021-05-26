package br.com.devdojo.tratamento_excecoes.checkedexception;

import java.io.File;
import java.io.IOException;

public class CheckedException {

    public static void main(final String[] args) {
        try {
            System.out.println(abrirArquivo());
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }

    public static void criarArquivo() throws IOException {

        final File file = new File("Arquivo.txt");
        try {
            System.out.println("Arquivo criado? " + file.createNewFile());
        } catch (final IOException exception) {
            exception.printStackTrace();
            throw exception;
        }
    }

    public static int dividirDoisNumeros(final int num1, final int num2) {

        if (num2 == 0) {
            throw new IllegalArgumentException("Passe um valor diferente de zero para num2!");
        }

        final int result = num1 / num2;
        return result;
    }

    public static boolean abrirArquivo() {

        try {
            System.out.println("abrindo arquivo");
            System.out.println("lendo arquivo");
            System.out.println("escrevendo no arquivo");

        } catch (final Exception e) {


            e.printStackTrace();
            throw e;
        } finally {
            System.out.println("fechando o arquivo");
            return true;
        }


    }
}
