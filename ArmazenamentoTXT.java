import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArmazenamentoTXT extends FormatoArmazenamento {
    @Override
    public void armazenarDados(ArrayList<Produto> produtos) {
        try {
            
            FileWriter writer = new FileWriter("produtos.txt");

            // Escreve o cabeçalho formatado
            writer.write("ID\tQuantidade\tPrecoUnitario\tPrecoTotal\n");

            for (Produto produto : produtos) {
                String idFormatado = String.format("%d\t", produto.getId());
                String qtdeFormatado = String.format("%d\t", produto.getQtde());
                String precoUnitarioFormatado = String.format("%.2f\t", produto.getPrecoUnitario());
                String precoTotalFormatado = String.format("%.2f\t", produto.getPrecoTotal());

                writer.write(idFormatado + qtdeFormatado + precoUnitarioFormatado + precoTotalFormatado + "\n");
            }

            writer.close();
            System.out.println("Produtos armazenados em formato TXT.");
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo TXT.");
            e.printStackTrace();
        }
    }
}