package br.com.devdojo.nio_classes.basic_file_attributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributesTest {
    public static void main(String[] args) {

        // Objetivo: usar o pacote de entrada e saida `nio` para ler
        //é configurar os atributos básicos de um arquivo.

        Path file = Paths.get("/home/zeus/CursoJava/home/zeus/projeto/arquivo1.txt");
        try {
            //Leitura:
            //Interface BasicFileAttributes tem métodos apenas de leitura.
            //consegue ler apenas atributos "universais" de um arquivo.
            // ("universais: "meta dados que existem em todos OS)
            BasicFileAttributes attributes = Files.readAttributes(file,BasicFileAttributes.class);
            System.out.println("Directory: "+attributes.isDirectory());
            System.out.println("regular file: "+attributes.isRegularFile());
            System.out.println("symbolic link: "+attributes.isSymbolicLink());
            System.out.println("created: "+attributes.creationTime());
            System.out.println("last access:" +attributes.lastAccessTime());
            System.out.println("last modified: "+attributes.lastModifiedTime());
            System.out.println("size: "+attributes.size());
            System.out.println("------------------------------------------");

            //interface BasicFileAttributesView tem métodos para configurar os atributos;
            //consegue configurar apenas atributos "universais";
            BasicFileAttributeView basicView= Files.getFileAttributeView(file,BasicFileAttributeView.class);
            FileTime created = attributes.creationTime();
            FileTime lastModified = attributes.lastModifiedTime();
            FileTime lastAccess = FileTime.fromMillis(System.currentTimeMillis());

            basicView.setTimes(lastModified,lastAccess,created);
            attributes = Files.readAttributes(file, BasicFileAttributes.class);

            System.out.println("Directory: "+attributes.isDirectory());
            System.out.println("regular file: "+attributes.isRegularFile());
            System.out.println("symbolic link: "+attributes.isSymbolicLink());
            System.out.println("created: "+attributes.creationTime());
            System.out.println("last access:" +attributes.lastAccessTime());
            System.out.println("lest modified: "+attributes.lastModifiedTime());
            System.out.println("size: "+attributes.size());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
