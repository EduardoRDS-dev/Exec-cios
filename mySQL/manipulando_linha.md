###Atualizando registro:

* *Para atualizar um registro usa-se o comando `update` acompanhado do nome da table que o contém.
Em seguida usa-se o comando `set ` acompanhado do nome do campo que será atualizado.*

***Exemplo:***

`update pessoas
set nome = 'Eduardo Santos', peso = '84'
where id = 1
limit = 1`

*Caso queira atualizar mais de um campo da mesma linha, basta separa-los com o uso de: `,`.*


***Exemplo atualizando nome e peso:***

`set nome = 'Eduardo Rodrigues Dos Santos, peso = '85'`

*Para selecionar a linha que contém o registro há ser atualizado, basta usar o comando `where`
seguido de um campo com o registro, que possa identificar a linha, ***Ex:*** `primary key`,
caso use um campo que possa ter dois ou mais registros iguais, como nome ou peso, todos
esses serão atualizados com os dados que você passo, mas caso queira limitar a ação
para apenas uma linha, basta utilizar o comando `limit =` seguido da quantidade
de linhas que deseja afetar.*

***Exemplo com uso de chave primaria:***

`update pessoas 	
set nome = 'Eduardo Santos', profissão = 'programador'	
where id = 1;`

*neste caso apenas a linha que contém a chave primaria com o registro = 1, será afetada.*


* *Deletando linhas:*
  
*Para deletar uma linha basta usar o comando: `delete from` seguido do nome da tabela, e
o comando `where` seguido do campo com o registro que identifique a linha.*

***Exemplo:***

`delete from pessoas where id = 1;`


* *Deletando todas as linhas de uma tabela:*
  
`truncate table pessoas;`
