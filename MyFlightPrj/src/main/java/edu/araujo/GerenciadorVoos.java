package edu.araujo;
import java.time.LocalDate;
import java.util.ArrayList;

public class GerenciadorVoos {

    private ArrayList<Voo> voos;

    public GerenciadorVoos(){
        voos = new ArrayList<>();
    }

    public void addVoo(Voo v){
        voos.add(v);
    }

    public String listarVoos(){
        StringBuilder sb = new StringBuilder();

        sb.append("Lista Voos:");
        sb.append("\n");

        for(Voo v:voos){
            sb.append("Rota: " + v.getRota() + "Data Hora: " + v.getDatahora() + " Duração: " + v.getDuracao() + " Status: " + v.getStatus());
            sb.append("\n");
        }
        return sb.toString();
    }

    public Voo buscarData(LocalDate data){
        for(Voo v : voos){
            if(v.getDatahora().toLocalDate().equals(data)){
                return v;
            }
        }
        return null;
    }








}
