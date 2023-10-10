
public class Produto {
    private int id;
    private int qtde;
    private double precoUnitario;
    private double precoTotal;

    public Produto(int id, int qtde, double precoUnitario) {
        this.id = id;
        this.qtde = qtde;
        this.precoUnitario = precoUnitario;
        this.precoTotal = qtde * precoUnitario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
        this.precoTotal = qtde * precoUnitario;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
        this.precoTotal = qtde * precoUnitario;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    @Override
    public String toString() {
        return "Produto [id=" + id + ", qtde=" + qtde + ", precoUnitario=" + precoUnitario + ", precoTotal="
                + precoTotal + "]";
    }
}