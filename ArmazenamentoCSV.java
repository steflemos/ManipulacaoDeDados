import java.util.ArrayList;

public class ArmazenamentoCSV extends FormatoArmazenamento {
    @Override
    public void armazenarDados(ArrayList<Produto> produtos) {
        System.out.println("ID\tQuantidade\tPrecoUnitario\tPrecoTotal");

        for (Produto produto : produtos) {
            String idFormatado = String.format("%d\t", produto.getId());
            String qtdeFormatado = String.format("%-11d\t", produto.getQtde());
            String precoUnitarioFormatado = String.format("%.2f\t\t", produto.getPrecoUnitario());
            String precoTotalFormatado = String.format("%.2f\t", produto.getPrecoTotal());

            System.out.println(idFormatado + qtdeFormatado + precoUnitarioFormatado + precoTotalFormatado);
        }

        System.out.println("Produtos armazenados em formato de impressão no terminal.");
    }
}

