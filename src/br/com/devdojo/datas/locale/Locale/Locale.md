 ## Class Locale
 A class locale recebe dois argumentos: idioma e país, ex: "pt = português" "BR = Brasil",
 essas siglas seguem o padrão definido pela iso 639.
 
### Declaração da class: ###

`Locale locale = new Locale("pt","BR");`

Ao usar a class Locale em conjunto com a class Calendar as datas são formatadas de 
acordo com o país e língua.

Alguns métodos muito úteis desta class são:

`.getDiplayLanguage()` Retorna o idioma do país.

`.getDisplayCountry()` Retorna o nome do país.