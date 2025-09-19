package edu.araujo;


public class Aeronave {
	private String codigo;
	private String descricao;
	private int capacidade;
	
	public Aeronave(String codigo, String descricao, int capacidade) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.capacidade = capacidade;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public int getCapacidade(){
		return capacidade;
	}

	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Aeronave=[codigo: ").append(codigo)
			.append(", Descrição: ").append(descricao)
				.append(", Capacidade: ").append(capacidade).append("]")
					.append("\n");
		return sb.toString();
	}
}
