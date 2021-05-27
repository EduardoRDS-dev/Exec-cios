## Class ResourceBundle
Tem o objetivo de facilitar a internacionalização do software, usando esse estrategia todas
as mensagens do sistema ficam armazenadas em um arquivo com extensão `.properties`, a regra 
para criar o arquivo é que o mesmo deve ter em seu nome as siglas do país e lingua seguido 
o padrão definido pela iso 639, e deve ser criado no diretório `src`.

Exemplo: "message_en_US.properties"

Exemplo de uso:

```
ResourceBundle resourceBundle = ResourceBundle.getBundle("message",new Locale("en","US"));
System.out.println(resourceBundle.getString("hello.world"));
```
Os primeiro argumento a ser passado para o método `.getBundle();`é o base name, que é o 
primeiro nome do arquivo criado com a extensão `.properties`, o segundo é um objeto da 
class Locale configurado com o país e lingua desejado, para que a saida de mensagens do 
sistema corresponda.

O método `.getString();` da class ResourceBundle recebe uma key já criada dentro do 
arquivo com a extensão `.properties`, e a key referência uma mensagem, *detalhe!* 
caso a key passada não exita ocorrerá um erro em tempo de execução.

Exemplo de mensagens:

```
# comentário
!mensagens
hello.world = hello world
welcome = welcome
```

Do lado esquerdo temos as keys e do lado direito as mensagens que elas fazem referência. 
Para fazer um comentário dentro deste aquivo basta usar o `#` ou `!`

Para traduzir as mensagens, basta criar um novo arquivo `.properties` e editar as mensagens
deste novo aquivo para a lingua desejada, mantendo as keys iguais.

Exemplo:

```
# comentário
!mensagens
hello.world = olá mundo!
welcome = bem vindo!
```
Agora ao usar a ResourceBundle basta passar o argumento locale configurado para a lingua 
e país desejado que as mensagens serão traduzidas.

Exemplo:

```
ResourceBundle resourceBundle = ResourceBundle.getBundle("message",new Locale("pt","BR"));
System.out.println(resourceBundle.getString("hello.world"));
```