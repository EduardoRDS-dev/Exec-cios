package br.com.devdojo.tratamentoexecoes.exceptonscustom.testexception;

import br.com.devdojo.tratamentoexecoes.exceptonscustom.Logar;

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
