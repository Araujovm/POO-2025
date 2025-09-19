package edu.araujo;


public class CiaAerea {
	private String codigo;
	private String nome;
	
	public CiaAerea(String codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}	

	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Cia[Codigo: ").append(codigo)
			.append(", Nome: ").append(nome)
				.append("\n");
		return sb.toString();
	}
}
