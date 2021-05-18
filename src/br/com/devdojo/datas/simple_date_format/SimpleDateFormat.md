## Class SimpleDateFormat

Class para criar datas personalizadas.


### Declaração da class: ###

Esta class recebe uma String como parâmetro, os caracteres usados para montar a
data estão descritos na [documentação](https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html).

```
Calendar calendar = Calendar.getInstance();
String dateFormat = "'Aparecia', dd 'de' MMMM 'de' yyyy 'as' H':'m z"
SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
System.out.println(simpleDateFormat.format(calendar.getTime()));
```
