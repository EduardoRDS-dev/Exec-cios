package br.com.devdojo.strings;

public class StringsAnot {

 /*
 Anotação:
 1- Strings são imutáveis.

 Métodos muito úteis:
 1- Concatenar duas strings há duas formas de se fazer, e em questão de desempenho ambas são iguais:
 String nome = Eduardo;
 f1- nome += "Rodrigues";
 f2- nome = nome.concat("Rodrigues");
resultado f1= "Eduardo Rodrigues"
resultado f2= "Eduardo Rodrigues"

 2- Para identificar um  caractere que esta em determinada posição existe o método "charAt()", para usa-lo basta
 passar um índice, detalhe!: assim com um arrey o primeiro caractere de uma string possui o índice = '0'.
 Exemplo de uso:

 String teste = Eduardo;
 teste.charAt(0);
 resultado = 'E'

 3- Para comparar duas string usa-se o método "equals()", esse método faz distinção entre letras minúsculas e
 maiúsculas. exemplo de uso:

 String nome = Eduardo;
 String nome1 = eduardo;

 nome.equals(nome1);
 resultado = false

 para comparar duas strings e ignorar maiúsculas e minúsculas usa-se o método "equalsIgnoreCase".
 Exemplo de uso:

 String nome = Eduardo;
 String nome1 = eduardo;

 nome.equalsIgnoreCase(nome1);
 resultado = true

 4- Para saber o tamanho da string usa-se o método "length()". Exemplo de uso:
 String nome = Eduardo;
 nome.length();
 resultado = 7

 5- Para trocar um caractere de uma string usa-se o método "replace('','')" esse método faz distinção entre
 entre letra maiúsculas e minúsculas. Exemplo de uso:
 String teste = AAAAAA;
 teste.replace('A','O');
 resultado = "OOOOOO"

 6- Para passar toda a string para uppercase:
 String teste Naruto;
 teste.toUpperCase();
 resultado = "NARUTO"

 Para passar toda a string para lowercase:
 String teste Goku;
 teste.toLowerCase();
 resultado = "goku"

 7- pegar um apenas um pedaço da string usa-se o método "substring('','')" o primeiro parâmetro passado conta
 a string com o primeiro índice valendo 0, o segundo parâmetro conta a  string com o primeiro índice valendo 1.
 Exemplo de uso:

 String nome Eduardo;
 nome.substring('1','5');
 resultado = duar

 8- remover todos os espaços em branco do começo e do fim da string, usa-se o método "trim()". Exemplo de uso:
 String teste = "   Naruto   ";
 teste.trim();
 resultado = Naruto

 */


}
