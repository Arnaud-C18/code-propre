package ex1;

import java.util.Date;

/** Représente une entreprise */
public class Entreprise {

	/** Numero de SIRET */
	public int siret;

	/** Nom */
	public String nom;

	/** Adresse */
	public String adresse;

	/** Date de création */
	public Date dateCreation;

	/** Capital maximum de l'entreprise */
	public static final int CAPITAL_MAX = 3000000;

	/** Affichage du statut de l'entreprise */
	public void afficherStatut(){
		System.out.println(siret + " " + nom + " " + adresse + " " + dateCreation);
		
	}
	
}
