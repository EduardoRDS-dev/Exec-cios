package br.com.devdojo.datas.calendar;

import java.util.Calendar;

public class CalendarTest {

    public static void main(String[] args) {

        Calendar date = Calendar.getInstance();
        if(Calendar.SUNDAY == date.getFirstDayOfWeek()){
            System.out.println("Domingo é o primeiro dia da semana");
        }

        System.out.println(date.get(Calendar.HOUR_OF_DAY));
        System.out.println(date.get(Calendar.DAY_OF_YEAR));
        System.out.println(date.get(Calendar.DAY_OF_MONTH));
        System.out.println(date.get(Calendar.DAY_OF_WEEK));
        System.out.println(date.get(Calendar.YEAR));
        System.out.println(date.getCalendarType());

        date.add(Calendar.HOUR,9);
        date.add(Calendar.MONTH,21);
        date.add(Calendar.YEAR,2);
        date.add(Calendar.DAY_OF_YEAR, 3);

        System.out.println(date.getTime());
    }
}
