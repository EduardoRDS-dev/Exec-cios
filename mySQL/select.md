###Comando `select`

* *Selecionar todos os campos:*

  `select * from pessoas;`


* *Selecionar campos específicos de uma tabela:*

    `select nome, nascimento from pessoas;`

* *Ordenar o resultado de busca:*
  comando para ordenar o resultado: `order by`
  **Exemplo de uso:**
  
  `select * from pessoas order by nascimento, nome;`


* *Usando o comando `where`" junto com o `select` para buscar linhas com valores específicos:*

	`select * from pessoas where peso = '80' order by nome, peso;`
  

* *Operadores lógicos para se usar com o comando: `where`:*	  
  * operador: `=` ***igual***
  * operador: `!=` ***diferente***
  * operador: `>` ***maior***
  * operador: `<` ***menor***
  * operador: `>=` ***maior e igual***
  * operador: `<= ***menor e igual***
  * operador: `between` ***entre faixas de valores***
  * operador: `like` ***semelhante***
  * operador: `in` ***faixas de valores específicos***	
    

* *Operador `between`, ***Exemplo de uso***:
```  
select nome,peso from pessoas 
where peso between '50' and '90'
order by peso, nome;
```

* *Operador `like`, ***Exemplo de uso:****
```
select nome,nascimento from pessoas
where nome like 'silva'
order by nascimento,nome;
```
***Detalhe***:
Ao usar o operador "like" você pode adicionar um: `%`, para substituir 
um ou vários caracteres, para substituir apenas um caractere o parâmetro é: `_`

* *Operador `like` ***Exemplo de uso:****
		
  
*Objetivo deste exemplo é encontrar todas as pessoas que tenham "Silva" no nome
  para exemplificar o uso do parâmetro:`%`.*

`select * from pessoas	
where nome like '%silva%'	
order by nome;`