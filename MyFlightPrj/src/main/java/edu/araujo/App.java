package edu.araujo;

import java.time.Duration;
import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		Aeronave a1 = new Aeronave("251","cu",45);
		Aeronave a2 = new Aeronave("252","cacete",39);
		Aeronave a3 = new Aeronave("253","pau",89);
		GerenciadorAeronaves g = new GerenciadorAeronaves();
		g.addAeronave(a1);
		g.addAeronave(a2);
		g.addAeronave(a3);
		System.out.println(g.listarAeronaves());
		System.out.println("\n");

		CiaAerea c1 = new CiaAerea("7890", "Docinhos da Vovo");
		GerenciadorCias Gc = new GerenciadorCias();
		Gc.addCia(c1);
		System.out.println(Gc.listarCias());

		// Testar Gerenciador de aeoroportos
		Geo l1 = new Geo(25, 33);
		Geo l2 = new Geo(66,56);
		Geo l3 = new Geo(42,24);
		Geo l4 = new Geo(21,278);
		Aeroporto p1 = new Aeroporto("671", "Marcos Aurelio",l1);
		Aeroporto p2 = new Aeroporto("456", "Agustini", l2);
		Aeroporto p3 = new Aeroporto("4569", "Ana Paula", l3);
		Aeroporto p4 = new Aeroporto("2231", "Nelson", l4);	
		GerenciadorAeroportos angar = new GerenciadorAeroportos();
		angar.addAeroP(p1);
		angar.addAeroP(p2);
		angar.addAeroP(p3);
		angar.addAeroP(p4);
		System.out.println(angar.listarAeroportos());

		// Teste Gerenciador de Voos
		Rota r1 = new Rota(c1, p1, p2, a1);
		Duration duracao1 = Duration.ofMinutes(170);
		java.time.LocalDateTime dataVoo1 = java.time.LocalDateTime.of(2016, 8, 12, 12, 0);
		Voo v1 = new VooDireto(r1, duracao1, dataVoo1);

		GerenciadorVoos Gv1 = new GerenciadorVoos();
		Gv1.addVoo(v1);
		System.out.println(Gv1.listarVoos());

		// Teste de VooVariasEscalas e VooEscalas
		ArrayList<Rota> rotas = new ArrayList<>();
		Rota r2 = new Rota(c1, p2, p3, a2);
		Rota r3 = new Rota(c1, p3, p4, a3);
		rotas.add(r1);
		rotas.add(r2);
		rotas.add(r3);

		VooEscalas vooMulti = new VooEscalas(rotas, dataVoo1, duracao1);
		
		System.out.println(vooMulti);
		
		// Teste de distância entre p1 e p3
		double distanciaP1P3 = p1.getLocal().distancia(p3.getLocal());
		System.out.printf("Distância entre %s e %s: %.2f km\n", p1.getNome(), p3.getNome(), distanciaP1P3);















	}
}
