import java.util.ArrayList;
public class NotaFiscal {
    private ArrayList<Produto> itens;

    public NotaFiscal() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Produto produto) {
        itens.add(produto);
    }

    public ArrayList<Produto> getItens() {
        return itens;
    }
}
