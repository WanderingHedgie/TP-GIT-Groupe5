package nintendo.model;

import java.time.LocalDate;

public class Hybride extends Console{

	private String nom;
	private double prix;
	private LocalDate dateSortie;

	public Hybride(String nom, double prix, LocalDate dateSortie) {
		super(nom, prix, dateSortie);
	}

	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public LocalDate getDateSortie() {
		return dateSortie;
	}

	public void setDateSortie(LocalDate dateSortie) {
		this.dateSortie = dateSortie;
	}

	@Override
	public String toString() {
		return "Salon [nom=" + nom + ", prix=" + prix + ", dateSortie=" + dateSortie + "]";
	}
		
		
		
	
	
	
	}


