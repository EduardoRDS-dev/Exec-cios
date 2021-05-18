package br.com.devdojo.datas.simple_date_format;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SimpleDateFormatTest {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        String dateFormat = "'Aparecia', dd 'de' MMMM 'de' yyyy 'as' H':'m z";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
        System.out.println(simpleDateFormat.format(calendar.getTime()));
    }

}
