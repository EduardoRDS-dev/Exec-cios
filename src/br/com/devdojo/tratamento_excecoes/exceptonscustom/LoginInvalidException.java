package br.com.devdojo.tratamento_excecoes.exceptonscustom;

public class LoginInvalidException extends Exception{

    public LoginInvalidException(){
        super("senha ou email invalido!");
    }
}
