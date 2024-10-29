package ex2;

/** Représente un compte bancaire de type compte courant (type=CC) ou livret A (type=LA)
 * @author DIGINAMIC
 */
abstract class CompteBancaire {

	/** type de compte, Compte courant "CC" ou Livret A "LA" */
	protected String type;

	/** solde : solde du compte */
	protected double solde;

	/**  Constructor
	 * @param type
	 * @param solde
	 */
	public CompteBancaire(String type, double solde) {
		this.type = type;
		this.solde = solde;
	}

	/** ajouter un montant au solde
	 * @param montant montant de l'operation
	 */
	public void ajouterMontant(double montant){
		this.solde += montant;
	}
	
	/** debiter un montant au solde
	 * @param montant montant de l'operation
	 */
	public abstract void debiterMontant(double montant);
	
	/** Getter
	 * @return le solde
	 */
	public double getSolde() {
		return solde;
	}
	
	/** Setter
	 * @param solde le solde a appliquer
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	/** Getter
	 * @return le type
	 */
	public String getType() {
		return type;
	}

	/** Setter
	 * @param type le type a appliquer
	 */
	public void setType(String type) {
		this.type = type;
	}
}
