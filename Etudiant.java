
import java.util.Scanner;
public class Etudiant {
    //champs de la classe 
    private String codeE;
    private String nom;
    private String prenom;
    private int age;
    private String ville;
    //constructeur 
    public Etudiant(String codeE, String nom, String prenom, int age, String ville) {
        this.codeE = codeE;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.ville = ville;
    }

    // Constructeur vide (utile pour saisirE)
    public Etudiant() {
    }

    // 3) Getters et setters du nom et du prénom
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    // 4) Procédure saisirE avec Scanner
    public void saisir() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Code Etudiant: ");
    codeE = sc.nextLine();

    System.out.print("Nom: ");
    nom = sc.nextLine();

    System.out.print("Prenom: ");
    prenom = sc.nextLine();

    System.out.print("Age: ");
    age = sc.nextInt();
    sc.nextLine();

    System.out.print("Ville: ");
    ville = sc.nextLine();
}

    // 5) Procédure afficherE
    public void afficherE() {
        System.out.println("Code : " + codeE + " | Nom : " + nom + " | Prenom : " + prenom
                + " | Age : " + age + " | Ville : " + ville);
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Etudiant[] tab = new Etudiant[3];

        // Saisir les informations des 3 étudiants
        for (int i = 0; i < 3; i++) {
            tab[i] = new Etudiant();
            System.out.println("Etudiant " + (i + 1));
            tab[i].saisir();
        }

        // Afficher les informations
        for (int i = 0; i < 3; i++) {
            System.out.println("Etudiant " + (i + 1));
            tab[i].afficherE();
        }
        int choix;

    do {
        System.out.println("\n===== MENU GESTION ETUDIANT =====");
        System.out.println("1. Saisir et Afficher");
        System.out.println("2. Creation et Affichage des etudiants");
        System.out.println("3. Quitter");

        System.out.print("Donner votre choix : ");
        choix = sc.nextInt();

        switch (choix) {

            case 1:
                for (int i = 0; i < 3; i++) {
                    tab[i] = new Etudiant();

                    System.out.println("Etudiant " + (i + 1));
                    tab[i].saisir();
                    tab[i].afficherE();
                }
                break;

            case 2:
                for (int i = 0; i < 3; i++) {
                    System.out.println("Etudiant " + (i + 1));
                    tab[i].afficherE();
                }
                break;

            case 3:
                System.out.println("Au revoir !");
                break;

            default:
                System.out.println("Choix invalide !");
        }

    } while (choix != 3);


}
}
