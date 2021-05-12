## Class DateFormat
Esta class formata datas para formas já pre definidas.

### Declaração da class ###

Por ser uma class abstrata esse é a forma de se obter uma instância desta class.
```
DateFormat dateFormat = DateFormat.getIntance();
```

Formatos pre definidos:

Para vermos o resultado é necessário passar uma data para o método `format();`
então vou criar um objeto da class Calendar. 
```
Calendar date = Calendar.getInstance();

DateFormate dateFormat = DateFormat.getDateInstance();
System.out.println(dateFormat.format(date.getTime()));

DateFormate dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
System.out.println(dateFormat.format(date.getTime()));

DateFormate dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM);
System.out.println(dateFormat.format(date.getTime()));

DateFormate dateFormat = DateFormat.getDateInstance(DateFormat.LONG);
System.out.println(dateFormat.format(date.getTime()));

DateFormate dateFormat = DateFormat.getDateInstance(DateFormat.FULL);
System.out.println(dateFormat.format(date.getTime()));
```


*Detalhe: o método `.getDateInstance()` é sobrecarregado para aceitar internacionalização através da class Locale.* 