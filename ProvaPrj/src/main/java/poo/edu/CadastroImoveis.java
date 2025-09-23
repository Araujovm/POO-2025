package poo.edu;

import java.util.ArrayList;

public class CadastroImoveis {

    ArrayList<Imovel> imoveis;

    public CadastroImoveis() {
        imoveis = new ArrayList<>();
    }

    public void addImovel(Imovel elem) {
        imoveis.add(elem);
    }

    public String listarImoveis() {
        double valorTotal = 0;
        StringBuilder sb = new StringBuilder();
        for (Imovel i : imoveis) {
            sb.append(i.toString());
            valorTotal = valorTotal + i.calculaImposto();
        }
        return sb.toString() + "Valor Total: " + valorTotal;
    }

    public String listarImoveis(String nome) {
        StringBuilder sb = new StringBuilder();
        for (Imovel i : imoveis) {
            if (nome.equals(i.getProprietario())) {
                sb.append(i.toString());
                if (i instanceof Residencial) {
                    sb.append("tipo: residencial");
                } else {
                    sb.append("tipo: comercial");
                }
            }
        }
        return sb.toString();
    }

}
