package ex5;

import java.util.ArrayList;
import java.util.List;

public class Caisse {

	private String nom;
	private int tailleMin;
	private int tailleMax;
	private List<Item> items;

	/** Constructeur
	 * @param nom
	 */
	public Caisse(String nom, int tailleMin, int tailleMax) {
		super();
		this.nom = nom;
		this.tailleMin = tailleMin;
		this.tailleMax = tailleMax;
		this.items = new ArrayList<>();
	}

	/** Getter pour l'attribut nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**Getter
	 * @return tailleMin
	 */
	public int getTailleMin() {
		return tailleMin;
	}

	/**Setter
	 * @param tailleMin
	 */
	public void setTailleMin(int tailleMin) {
		this.tailleMin = tailleMin;
	}

	/**Getter
	 * @return tailleMax
	 */
	public int getTailleMax() {
		return tailleMax;
	}

	/**Setter
	 * @param tailleMax
	 */
	public void setTailleMax(int tailleMax) {
		this.tailleMax = tailleMax;
	}

	/** Setter pour l'attribut nom
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter pour l'attribut items
	 * @return the items
	 */
	public List<Item> getItems() {
		return items;
	}

	/** Setter pour l'attribut items
	 * @param items the items to set
	 */
	public void setItems(List<Item> items) {
		this.items = items;
	}
	
}
