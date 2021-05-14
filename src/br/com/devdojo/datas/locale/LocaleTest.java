package br.com.devdojo.datas.locale;

import javax.sound.midi.Soundbank;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        Locale locale = new Locale("en","US");
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM,locale);
        System.out.println(locale.getDisplayCountry()+" "+dateFormat.format(calendar.getTime()));

        Calendar calendar1 = Calendar.getInstance();
        Locale locale1 = new Locale("pt","BR");
        DateFormat dateFormat1 = DateFormat.getDateInstance(DateFormat.MEDIUM,locale1);
        System.out.println(locale1.getDisplayCountry()+" "+dateFormat1.format(calendar1.getTime()));

        Calendar calendar2 = Calendar.getInstance();
        Locale locale2 = new Locale("ja","JP");
        DateFormat dateFormat2 = DateFormat.getDateInstance(DateFormat.FULL,locale2);
        System.out.println(locale2.getDisplayCountry()+" "+dateFormat2.format(calendar2.getTime()));

    }
}
