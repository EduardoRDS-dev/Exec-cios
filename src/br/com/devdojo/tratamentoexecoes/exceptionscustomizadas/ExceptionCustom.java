package br.com.devdojo.tratamentoexecoes.exceptionscustomizadas;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ExceptionCustom {

    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    public static void logar() throws LoginInvalidoException {

        Scanner entrada = new Scanner(System.in);
        String emailBancoDeDados = "Eduardo_Rodrigues@protonmail.com";
        String senhaBancoDeDados = "dudumailhackingjava";

        System.out.println("      Seja bem vindo!");
        System.out.print("Digite seu email:");
        String emailDigitado = entrada.nextLine();
        System.out.print("Digite sua senha:");
        String senhaDigitada = entrada.nextLine();

        if (!emailBancoDeDados.equals(emailDigitado) || !senhaBancoDeDados.equals(senhaDigitada)) {
            throw new LoginInvalidoException();

        } else {
            System.out.println("Logado com sucesso!");
        }
    }

}
