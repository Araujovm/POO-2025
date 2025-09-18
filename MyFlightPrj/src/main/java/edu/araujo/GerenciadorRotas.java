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

        sb.append("Lista das Rotas");
        sb.append("\n");
        for(Rota r:rotas){
            sb.append("CIA: " + r.getCia() + " Origem: " + r.getOrigem() + " Destino" + r.getDestino() + "Aeronave: " + r.getAeronave());
            sb.append("\n");
        }
        return sb.toString();
    }

    public Rota buscarPorOrigem(String origem){
        
        for(Rota r:rotas){
            if(r.getOrigem().equals(origem)){
                return r;
            }
        }
        return null;
    }
}
