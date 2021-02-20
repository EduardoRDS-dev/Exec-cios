package br.com.devdojo.tratamentoexecoes.trywithresources;

public class Leitor1 implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("fechando leitor1");
    }
}
