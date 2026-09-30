package nintendo.model;

public class Jeu {

	private String titre;
	private Console console;
	private Boutique boutique;
	
	
<<<<<<< Updated upstream
	public Jeu(String titre, Console console, String nom, String numero, String rue, String ville) {
		this.titre = titre;
		this.console = console;
		this.boutique = new Boutique(nom, numero, rue, ville);
=======
	public Jeu(String titre, Console console, Boutique boutique) {
		this.titre = titre;
		this.console = console;
		this.boutique = boutique;
>>>>>>> Stashed changes
	}


	public Jeu(String titre, Console console) {
		this.titre = titre;
		this.console = console;
	
	}

	public String getTitre() {
		return titre;
	}



	public void setTitre(String titre) {
		this.titre = titre;
	}



	public Console getConsole() {
		return console;
	}



	public void setConsole(Console console) {
		this.console = console;
	}



	public Boutique getBoutique() {
		return boutique;
	}



	public void setBoutique(Boutique boutique) {
		this.boutique = boutique;
	}



	@Override
	public String toString() {
		return "Jeu [titre=" + titre + ", console=" + console + ", boutique=" + boutique + "]";
	}
	
	
}
