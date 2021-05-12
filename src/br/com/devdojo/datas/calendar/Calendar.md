## Class Calendar

A class Calendar foi introduzida para substituir a class Date.

### Declaração da class: ###
 Por ser uma class abstrata esse é a forma de se obter uma instância desta class.
```
Calendar date = Calendar.getInstace();
```

### Métodos úteis: ###

`date.getTime()` retorna a data e hora, "não formatados".

`date.get(Calendar.HOUR_OF_DAY);` retorna a hora.

`date.get(Calendar.DAY_OF_YEAR);` retorna o dia do ano.

`date.get(Calendar.DAY_OF_MONTH);` retorna o dia do mês.

`date.get(Calendar.DAY_OF_WEEK);` retorna o dia da semana.

`date.get(Calendar.YEAR);` retorna o ano.

`date.getCalendarType()` retorna o tipo do calendário.

Caso queira adicionar ou remover valores ao mês, dia, hora ou ano:

`date.add(Calendar.HOUR,9);` adiciona valor a hora.

`date.add(Calendar.MONTH,21);` adiciona valor ao mês.

`date.add(Calendar.YEAR,2);` adiciona valor ao ano.

`date.add(Calendar.DAY_OF_YEAR, 3)` adiciona valor ao dia.

