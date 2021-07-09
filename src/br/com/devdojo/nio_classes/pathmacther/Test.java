package br.com.devdojo.nio_classes.pathmacther;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Test {
    public static void main(String[] args) {
        try {
            Files.walkFileTree(Paths.get("/home/zeus/CursoJava"), new FindFilesJava("**/*.{java,class}"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static class FindFilesJava extends SimpleFileVisitor<Path> {
        private String aux = "glob:";

        public FindFilesJava(String glob){
            aux += glob;
        }

        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {

            PathMatcher matcher = FileSystems.getDefault().getPathMatcher(aux);
            if(matcher.matches(file)){
                System.out.println(file.toAbsolutePath());
            }
            return FileVisitResult.CONTINUE;
        }
    }
}
