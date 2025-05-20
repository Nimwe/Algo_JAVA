package algojava;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class JeuPlusouMoins {

    // Tu peux remplacer les while par des Do/While puisque tu dois le faire au
    // moins une fois. C'est plus facile au niveau des initialisations
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tirer un entier aleatoirement entre 1 et 100 => Random
        Random r = new Random();
        int n = r.nextInt(100) + 1;

        // Limiter le nombre d'essais
        int essaisMax = 10;
        int essais = 0;
        boolean gagne = false;

        // Présentation du jeu
        System.out.println("Voici le jeu du plus ou moins. Vous avez " + essaisMax + " essais.");

        // Gestion du nombre d'essais
        while (essais < essaisMax && !gagne) {
            int choix = 0;
            boolean nonNumerique = false;

            // Gestion des caractères non numériques
            while (!nonNumerique) {
                System.out.println("Essai  " + (essais + 1) + ", veuillez choisir un nombre svp :");

                try {
                    choix = scanner.nextInt();

                    if (choix < 1 || choix > 100) {
                        System.out.println("Veuillez entrer un nombre entre 1 et 100 svp");
                    } else {
                        nonNumerique = true;
                    }
                } catch (InputMismatchException e) {
                    System.out.println(("Merci d'entrer un nombre entier compris entre 1 et 100 uniquement"));
                    scanner.next();
                }
            }

            essais++;

            // Réponses suivant choix
            if (choix < n) {
                System.out.println("Le chiffre caché est plus grand :) ");
            } else if (choix > n) {
                System.out.println("Le chiffre caché est moins grand :) ");
            } else {
                System.out.println("Vous avez gagné ! Bravo!");
                System.out.println("Il vous a fallu " + essais + " essais !");
                gagne = true;
            }
        }

        // Réponse si nombre non trouvé
        if (!gagne) {
            System.out.println("Dommage, vous avez perdu cette fois :( .");
            System.out.println("Le nombre secret était " + n + ".");
        }

        scanner.close();
    }
}
