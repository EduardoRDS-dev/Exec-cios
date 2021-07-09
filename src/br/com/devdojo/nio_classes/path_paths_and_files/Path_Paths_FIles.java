package br.com.devdojo.nio_classes.path_paths_and_files;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

// uso básico das classes Path, Paths e Files
public class Path_Paths_FIles {
    public static void main(String[] args) {

        //copiando arquivos
        Path source = Paths.get("/home/zeus/CursoJava/projeto/arquivoTest.md");
        Path target = Paths.get("/home/zeus/CursoJava/nova pasta/arquivo_copiado.md");
        try {
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //verificar se o path existe e se é um diretório
        Path arquivoMd = Paths.get("/home/zeus/CursoJava/projeto/arquivoTest.md");
        System.out.println("O path existe? " + Files.exists(arquivoMd));
        System.out.println("É um diretório? " + Files.isDirectory(arquivoMd));

        //criar pasta e sub-pasta
        Path pastas = Paths.get("pastaTeste/subpastaTest");
        try {
            Files.createDirectories(pastas);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //criar uma única pasta
        Path pasta = Paths.get("PastaTesteA");
        try {
            Files.createDirectory(pasta);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //criar aquivos
        Path arquivo = Paths.get("pastaTeste/subpastaTest/aquivosTest.txt");
        try {

            Files.createFile(arquivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}