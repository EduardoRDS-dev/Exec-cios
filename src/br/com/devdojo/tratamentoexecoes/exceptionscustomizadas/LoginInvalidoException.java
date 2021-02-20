package br.com.devdojo.tratamentoexecoes.exceptionscustomizadas;

public class LoginInvalidoException extends Exception {

    public LoginInvalidoException(){
        super("email ou senhas inválidos!");
    }
}
