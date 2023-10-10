import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            int id = i;
            int qtde = random.nextInt(10) + 1; // Quantidade aleatória entre 1 e 10
            double precoUnitario = random.nextDouble() * 100; // Preço unitário aleatório entre 0 e 100
            Produto produto = new Produto(id, qtde, precoUnitario);
            produtos.add(produto);
        }

        NotaFiscal notaFiscal = new NotaFiscal();
        notaFiscal.adicionarItem(produtos.get(0)); // Adiciona um produto à nota fiscal como exemplo

        System.out.println("Escolha o formato de armazenamento:");
        System.out.println("1. CSV");
        System.out.println("2. TXT");

        int escolha = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do scanner

        if (escolha == 1) {
            FormatoArmazenamento formatoCSV = new ArmazenamentoCSV();
            formatoCSV.armazenarDados(produtos);
            System.out.println("Dados armazenados em formato CSV.");
        } else if (escolha == 2) {
            FormatoArmazenamento formatoTXT = new ArmazenamentoTXT();
            formatoTXT.armazenarDados(produtos);
            System.out.println("Dados armazenados em formato TXT.");
        } else {
            System.out.println("Escolha inválida. Nenhum formato de armazenamento selecionado.");
        }

        scanner.close();
    }
}
