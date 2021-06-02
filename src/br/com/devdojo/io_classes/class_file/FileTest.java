package br.com.devdojo.io_classes.class_file;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {
    public static void main(String[] args) {

        //criar diretório
        File diretorio = new File("mensagem");
        boolean criado = diretorio.mkdir();
        System.out.println("criado?: " + criado);

        File renomearDiretorio = new File("mensagem");
        boolean rename = diretorio.renameTo(renomearDiretorio);
        System.out.println("renomeado?: " + rename);

        System.out.println("####################################");

        //criar arquivo
        File file = new File(diretorio,"arquivo1.txt");
        try {

            System.out.println(file.createNewFile());
            //teste de métodos
            System.out.println("encontrado? " + file.exists());
            System.out.println("diretório: " + file.getAbsoluteFile());
            System.out.println("oculto? " + file.isHidden());
            System.out.println("nome: " + file.getName());
            System.out.println("é um aquivo? " + file.isFile());
            System.out.println("permissão de leitura? " + file.canRead());
            System.out.println("permissão de escrita? " + file.canWrite());
            System.out.println("permissão de execução? " + file.canExecute());
            System.out.println("modifica ultima vez em: " + new Date(file.lastModified()));

        } catch (IOException e) {
            e.printStackTrace();
        }
        buscarArquivos();
    }

    static void buscarArquivos() {

        File file = new File("mensagem");
        String[] arquivos = file.list();
        for(String aux: arquivos){
            System.out.println(aux);
        }
    }
}
