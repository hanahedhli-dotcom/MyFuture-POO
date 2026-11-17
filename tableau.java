import java.util.Scanner;

public class tableau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Question 1
         double[] moyenne={10.50, 11.50, 14};
         moyenne[1] = 0;
    for(int i=0; i<3; i++){
        System.out.println(moyenne[i]);
    }
    // Qustion 2
    System.out.println(moyenne.length);
    // creer un autre tableau de 3 reels introduit par l'utilisateur
    double[] reels = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Donner un reel " + (i + 1) + " : ");
            reels[i] = sc.nextDouble();
        }
        System.out.println("Les elements du tableau 2 sont :");

for (int i = 0; i < 3; i++) {
    System.out.println(reels[i]);

    }
    //Question 4 renitialiser la 2eme valeur du tableau 1
    //Question 5 la somme de deux tablaux
    // Création du tableau résultat
double[] tab3 = new double[3];

// Calcul de la somme
for (int i = 0; i < 3; i++) {
    tab3[i] = moyenne[i] + reels[i];
}

// Affichage du tableau résultat
System.out.println("Le tableau resultat est :");

for (int i = 0; i < 3; i++) {
    System.out.println(tab3[i]);
}

   
    }
}