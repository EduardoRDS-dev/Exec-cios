package br.com.devdojo.tratamento_excecoes.exceptonscustom.testexception;

import br.com.devdojo.tratamento_excecoes.exceptonscustom.Logar;

public class ExceptionTest {

    public static void main(String[] args) {

        Logar log = new Logar();
        try{
            System.out.println(log.logar());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
