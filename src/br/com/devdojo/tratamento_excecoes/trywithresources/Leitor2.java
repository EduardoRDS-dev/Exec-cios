package br.com.devdojo.tratamento_excecoes.trywithresources;

public class Leitor2 implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("fechando leitor2");
    }
}
