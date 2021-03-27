###Criando uma tabela:

* *Comandos:*

```
create table if not exists pessoas(
id int not null auto_increment,
nome varchar(30) not null,
nascimento date not null,
sexo enum('M','F') not null,
peso decimal(5,2),
altura decimal(3,2),
nacionalidade varchar(20) default 'Brasil',
primary key(id)
)default charset = utf8;
```

* *O comando que irá criar a tabela de fato é: `create table nome_da_tabela( )`, os campos da
tabela, serão criados entre os: `()`, separados por: `,`.*


* *O comando: `default charset = utf8` é para permitir caracteres acentuados.*


* *O comando: `not null` informa que o campo não pode ser vazio.*


* *O comando: `auto_increment` adiciona um valor automaticamente para o campo.*


* *O comando: `primary key()` defini um campo da tabela como chave primaria.*


* *comando `default ''` ao ser usado na assinatura de um campo, serve para definir um
registro padrão para o campo caso ele não seja preenchido.*
  

* *Comando para ver a estrutura de dados da tabela:*

`discribe table "nome_da_tabela";`
