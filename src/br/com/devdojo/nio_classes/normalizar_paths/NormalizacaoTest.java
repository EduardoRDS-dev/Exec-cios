package br.com.devdojo.nio_classes.normalizar_paths;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// Normalização de paths
// quando se recebe a localização de um arquivo em variáveis diferentes
// e estas variáveis vêm com instruções de voltar um ou mais diretórios,
// ou indicando o diretório atual desta forma: './' '../' usa-se o método
//'normalize();', para construir o diretório final, o método ira remover as instruções de ./ e ../
public class NormalizacaoTest {
    public static void main(String[] args) {

        String projeto = "home/zeus/projeto";
        String arquivo = "/../arquivoStream.txt";
        Path diretory = Paths.get(projeto+arquivo).normalize();
        System.out.println(diretory);
        System.out.println(Files.exists(diretory));
        }


}
