package br.com.devdojo.tratamentoexecoes.exceptonscustom;
import java.util.Scanner;

public class Logar {

    private String senhaBancoDeDados = "test_senha";
    private String emailBancoDeDados = "Eduardo_test@exemplo.com";

    public Logar(){
    }

    public boolean logar() throws LoginInvalidException{
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite seu email:");
        String email = entrada.nextLine();
        System.out.println("digite sua senha:");
        String senha = entrada.nextLine();
        if (!email.equals(emailBancoDeDados) || !senha.equals(senhaBancoDeDados)) {
            throw new LoginInvalidException();
        }
        return true;
    }
}
