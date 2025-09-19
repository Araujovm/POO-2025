package edu.araujo;

import java.time.Duration;

public class App {

	public static void main(String[] args) {
		
		Aeronave a1 = new Aeronave("251","cu",45);
		GerenciadorAeronaves g = new GerenciadorAeronaves();
		g.addAeronave(a1);
		System.out.println(g.listarAeronaves());
		System.out.println("\n");

		CiaAerea c1 = new CiaAerea("7890", "Docinhos da Vovo");
		GerenciadorCias Gc = new GerenciadorCias();
		Gc.addCia(c1);
		System.out.println(Gc.listarCias());

		Geo l1 = new Geo(25, 33);
		Geo l2 = new Geo(66,56);
		Aeroporto p1 = new Aeroporto("671", "Marcos Aurelio",l1);
		Aeroporto p2 = new Aeroporto("456", "Augustini", l2);
		GerenciadorAeroportos angar = new GerenciadorAeroportos();
		angar.addAeroP(p1);
		angar.addAeroP(p2);
		System.out.println(angar.listarAeroportos());

		Rota r = new Rota(c1, p1, p2, a1);
		Duration duracao1 = Duration.ofMinutes(170);
		java.time.LocalDateTime dataVoo1 = java.time.LocalDateTime.of(2016, 8, 12, 12, 0);
		Voo v1 = new Voo(r, dataVoo1, duracao1);
		GerenciadorVoos Gv1 = new GerenciadorVoos();
		Gv1.addVoo(v1);
		System.out.println(Gv1.listarVoos());
		;














	}
}
