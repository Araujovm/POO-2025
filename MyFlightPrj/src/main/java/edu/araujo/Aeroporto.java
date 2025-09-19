package edu.araujo;


public class Aeroporto {
	private String codigo;
	private String nome;
	private Geo loc;
	
	public Aeroporto(String codigo, String nome, Geo loc) {
		this.codigo = codigo;
		this.nome = nome;
		this.loc = loc;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Geo getLocal() {
		return loc;
	}

	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Aeroporto[codigo: ").append(codigo)
		  	.append(", nome: ").append(nome)
		  		.append(", local: ").append(loc).append("]")
					.append("\n");
		return sb.toString();
	}
}
