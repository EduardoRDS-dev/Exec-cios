package br.com.devdojo.nio_classes.dos_file_attributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class DosFileAtributesTest {
    public static void main(String[] args) {

        //Objetivo: usar o pacote de entrada e saida `nio` para ler
        //e configurar os atributos de um arquivo em sistemas Windows,


        Path file = Paths.get("home/zeus/arquivoStream.txt");
        if(Files.exists(file)) {
            try {
                //Leitura:
                //Interface DosFileAttributes extend BasicFileAttributes  e adiciona
                //alguns metadados que podem ser encontrados em arquivos no OS windows.
                DosFileAttributes dosAttributes = Files.readAttributes(file, DosFileAttributes.class);
                System.out.println("system: " + dosAttributes.isSystem());
                System.out.println("archive: " + dosAttributes.isArchive());
                System.out.println("hidden " + dosAttributes.isHidden());
                System.out.println("read only: " + dosAttributes.isReadOnly());
                System.out.println("----------------");

                //Interface DosFileAttributeView  interface para configurar os metadados
                DosFileAttributeView dosView = Files.getFileAttributeView(file, DosFileAttributeView.class);
                dosView.setSystem(true);
                dosView.setArchive(true);
                dosView.setHidden(true);
                dosView.setReadOnly(true);

                dosAttributes = Files.readAttributes(file, DosFileAttributes.class);
                System.out.println("system: " + dosAttributes.isSystem());
                System.out.println("archive: " + dosAttributes.isArchive());
                System.out.println("hidden " + dosAttributes.isHidden());
                System.out.println("read only: " + dosAttributes.isReadOnly());
                System.out.println("----------------");
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
