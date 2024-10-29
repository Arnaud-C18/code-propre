package ex2;

/** Extension de la classe CompteBancaire qui représente un livret A */
public class LivretA extends CompteBancaire {

	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;

	public LivretA(double solde, double tauxRemuneration) {
		super("LA", solde);
		this.tauxRemuneration = tauxRemuneration;
	}

	public void appliquerRemuAnnuelle(){
		this.solde = solde + solde*tauxRemuneration/100;
	}

	/** Ajoute un montant au solde
	 * @param montant
	 */
	public void debiterMontant(double montant){
		if (this.solde - montant > 0) {
			this.solde = solde - montant;
		}
	}

	/** Getter
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/** Setter
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

}
