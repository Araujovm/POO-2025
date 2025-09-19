package edu.araujo;

import java.util.ArrayList;

public class GerenciadorRotas {

    private ArrayList<Rota> rotas;

    public GerenciadorRotas(){
        rotas = new ArrayList<>();
    }
    
    public void addRota(Rota r){
        rotas.add(r);
    }

    public String listarRotas(){
        StringBuilder sb = new StringBuilder();

        sb.append("Lista das Rotas")
            .append("\n");
        for(Rota r:rotas){
            sb.append("CIA: " + r.getCia() + " Origem: " + r.getOrigem() + " Destino: " + r.getDestino() + "Aeronave: " + r.getAeronave())
                .append("\n");
        }
        return sb.toString();
    }

    public Rota buscarPorOrigem(Aeroporto origem){
        
        for(Rota r:rotas){
            if(r.getOrigem().equals(origem)){
                return r;
            }
        }
        return null;
    }
}
