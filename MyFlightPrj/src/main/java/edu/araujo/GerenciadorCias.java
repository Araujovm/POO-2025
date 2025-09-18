package edu.araujo;


import java.util.ArrayList;

public class GerenciadorCias {
	private ArrayList<CiaAerea> empresas;
	
	public GerenciadorCias() {
		empresas = new ArrayList<>();
	}

	public void addCia(CiaAerea cia){
		empresas.add(cia);
	}

	public String listarCias(){
		StringBuilder sb = new StringBuilder();
		sb.append("Lista empresas");
		sb.append("\n");
		
		for(CiaAerea cia:empresas){
			sb.append("Codigo: " + cia.getCodigo() + " Nome: "+ cia.getNome());
			sb.append("\n");

		}
		return sb.toString();
	}

	public CiaAerea buscarCodCia(String codigo){
		for(CiaAerea cia:empresas){
			if(cia.getCodigo().equals(codigo));
			return cia;
		}
		return null;
	}

	public CiaAerea buscarNomeCia(String nome){
		for(CiaAerea cia:empresas){
			if(cia.getNome().equals(nome)){
				return cia;
			}
		}
		return null;
	}
}
