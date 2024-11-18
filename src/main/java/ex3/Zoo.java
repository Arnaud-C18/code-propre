package ex3;

import java.util.ArrayList;

public class Zoo {

	/** nom du zoo */
    private String nom;

	/** liste des animaux presents dans le zoo */
	ArrayList<Animal> listeAnimaux = new ArrayList<>();


    public Zoo(String nom) {
        this.nom = nom;
    }

    /**Ajouter un animal a la liste du zoo
     *
     * @param nom nom de l'animal
     * @param type type d'animal
     * @param comportement comportement de l'animal
     */
    public void addAnimal(String nom, String type, String comportement) {
        listeAnimaux.add(new Animal(nom, type, comportement));
    }

    /** Afficher la liste des animaux presents dans le zoo */
    public void afficherListeAnimaux() {
		for ( Animal animal : listeAnimaux) {
			System.out.println(animal.nom + " " + animal.type + " " + animal.comportement);
		}
    }

    /**Getter
	 * @return le nom
     */
    public String getNom() {
        return nom;
    }

    /**Setter
	 * @param nom le nom a modifier
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
}