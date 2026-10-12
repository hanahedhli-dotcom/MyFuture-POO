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

        default:
   break;
    }
}   while (choix != 4);
    }
}
