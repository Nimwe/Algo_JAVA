package algojava;

import java.util.Scanner;

public class Factorielle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donner un entier : ");
        int n = scanner.nextInt();

        // Affichage de la factorielle que de n
        /*
         * int fact = factorielle(n);
         * System.out.println("La donnée d'entrée est :" + n + ". n! de " + n +
         * " est : " + fact + ".");
         */

        // Affichage des factorielles de 1 à n
        System.out.println("La donnée d'entrée est :" + n);
        for (int i = 1; i <= n; i++) {
            int fact = factorielle(i);
            System.out
                    .println(" La factorielle de : " + i + " est " + fact);
        }

        scanner.close();
    }

    // Il y a 2 boucles FOR dans ton algo entre la fonciton et le main
    public static int factorielle(int maxValue) {
        int fact = 1;

        for (int i = 1; i <= maxValue; i++) {
            fact *= i;
        }
        return fact;
    }
}

// TODO okay logique, créer une fonction pour accueillir cet algorithme
// proposition de déclaration :
// public static int factorielle(int maxValue)
