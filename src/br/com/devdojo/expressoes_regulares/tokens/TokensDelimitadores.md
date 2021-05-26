## Tokens e delimitadores
Resumindo, tokens são palavras, números ou símbolos de um texto que são tratados separadamente, 
e os delimitadores são caracteres usados para separa-lós, um delimitador pode ser uma `,`, um 
espaço em branco ` ` até mesmo um regex pode ser usado.

Exemplo:

`String tokens = "Fernando,Bianca,2021,%%*!@$,";` 

 Os tokens da String acima são:
1. Fernanda
1. Bianca
1. 2021
1. %%*!@$

e seu delimitador é uma: `,`.

## Tokens com a class String:
A forma simples de se tratar tokens é com a class String, porém esta class trata todos os tokens.
como uma String, caso o token seja um inteiro ou de outro tipo a conversão ficar por conta do dev.

Exemplo de uso:

```
String nomes = "Maria Ana Carol Alexandra Fernanda Cristina Bruna Karine ";
String [] tokens = nome.split(" ");

for(String aux: tokens){
    System.out.println(aux.trim());
}
```
O método `.split();` da class String recebe uma String ou um regex para usar como delimitador, e 
retorna um arrey de Strings. Para fazer a leitura do arrey do exemplo acima foi usado um `for`,
o método `trim();` da class String é usado para eliminar os espaços em brando dos tokens.

## Tokens com a class Scanner:
A class Scanner é mais versátil para tratar tokens, sendo possível identificar os tipos de cada
token e fazer a conversão sem grandes problemas, além de ter o construtor sobrecarregado para 
receber vários tipos de entrada dês de uma String ao um aquivo ou uma Stream. 

Exemplo de uso:

```
Scanner scanner = new Scanner("true 111 Alexandra");
while(scanner.hasNext()){
    if(scanner.hasNextInt()){
        int i = scanner.nextInt();
    }else if(scanner.hasNextBoolean()){
        boolean b = scanner.nextBoolean();    
    }else{
        String s = scanner.next();
    }
}
```
O método `.hasNext();` da class Scanner procura por índices dentro da String passada e trata por 
padrão os valores encontrados em cada índice como String, já o método `hasNextInt()` procura por 
valores do tipo `int`, o mesmo é verdade para procurar outros tipos como `hasNextBoolean();` que 
procura por valores do tipos `boolean`. No exemplo acima fiz um filtro para separa e os tipos de 
valores encontrados na String passada para o objeto scanner, assim é possível pegar esses valores 
já convertidos.

*Detalhe!: O método `.hasNext();` considera tudo valor como String, sendo assim, deixei ele na última posição
do filtro que fiz com os laços condicionais, caso contrario todos os valores `int` e `boolean`
seriam considerados Strings.*


