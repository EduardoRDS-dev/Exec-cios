## Metacaracteres
* metacaractere `\d` todos os dígitos.



* metacaractere `\D` tudo que não seja dígito.



* metacaractere `\s` espaço em branco.



* metacaractere `\S` tudo que não seja espaço em branco.



* metacaractere `\w` caracteres de a-z ou A-Z, dígitos, e _



* metacaractere `\W`  tudo que não seja caractere do alfabeto.


* metacaractere intervalo `-`
  * usado para criar um intervalo entre caracteres, exemplo:

    `a-zA-Z0-9`


* ### metacaractere ponto `.` ###
  * usado como caractere coringa, exemplo:
    
    `[0-9].`


* ### metacaractere lista `[ ]` ###
  * a lista casa com os caracteres dentro dela, e tem suas próprias regras, o (traço) `-`
  usado dentro de uma lista representa um intervalo, exemplo:

    `[!#a-dA-D0-9]`


* ### metacaractere lista negada `[^ ]` ###
  * a lista negada casa com qualquer caractere que não esteja listado dentro dela, 
  toda regra que se aplica a lista normal se aplica a lista negada, exemplo:
    
    `[^a-z]`
    

* ### metacaractere circunflexo `^` ###
    * o circunflexo marca o começo de uma linha, usado para procurar no começo da linha,
  *detalhe!: esse caractere só é especia no começo da expressão regular.* exemplo:
  
        `^[0-9]`


* ### metacaractere cifrão `$` ###
    * o cifrão marca o final de um linha, só é válido no final da expressão regular, exemplo:
  
        `0[xX][0-9A-Fa-f]+(\\s|$)`


* ### metacaractere borda `\b` ###
    * o metacaractere borda marcar a bordar de um "trecho", muito útil para marcar
  uma palavra exata que não pode ser usada de forma parcial, exemplo:
  
        `\\bint\\b`


* ### metacaractere scape `\` ###
    * permite o uso do valor literal de um símbolo que coincide com um metacaractere 
  existente, exemplo:
  
        `porr\\*` 


* ### metacaractere ou `|` ###
    * usado quando temos mais de uma opção válida dentro de uma expressão regular, exemplo:
      
        `0[xX][0-9A-Fa-f]+(\\s|$)`


* ### metacaractere grupo `()` ###
    * serve pra agrupar opções, dentro de um grupo é possível ter um ou mais caracteres,
  metacarecteres e grupos. exemplo:
      
        `(super|hiper)mercado`

    ## Quantificadores
* ### metacaractere opcional `?` ###
    * o quantificador opcional indica que pode ter ou não a ocorrência da entidade
    anterior, pois ele repete 0 ou 1 vez, muito útil para procurar palavras no singular e
      plural, exemplo:
      
        `moto[s!]?`

* ### metacaractere asterisco `*` ###
    * o quantificador asterisco indica que o valor anterior pode aparecer em qualquer
    quantidade, 0 ou mais vezes, exemplo:
      
        `ob[a]*`

* ### metacaractere mais `+` ###
    * o quantificador (mais) índica que o caractere anterior deve ocorrer uma ou mais vezes, exemplo:
  
        `ob[a]+`


* ### metacaractere chaves `{n,m}` ###
    * o quantificador chave serve para criar uma repetição mais controlada onde
    `{n,m}` significa: de `n` até `m` vezes, também é possível trabalhar com um valor exato, exemplo:
      
        valor exato: `{3}`
      
        repetição: `{2,4}`