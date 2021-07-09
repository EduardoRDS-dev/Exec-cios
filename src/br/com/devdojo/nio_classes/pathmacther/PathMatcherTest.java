package br.com.devdojo.nio_classes.pathmacther;




import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class PathMatcherTest {
    public static void main(String[] args) {

        Path directory = Paths.get("/home");
        //Usando apenas  a class 'SimpleFileVisitor' para procurar arquivos
        try {
            Files.walkFileTree(directory, new FindTxt());
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Usando glob com a Class 'PathMatcher'
        try {
            Files.walkFileTree(directory, new FindAllTxtUseGlob("**/*.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Pesquisar arquivos usando usando 'glob', em diretórios de forma recursiva.
    // PathMatcher() para montar globs
    // SimpleFileVisitor() para procurar de forma recursiva.
    static class FindAllTxtUseGlob extends SimpleFileVisitor<Path> {

        private String aux = "glob:";
        public FindAllTxtUseGlob(String glob){
             aux += glob;
        }

        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs){
            PathMatcher matcher = FileSystems.getDefault().getPathMatcher(aux);
            if(matcher.matches(file)){
                System.out.println(aux+" "+file.toAbsolutePath());
            }
            return FileVisitResult.CONTINUE;
        }
    }


    public static class FindTxt extends SimpleFileVisitor<Path> {
        @Override
        public FileVisitResult visitFile(Path path, BasicFileAttributes attrs) {
            if (path.getFileName().toString().endsWith(".txt")) {
                System.out.println(path.getFileName());
            }
            return FileVisitResult.CONTINUE;
        }

    }
}

