## Class NumberFormat

Essa class formata números de acordo com os padrões do país passado 
através da class Locale, também formata os valores como moeda.

### Declaração para formatação de números: ###

```
float valor = 1000f;
Locale locale = new Locale("en","USA");
NumberFormat numberFormat = NumberFormat.getInstance(locale);
numberFormat.format(valor);
```

### Declaração para formatação de moedas: ###

```
float valor = 1000f;
Locale locale = new Locale("pt","BR");
NumberFormat numberFormat = numberFormat.getCurrencyInstance(locale);
numberFormat.format(valor);
```

Alguns métodos úteis desta class são:

`.parse();` Converte String em valor numérico.

`.setParseIntegerOnly();` Esse método recebe um boolean, e caso receba 
true, faz com que conversões de String para valor numérico sempre retorne 
um inteiro, independente se o valor convertido seja inteiro, float ou double.
