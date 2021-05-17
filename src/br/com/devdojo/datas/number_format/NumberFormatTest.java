package br.com.devdojo.datas.number_format;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest {

    public static void main(String[] args) {

        float valor = 10000000f;
        String valor1 = "200,54123";

        Locale locale = new Locale("en","USA");

        NumberFormat[] numberFormat = new NumberFormat[4];
        numberFormat[0] = NumberFormat.getInstance();
        numberFormat[1] = NumberFormat.getInstance(locale);
        numberFormat[2] = NumberFormat.getCurrencyInstance();
        numberFormat[3] = NumberFormat.getCurrencyInstance(locale);

        for(NumberFormat aux : numberFormat){
            System.out.println(aux.format(valor));
        }

        NumberFormat numberFormat1 = NumberFormat.getInstance();
        try {
            System.out.println(numberFormat1.parse(valor1));
            numberFormat1.setParseIntegerOnly(true);
            System.out.println(numberFormat1.parse(valor1));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}
