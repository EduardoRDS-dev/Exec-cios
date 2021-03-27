###Alterar estrutura  da tabela


* *Deletando uma tabela inteira:*

`drop table if exists nome_da_tabela;`

* *Adicionando um novo campo na tabela:*

`alter table pessoas
add column profissão varchar(15) not null default '';`

* *Deletando um campo da tabela:*

`alter table pessoas
drop column profissão;`

* *Alterando a estrutura de um campo:*

*Nesse exemplo vou alterar a quantidade de caracteres que o campo "profissão"
pode ter, e remover a constraint `not null`.*****

***Exemplo:***

`alter table pessoas
mofify profissão varchar(30) default '';`

*O comando `modify` só permite alterar a estrutura do campo e suas constraints.*

* *Alterando o nome de um campo:*
  
*Para alterar o nome do campo usa-se o comando `change`, esse comando apaga toda estrutura 
do campo, sendo assim ao usa-lo deve-se definir novamente a estrutura para o campo, bem como
suas constraints.*

***Exemplo:***
 
`alter table pessoas 
change profissão prof varchar(30) not null default '';`

* *Adicionando um campo como chave primaria:*
  
`alter table pessoas add primary key(nome_do_campo);`

* *Alterando o nome da tabela:*
  
`alter table pessoas rename to Gafanhotos;`
