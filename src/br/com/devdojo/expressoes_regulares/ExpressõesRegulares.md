## Expressões Regulares

Regular expression ou regex, é um mecanismo de manipulação de informações baseada
em cadeias de caracteres, permitindo identificar de maneira precisa informações de 
interesse através de análises de padrões. Resumindo, expressões regulares são usadas 
para buscar e validar padrões dentro textos como um número de celular, CPF, RG etc.

O java contém em seu pacote **java.util.regex** às três principais class para a criação
de algoritmos que usam expressões regulares.

* Class Pattern:

### Declaração: ###
  `Pattern pattern = Pattern.compile();`

A class Pattern é responsável pela representação do padrão a ser compilado e utilizado nas
pesquisas, e recebe como argumento uma String, que contém a expressão desejada.

* Class Matcher

### Declaração: ###

```
Pattern pattern = Pattern.compile();
Matcher matcher = pattern.matcher();
```

A class matcher é responsável pelas operações de pesquisa e análise de cadeias de caracteres
de entrada, possibilitando a execução de buscas, retorno de resultados, extração de indices de
informações e dados agrupados. Para utilizar, deve-se obter uma referência de Matcher por meio 
do método `.matcher();` chamado por uma referência de Pattern.

