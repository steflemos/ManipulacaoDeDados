<body>
    <h1>Manipulação de Dados</h1>
    <p>A classe <code>Produto</code> foi criada com os seguintes atributos privados:</p>
       <ul>
        <li><code>int id</code></li>
        <li><code>int qtde</code></li>
        <li><code>double precoUnitario</code></li>
        <li><code>double precoTotal</code></li>
    </ul>
    <p>Foram implementados os métodos <code>getters</code> e <code>setters</code>, e o preço total é calculado como a multiplicação da quantidade (<code>qtde</code>) pelo preço unitário (<code>precoUnitario</code>).</p>
    <h2>Classe NotaFiscal</h2>
    <p>A classe <code>NotaFiscal</code> foi criada para gerar os itens dos objetos da Nota Fiscal. Utiliza-se a classe <code>Random</code> na classe <code>Aplicação</code> para gerar itens aleatórios.</p>
    <h2>Classe Aplicação</h2>
    <p>A classe <code>Aplicação</code> utiliza <code>ArrayList</code> e <code>Random</code> para criar objetos da classe <code>Produto</code>. Além disso, ela oferece um menu interativo ao usuário, permitindo escolher se deseja armazenar os dados gerados aleatoriamente em formato CSV (formatação com vírgula) ou TXT (formatação tabular).</p>
    <h2>Classe GerarItensDaNotaFiscal</h2>
    <p>Nesta classe, é utilizado o polimorfismo para armazenar em disco os dados em formato CSV e TXT.</p>
    <p>Para mais detalhes sobre a implementação e o funcionamento dessas classes, consulte o código-fonte no repositório.</p>
</body>
