package edu.araujo;


import java.time.Duration;
import java.time.LocalDateTime;

public abstract class Voo {
	
	public enum Status { CONFIRMADO, ATRASADO, CANCELADO };
	
	private LocalDateTime datahora;
	private Status status;
	
	public Voo(LocalDateTime datahora) {
		this.datahora = datahora;
		this.status = Status.CONFIRMADO; // default é confirmado
	}
	
	public abstract Rota getRota();
	
	public LocalDateTime getDatahora() {
		return datahora;
	}
	
	public abstract Duration getDuracao();
	
	public Status getStatus() {
		return status;
	}
	
	public void setStatus(Status novo) {
		this.status = novo;
	}

	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Data e Horario: ").append(datahora)
			.append(" Duração: ").append(getDuracao())
				.append(" Status: ").append(status)
					.append(" Rota: ").append(getRota())
						.append("\n");
		return sb.toString();
	}
}
