import java.util.Scanner;
public class AppBanque { 
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Entrer le CIN: ");
String cin = scanner.nextLine();
System.out.print("Entrer le nom: ");
String nom = scanner.nextLine();
System.out.print("Entrer le Prenom: ");
String prenom = scanner.nextLine();
System.out.print("Entrer le numeroCompte: ");
String numeroCompte = scanner.nextLine();
System.out.print("Entrer le solde initial (TND) ");
double Solde = scanner.nextDouble();
final double PLAFOND_RETRAIT = 500;
//la suite de l'etape 3 s'inscrire ici..
System.out.print("Entrer le PLAFOND_RETRAIT: ");
  double solde = 1000.0;
int choix;
do{
    System.out.println("\n--- MENU AppBanque ---");
    System.out.println("1.Consulter le compte");
    System.out.println("2.Effectuer in depot");
    System.out.println("3.Effectuer un retrait");
    System.out.println("4.Quitter");
    System.out.print("votre choix (1-4)");
    choix = scanner.nextInt();
    switch (choix) {
        case 1:
            System.out.println("Client : " + nom + " " + prenom + " - CIN " + cin);
            System.out.println("N° de Compte : " + numeroCompte);
            System.out.println("Solde Actuel : " + Solde + " TND");
            System.out.println("Plafond Max : " + PLAFOND_RETRAIT + " TND");
        break; 
        case 2:
            System.out.print("\nMontant du dépôt (TND) : ");
            double montantDepot = scanner.nextDouble();

        if (montantDepot > 0) {
        solde = solde + montantDepot;
        System.out.println(" Dépôt réussi. Nouveau solde : " + solde + " TND");
    } else {
        System.out.println(" Erreur : Le montant doit être supérieur à 0.");
    }
    break;
    case 3:
    System.out.print("\n Montant du retrait (TND) : ");
    double montantRetrait = scanner.nextDouble();

    if (montantRetrait <= 0) {
        System.out.println(" Erreur : Le montant doit être supérieur à 0.");
    } else if (montantRetrait > PLAFOND_RETRAIT) {
        System.out.println(" Retrait refusé : Dépassement du plafond de " +
                PLAFOND_RETRAIT + " TND.");
    } else if (montantRetrait > solde) {
        System.out.println(" Retrait refusé : Solde insuffisant (" + solde +
                " TND disponibles).");
    } else {
        solde = solde - montantRetrait;
        System.out.println(" Retrait réussi. Nouveau solde : " + solde +
                " TND");
    }
    break;
    case 4:
    System.out.println("\n Merci d'avoir utilisé BankSmart App. Au revoir !");
    break;

default:
    System.out.println(" Choix incorrect, veuillez choisir entre 1 et 4.");
break;}
}while (choix != 4);

}

    }

