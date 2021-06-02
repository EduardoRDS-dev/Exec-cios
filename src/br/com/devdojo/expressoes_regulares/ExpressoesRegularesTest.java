package br.com.devdojo.expressoes_regulares;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTest {

    public static void main(String[] args) {
        // procurar emails

        String texto = "teste@gmail.com carol32@mail.com.br cristianaSilva23@protonmail.com Silva89_@mail teste1_AA@gmail.com.br IgorS_EWs@mail.com.fr";
        String regex = "[\\w]+@[\\w]+\\.([a-zA-z]{2,3}(\\.[a-zA-Z]{2})?(\\s|$))";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        while (matcher.find()) {
            System.out.println("email: " + matcher.group());
        }

        // procurar datas no formato = dd/mm/yyyy ou dd/mm/yy
        String texto1 = "05/01/2020 01/12/20 03/05/2021 01/02/2022 000/222/2020";
        String regex1 = "(\\d){2}(\\s|-|/)(\\d){2}(\\s|-|/)(\\d){2,4}(\\s|$)";
        Pattern pattern1 = Pattern.compile(regex1);
        Matcher matcher1 = pattern1.matcher(texto1);
        System.out.println("#########################################");
        while (matcher1.find()) {
            System.out.println("data: " + matcher1.group());
        }

    }

}

