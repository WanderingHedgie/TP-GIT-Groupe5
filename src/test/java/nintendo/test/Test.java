package nintendo.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import nintendo.model.Achat;
import nintendo.model.Boutique;
import nintendo.model.Client;
import nintendo.model.Console;
import nintendo.model.Jeu;
import nintendo.model.Portable;

public class Test {

	public static void main(String[] args) {
		// ~~~~ CONSOLES ~~~~
		Console console1 = new Portable("Switch",200,LocalDate.parse("2017-03-03"));

		// ~~~~ JEUX ~~~~
		Jeu jeu1 = new Jeu("Zelda X", console1, "Star Mania", "9", "rue Paradis", "Pontarlier");
		Jeu jeu2 = new Jeu("Animal Crossing: New Horizons", console1,"MicroMania", "84", "Avenue du Prado", "Marseille");
		Jeu jeu3 = new Jeu("Mario Kart 8 Deluxe", console1, "MicroMania", "84", "Avenue du Prado", "Marseille");
		Jeu jeu4 = new Jeu("New Super Mario Bros. U Deluxe", console1,"MicroMania", "84", "Avenue du Prado", "Marseille");
		Jeu jeu5 = new Jeu("It Takes Two", console1, "Star Mania", "9", "rue Paradis", "Pontarlier");

		// ~~~~ CLIENTS ~~~~
		Client cli1 = new Client("Durand","Noemie");
		Client cli2 = new Client("Harris","Clinton");
		Client cli3 = new Client("Miyamoto", "Shigeru");

		// ~~~~ BOUTIQUES ~~~~
		Boutique bout1 = new Boutique("Nintendo Shop", "15", "Avenue Siri", "Paris");
		
		
		
		// ~~~~ ACHATS ~~~~
		List<Achat> achats = new ArrayList<>();
		
		Achat achat1 = new Achat(jeu2, LocalDate.parse("2026-09-30"), 15);
		Achat achat2 = new Achat(jeu4, LocalDate.parse("2026-09-30"), 15);

		Collections.addAll(achats, achat1, achat2);
		cli1.setAchats(achats);
		
	}
}
