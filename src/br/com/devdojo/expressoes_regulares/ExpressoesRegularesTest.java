package br.com.devdojo.expressoes_regulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class ExpressoesRegularesTest {

    public static void main(String[] args) {

        String regex = "eu";
        String texto = "eu sou eu  eu";
        String indice = "0123456789";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println(indice);
        System.out.println(texto);
        while(matcher.find()){
            System.out.println(matcher.start()+" "+matcher.end());
        }
    }
}

