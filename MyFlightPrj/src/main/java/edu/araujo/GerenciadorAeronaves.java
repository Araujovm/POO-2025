package edu.araujo;

import java.util.ArrayList;

public class GerenciadorAeronaves {

    private ArrayList<Aeronave> aeronaves;

    public GerenciadorAeronaves(){
        aeronaves = new ArrayList<>();
    }

    public void addAeronave(Aeronave aeronave){
        aeronaves.add(aeronave);
    }

    public String listarTodos(){
        StringBuilder sb = new StringBuilder();

        sb.append("Lista de aviões: ");
        sb.append("\n");
        for (Aeronave a:aeronaves){
            sb.append("Codigo: " + a.getCodigo() + " Descrição: "+ a.getDescricao() + " Capacidade: " + a.getCapacidade());
            sb.append("\n");
        }
        return sb.toString();
    }

    public Aeronave buscarPorCodigo(String codigo){
        for(Aeronave a:aeronaves){
            if(a.getCodigo().equals(codigo)){
                return a;
            }
        }
        return null;

    }



}
