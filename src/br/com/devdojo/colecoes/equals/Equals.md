## Método `equals();`
Este é um método da class `Objects`, este método compara dois objetos usando o operador `==`, 
isso significa que ele compara se o objeto X aponta para o mesmo lugar na memória que o objeto Y,
`x.equals(y);`. 

**Detalhe!:** Caso dois objetos sejam iguais, mas não apontem para o mesmo lugar na memória, esta
forma de comparar usando o operador `==` retorna o resultado da comparação com `false`, Ex: 
```
private String nome = "Maria"
private String nome1 = new String("Maria");

if(nome == nome1){
    System.out.println("true");
}else{
    System.out.println("false");
}
resultado: false
```
No exemplo acima o resultado é `false`, mesmo os nomes sendo exatamente iguais, porque o objeto `nome`
e `nome1` não estão apontando para o mesmo endereço de memória. O método `equals()` funciona desta forma
por padrão ao ser herdado, no caso class criadas por você para usar em seu projeto vem com essa implementação padrão
do método, mas pode ser sobrescrito para comparar os objetos de alguma outra forma, ao invés de conferir se
eles estão apontando para o mesmo endereço na memória. Classes como String, Integer, etc já tem o método 
sobrescrito, mudando a forma com que os objetos são comparados.

### Regras para a sobrescrita do método `equals();`

* **Reflexivo**
  * D
    

* **Simétrico**
  * 


* **Transitividade**
  * 


* **Consistente**
  * 