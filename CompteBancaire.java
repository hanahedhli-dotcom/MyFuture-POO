public class CompteBancaire {

    private String numeroCompte;
    private double solde;
    private Client titulaire;

    private static int nombreComptes = 0;
    public CompteBancaire(String numeroCompte, double soldeInitial, Client titulaire) {
        this.numeroCompte = numeroCompte;
        this.solde = soldeInitial;
        this.titulaire = titulaire;
        nombreComptes++;
    }

    public void deposer(double montant) {
        if (montant > 0) {
            solde = solde + montant;
            System.out.println("Dépôt réussi. Nouveau solde : " + solde + " TND");
        } else {
            System.out.println("Erreur : Le montant doit être supérieur à 0.");
        }
    }
    public boolean retirer(double montant) {
        if (montant <= 0) {
            System.out.println("Erreur : Le montant doit être supérieur à 0.");
            return false;
        } else if (montant > solde) {
            System.out.println("Retrait refusé : Solde insuffisant.");
            return false;
        } else {
            solde = solde - montant;
            System.out.println("Retrait réussi. Nouveau solde : " + solde + " TND");
            return true;
        }
    }
    public void virement(CompteBancaire destination, double montant) {
        if (montant > 0 && montant <= solde) {
            solde = solde - montant;
            destination.deposer(montant);
            System.out.println("Virement effectué avec succès.");
        } else {
            System.out.println("Virement impossible.");
        }
    }
    public void afficherDetails() {
        System.out.println("Numéro de compte : " + numeroCompte);
        System.out.println("Titulaire : " + titulaire.getNom() + " " + titulaire.getPrenom());
        System.out.println("Solde : " + solde + " TND");
    }
    public static int getNombreComptes() {
        return nombreComptes;
    }
    public double getSolde() {
        return solde;
    }
    public String getNumeroCompte() {
        return numeroCompte;
    }
}
