package poo.araujo;

import java.util.ArrayList;

public class CadastroProdutos {
    private static CadastroProdutos instance;

    public static CadastroProdutos getInstace(){
        if (instance ==null){
            instance = new CadastroProdutos();
        }
        return instance;
    }

private ArrayList<Produto> listProd;

private CadastroProdutos(){
    listProd = new ArrayList<>();
}
public void cadastrar(Produto p){
    listProd.add(p);
}
public void cadastrar(int cod,String nome, double preco){
    listProd.add(new Produto(cod, nome, preco));
}
}
