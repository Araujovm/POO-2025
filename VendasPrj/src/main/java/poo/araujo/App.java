package poo.araujo;

public class App {
    public static void main(String[] args) {
        Produto p1 = new Produto(15, "iphone", 2000.0);
        System.out.println(p1.toString());
        CadastroProdutos cadprod = CadastroProdutos.getInstace();

        cadprod.cadastrar(p1);
        CadastroProdutos cadProd = new CadastroProdutos();
        cadProd.cadastrar(123, "vini", 0.5);
        cadProd.cadastrar(24, "fran", 10);
        System.out.println("\n");
        System.out.println(cadProd.toString());
        System.out.println("");

        Produto p = cadProd.pesquisar(24);
        if (p != null) {
            System.out.println("Achou: " + p.toString());
            ItemVenda iv1 = new ItemVenda(10, p);
            System.out.println("IntemVenda: " + iv1.toString());
        } else {
            System.out.println("Produto 24 nao esta cadastrado");
        }
    }
}
