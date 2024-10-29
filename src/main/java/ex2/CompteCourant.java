package ex2;

/** Extension de la classe CompteBancaire qui représente un Compte courant */
public class CompteCourant extends CompteBancaire{

    /** decouvert : un découvert est autorisé seulement pour les comptes courants */
    private double decouvert;

    public CompteCourant(String type, double solde, double decouvert) {
        super("CC", solde);
        this.decouvert = decouvert;
    }


    /** Ajoute un montant au solde
     * @param montant
     */
    public void debiterMontant(double montant){
        if (this.solde - montant > decouvert){
            this.solde = solde - montant;
        }
    }

    /** Getter
     * @return le decouvert
     */
    public double getDecouvert() {
        return decouvert;
    }

    /** Setter
     * @param decouvert le decouvert a appliquer
     */
    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }
}
