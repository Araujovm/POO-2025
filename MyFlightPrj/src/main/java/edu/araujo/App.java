package edu.araujo;


public class App {

	public static void main(String[] args) {
		System.out.println("\nMyFlight project...");
		Aeronave a1 = new Aeronave("251","cu",45);
		GerenciadorAeronaves g = new GerenciadorAeronaves();
		g.addAeronave(a1);
		System.out.println(g.listarTodos());
	}
}
