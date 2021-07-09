package br.com.devdojo.nio_classes.relativizar_path;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// Basicamente relativizar paths é tentar ir do diretório A para o diretório B
// excluindo os diretórios tẽm em comum, o resultado é com chegar no destino ex:
// dir1 = /home/zeus/projeto/
// dir2 = /home/zeus/arquivoStream.txt
// result = ../
// neste caso o resultado mostra que para chegar no arquivoStream.txt é necessário voltar um diretório.
// Detalhe! se usar um caminho absoluto para encontrar um caminho relativo o resultado é uma runTimeException
public class RelativizarPath {
    public static void main(String[] args) {

        Path dir1 = Paths.get("/home/zeus/CursoJava/home/zeus/projeto");
        Path dir2 = Paths.get("/home/zeus/CursoJava/home/zeus/arquivoStream.txt");
        Path result = dir1.relativize(dir2).resolve(dir1).normalize();
        if(Files.exists(result)){
            System.out.println("CAMINHO ABSOLUTO: "+result);
        }
    }
}
