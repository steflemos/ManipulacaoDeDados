# Manipulação de Dados

Este projeto tem como objetivo criar um sistema de manipulação de dados com três principais classes: `Produto`, `NotaFiscal`, e `Aplicação`. Aqui estão os detalhes:

## Classe `Produto`

A classe `Produto` é responsável por representar os itens que serão manipulados no sistema. Ela possui os seguintes atributos:

- `id` (int): O identificador único do produto.
- `qtde` (int): A quantidade do produto.
- `precoUnitario` (double): O preço unitário do produto.
- `precoTotal` (double): O preço total do produto, calculado como `qtde * precoUnitario`.

A classe `Produto` também possui os métodos getters e setters para acessar e modificar os atributos.

## Classe `NotaFiscal`

A classe `NotaFiscal` é responsável por gerar itens de produtos para uma nota fiscal. Ela permite adicionar produtos à nota fiscal e mantém uma lista de produtos.

## Classe `Aplicação`

A classe `Aplicação` é o ponto de entrada do sistema. Ela utiliza `ArrayList` e `Random` para criar objetos `Produto` com dados gerados aleatoriamente. Além disso, a aplicação oferece um menu para o usuário escolher se deseja armazenar os dados em formato CSV (com formatação de vírgula) ou TXT (com formatação tabular). Os métodos das classes `ArmazenamentoCSV` e `ArmazenamentoTXT` são chamados de acordo com a escolha do usuário.

## Classe `FormatoArmazenamento`

A classe abstrata `FormatoArmazenamento` serve como base para as classes `ArmazenamentoCSV` e `ArmazenamentoTXT`, que implementam o polimorfismo para armazenar os dados em disco nos formatos CSV e TXT, respectivamente.
