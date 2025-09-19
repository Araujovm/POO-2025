package edu.araujo;

import java.util.ArrayList;

public class GerenciadorAeroportos {

    private ArrayList<Aeroporto> aeroP;

    public GerenciadorAeroportos(){
        aeroP = new ArrayList<>();

    }

    public void addAeroP(Aeroporto aeroporto){
        aeroP.add(aeroporto);
    }

    public String listarAeroportos(){
        StringBuilder sb = new StringBuilder();
        sb.append("Lista Aeroportos");
        sb.append("\n");

        for(Aeroporto a:aeroP){
            sb.append("Codigo: "+ a.getCodigo() + " Nome: " + a.getNome() + " Localização: " + a.getLocal())
                .append("\n");
        }
        return sb.toString();
    }

    public Aeroporto buscarAeroPorto(String codigo){
        for(Aeroporto a:aeroP){
            if(a.getCodigo().equals(codigo)){
                return a;
            }
        }
        return null;
    }
}
