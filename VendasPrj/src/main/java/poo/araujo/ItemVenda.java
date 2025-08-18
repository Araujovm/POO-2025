package poo.araujo;

public class ItemVenda {
    private int quant;
    private Produto prod;

    public ItemVenda(int umQuant, Produto umProd) {
        this.quant = umQuant;
    }

    public double getValor() {
        return prod.getPreco() * quant;
    }

    public String toString(){
        return String.format("%s \t %d \t R$ %.2f",
        prod.getNome(), quant, this.getValor());
    }
}