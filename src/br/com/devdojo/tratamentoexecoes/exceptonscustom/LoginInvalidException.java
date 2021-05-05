package br.com.devdojo.tratamentoexecoes.exceptonscustom;

public class LoginInvalidException extends Exception{

    public LoginInvalidException(){
        super("senha ou email invalido!");
    }
}
