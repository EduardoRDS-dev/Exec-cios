package br.com.devdojo.tratamento_excecoes.trywithresources;

public class Leitor1 implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("fechando leitor1");
    }
}
