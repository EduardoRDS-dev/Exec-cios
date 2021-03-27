###Inserindo dados na tabela:
* *Comandos:*
```
insert into pessoas(nome, nascimento, sexo, peso, altura, nacionalidade)
values('Amanda Silva','2000-04-15','F','54.6','1.53','Brasil'),
('Raquel Oliveira','2001-05-13','F','55.3','1.52','Brasil');
```

* *O comando pra inserir os dados na tabela:*

`insert into nome-da-tabela() values();`

* ***Detalhes:***

*Entre os: `()` ao lado do nome da tabela, vão os nomes dos campos,
e entre os: `()` ao lado do comando `values` vão os dados que serão
inseridos, Importante! Os valores devem estar na mesma ordem em que os
campos estão, separados por: `,` e entre: `''`. É possível
inserir dois ou mais objetos com apenas um comando `insert into`,
basta separa-los por `,`.*