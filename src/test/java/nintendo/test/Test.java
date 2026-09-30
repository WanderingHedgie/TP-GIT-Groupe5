package nintendo.test;

import nintendo.model.Boutique;
import nintendo.model.Client;
import nintendo.model.Console;
import nintendo.model.Jeu;

public class Test {

	public static void main(String[] args) {
		Console console1 = new Console("Switch");
		Jeu jeu1 = new Jeu("Zelda X", console1);
		Jeu jeu2 = new Jeu("Animal Crossing: New Horizons", console1);
		Jeu jeu3 = new Jeu("Mario Kart 8 Deluxe", console1);
		Jeu jeu4 = new Jeu("New Super Mario Bros. U Deluxe", console1);
		Jeu jeu5 = new Jeu("It Takes Two", console1);
		
		Boutique bout1 = new Boutique("Nintendo Shop", "15", "Avenue Siri", "Paris");
		Client cli1 = new Client("Durand","Noemie");
		Client cli2 = new Client("Harris","Clinton");
	}
}
