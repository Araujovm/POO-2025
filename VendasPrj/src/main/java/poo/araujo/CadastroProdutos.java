package poo.araujo;

import java.util.ArrayList;

public class CadastroProdutos {
    private static CadastroProdutos instance;

    public static CadastroProdutos getInstace() {
        if (instance == null) {
            instance = new CadastroProdutos();
        }
        return instance;
    }

    private ArrayList<Produto> listProd;

    public CadastroProdutos() {
        listProd = new ArrayList<>();
    }

    public void cadastrar(Produto p) {
        listProd.add(p);
    }

    public Produto pesquisar(int cod) {
        // for(int i= 0; i<listProd.size();i++){
        // Produto p = listProd.get(i);
        // }
        // return p;
        for (Produto p : listProd) {
            if (p.getCodigo() == cod) {
                return p;
            }
        }
        return null;
    }

    public void cadastrar(int cod, String nome, double preco) {
        listProd.add(new Produto(cod, nome, preco));
    }

    public String toString() {
        StringBuilder res = new StringBuilder("Cadastro Produtos\n");
        for (int i = 0; i < listProd.size(); i++) {
            Produto p = listProd.get(i);
            res.append(p.toString());
            res.append("\n");
        }
        return res.toString();
    }
}
