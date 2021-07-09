package br.com.devdojo.nio_classes.resolver_paths;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolvendoPaths {
    public static void main(String[] args) {
        Path home = Paths.get("/home/zeus/CursoJava/home/zeus/");
        Path arquivo = Paths.get("projeto/arquivo1.txt");
        Path result = home.resolve(arquivo);
        System.out.println(Files.exists(result));
        System.out.println(result);
    }
}
