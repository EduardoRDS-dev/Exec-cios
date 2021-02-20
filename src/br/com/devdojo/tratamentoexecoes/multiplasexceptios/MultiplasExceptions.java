package br.com.devdojo.tratamentoexecoes.multiplasexceptios;

import java.io.File;
import java.io.IOException;

public class MultiplasExceptions {

    public static void main(String[] args) {
        try {
            manipulaDados();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("fora do metodo manipular_Dados");
    }

    public static void manipulaDados() throws IOException, ArithmeticException {


        File file = new File("test.txt");
        int num = 20, num2 = 10, result;

        try {
            result = num/num2;
            System.out.println(file.createNewFile());
            System.out.println(result);
        } catch (IOException | RuntimeException e) {
            e.printStackTrace();
        }
    }
}
