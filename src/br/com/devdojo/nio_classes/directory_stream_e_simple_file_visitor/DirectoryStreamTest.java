package br.com.devdojo.nio_classes.directory_stream_e_simple_file_visitor;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamTest {
    public static void main(String[] args) {

        //Listar pastas e arquivos dentro de um diretório.
        //Detalhe: subpastas das pastas dentro do diretório passado
        //no método 'newDirectoryStream()', não serão listados
        Path ls = Paths.get("pastaTeste");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(ls)) {
            for (Path aux : stream) {
                System.out.println(aux.getFileName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
