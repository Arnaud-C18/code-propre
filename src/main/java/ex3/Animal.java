package ex3;

/** Represente un animal */
public class Animal {

    /** type d'animal */
    protected String type;

    /** nom de l'animal */
    protected String nom;

    /** comportement de l'animal*/
    protected String comportement;

    /**Constructor
     *
     * @param nom nom de l'animal
     * @param type type d'animal
     * @param comportement comportement de l'animal
     */
    public Animal(String nom, String type, String comportement) {
        this.nom = nom;
        this.type = type;
        this.comportement = comportement;
    }
}
