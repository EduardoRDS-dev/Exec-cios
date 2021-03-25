#`select` função de agregação

###Usando o ` select ` com `distinct`:
`select distinct nacionalidade from pessoas order by nacionalidade;` 
* *O comando ` distinct ` criar uma lista de todos os registros de um campo, os registros 
  que contém mais de uma ocorrência são listados apenas uma vez.*

###Usando o `count()`:
`select count(*) from cursos:`
 * *O camando `count()` retorna a quantidade de linhas de um campo, é possível usar 
   o parâmetro `*`, para substituir o nome de um campo.

###Usando o `max()`:
`select max(totaulas) from cursos;`
* *O comando `max()` retorna o maior valor registrado dentro de um campo.*

###Usando o`min()`:

`select min(totaulas) from cursos;`

* *O comando `min()` retorna o menor valor registrado dentro de um campo.*

###Usando o`sum()`:

`select sum(totaulas) from cursos;` 

* *O comando `sum()` soma todos os valores de todas as linhas um campo.*

###Usando o `avg()`:
`select avg(totaulas) from cursos;`
 * *O Comando `avg` retorna a média aritmética de todas as linhas de um campo.*