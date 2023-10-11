import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class ArmazenamentoCSV extends FormatoArmazenamento {
    @Override
    public void armazenarDados(ArrayList<Produto> produtos) {
        try {
            FileWriter writer = new FileWriter("produtos.csv");

            // Escreve o cabeçalho formatado
            writer.write("ID\tQuantidade\tPrecoUnitario\tPrecoTotal\n");

            for (Produto produto : produtos) {
                // Formata os números com duas casas decimais e largura fixa
                String idFormatado = String.format("%-2d", produto.getId());
                String qtdeFormatado = String.format("%-11d", produto.getQtde());
                String precoUnitarioFormatado = String.format("%-15.2f", produto.getPrecoUnitario());
                String precoTotalFormatado = String.format("%-11.2f", produto.getPrecoTotal());

                writer.write(idFormatado + qtdeFormatado + precoUnitarioFormatado + precoTotalFormatado + "\n");
            }

            writer.close();
            System.out.println("Produtos armazenados em formato CSV.");
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo CSV.");
            e.printStackTrace();
        }
    }
}