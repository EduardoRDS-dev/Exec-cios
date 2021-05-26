package br.com.devdojo.expressoes_regulares.tokens;

import java.util.Scanner;

public class TokensDelimitadoresTest {
    public static void main(String[] args) {

        //usando a class String
        String string = "Maria Ana Carol Alexandra Fernanda Cristina Bruna Karine Rafaela Juliana Luiza Vitoria Natalia Daiane Daniela";
        String [] tokens = string.split(" ");
        for(String aux: tokens){
            System.out.println(aux.trim());
        }

        //Usando a class Scanner
        Scanner scanner = new Scanner("true false 111 2020 Maria Ana Carol Alexandra Fernanda Cristina Bruna Karine Rafaela Juliana Luiza Vitoria Natalia Daiane Daniela");
        System.out.println("#####################");
        while(scanner.hasNext()){
            if(scanner.hasNextInt()){
                System.out.println  ("int: "+ scanner.nextInt());
            }else if(scanner.hasNextBoolean()){
                System.out.println("Boolean: "+scanner.nextBoolean());
            }else if(scanner.hasNext()){
                System.out.println("String: "+scanner.next());
            }
        }
    }
}
