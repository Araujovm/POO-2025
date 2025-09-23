package edu.araujo;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class VooEscalas extends Voo {

    private ArrayList<Rota> rotas;

    private Duration duracao;
	private Rota rota;

    public VooEscalas(ArrayList<Rota> rotas, LocalDateTime datahora, Duration duracao) {
        // Considerando que VooEscalas espera: Rota rota, Rota rotaFinal, LocalDateTime datahora, Duration duracao
        super(datahora);
        this.rotas = rotas;
         long tempoTotalMin = 0;
        for (Rota rota : rotas) {
            double distancia = Geo.distancia(rota.getOrigem().getLocal(), rota.getDestino().getLocal());
            double tempoHoras = distancia / 805.0;
            tempoTotalMin += Math.round(tempoHoras * 60) + 30;
        }
        this.duracao = Duration.ofMinutes(tempoTotalMin);
    }

    @Override
    public Rota getRota() {
		return rota;
	}
	@Override
	public Duration getDuracao() {
		return duracao;
	}

    public ArrayList<Rota> getRotas() {
        return rotas;
    }

    

    @Override
    public String toString(){
        int i = 1;
        StringBuilder sb = new StringBuilder();
        sb.append("\nTeste VooEscalas:\n");
        sb.append("Data e Horario: ").append(getDatahora()).append(" Duração: ").append(getDuracao()).append("\n");
        for(Rota r:rotas){
            sb.append("Rota ").append(i).append(" : ").append(r)
                    .append("\n");
                i++;
        }
        return sb.toString();
    }
}
