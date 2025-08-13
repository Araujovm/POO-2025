package poo.araujo;

public class App {
    public static void main(String[] args) {
        Produto p1 = new Produto(15,"iphone",2000.0);
        System.out.println(p1.toString());
        CadastroProdutos cadprod = CadastroProdutos.getInstace();

        cadprod.cadastrar(p1);
}
}