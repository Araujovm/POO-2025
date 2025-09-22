package edu.araujo;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class VooDireto extends Voo{

    private Duration duracao;
	private Rota rota;

    public VooDireto(Rota rota, Duration duracao,LocalDateTime datahora){
	super(datahora);
    this.rota = rota;
    this.duracao = duracao;
    double distancia = Geo.distancia(rota.getOrigem().getLocal(), rota.getDestino().getLocal());
	double tempoHoras = distancia / 805.0;
	long tempoMin = Math.round(tempoHoras * 60) + 30;
	this.duracao = Duration.ofMinutes(tempoMin);
	}
	
    @Override
	public Rota getRota() {
		return rota;
	}
	@Override
	public Duration getDuracao() {
		return duracao;
	}
   

	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString()).append("\n");
		return sb.toString();
	}
}
