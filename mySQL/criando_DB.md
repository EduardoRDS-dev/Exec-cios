###criando banco de dados:
```
create database if not exists cadastro
default character set utf8
default collate utf8_general_ci;
```

* *O comando `create database` cria o **DB*** 


* *Os comandos `default character set utf8` e `default collate utf8_general_ci` são para
hábilitar o uso de caracteres acentuados no banco de dados.*
  

* *O comando `if not exists`
é uma medida de segurança que informa ao sql que banco de dados só deverá ser criado
caso o mesmo ainda não exista, assim evitando que um 'DB' com o mesmo nome e já criado,
seja sobrescrito.*

**Importante:**
* *Caso o comando `if not exists` não seja usado e existir um **DB**' com o mesmo nome
no sistema, o **'DB** já existente será sobrescrito, resultando na perda dos dados.*
  
###Definição de banco de dados:

"Um banco de dados é um conjunto de tabelas, tabela é um conjunto de campos, e campo
é um conjunto de registros.