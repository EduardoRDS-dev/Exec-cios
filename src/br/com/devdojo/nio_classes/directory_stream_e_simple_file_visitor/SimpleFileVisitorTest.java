package br.com.devdojo.nio_classes.directory_stream_e_simple_file_visitor;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class SimpleFileVisitorTest {

    public static void main(String[] args) throws IOException {

        //Percorrer uma arvore de arquivos.
        Files.walkFileTree(Paths.get("pastaTeste"), new PrintDirectory());
    }


   public static class AcharTodosOsTXT extends SimpleFileVisitor<Path> {
        //Sobrescrevendo o método 'visitFile()'
        @Override
        public FileVisitResult visitFile(Path path, BasicFileAttributes attrs) {
            if (path.getFileName().toString().endsWith(".txt")) {
                System.out.println(path.getFileName());
            }
//            Para o retorno temos 4 opções:
//            CONTINUE, TERMINATE, SKIP_SUBTREE, SKIP_SIBLINGS
            return FileVisitResult.CONTINUE;
        }

    }

    //    Testando outros métodos da class 'SimpleFileVisitor'
    static class PrintDirectory extends SimpleFileVisitor<Path> {


        @Override
        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
            System.out.println("pre visit directory: " + dir);
            if (dir.getFileName().toString().equals("subsubpasta")) {
                return FileVisitResult.SKIP_SIBLINGS;
            }
            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
            System.out.println("visit file: " + file);
            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {

            return FileVisitResult.CONTINUE;
        }

        public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
            System.out.println("post visit directory: " + dir);
            return FileVisitResult.CONTINUE;
        }

    }
}
