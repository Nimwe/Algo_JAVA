package algojava;

import java.util.Scanner;

public class Pyramide {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quel type de triangle voulez-vous ?");
        System.out.println("1 - Le triangle rectangle");
        System.out.println("2 - Le triangle isocèle");
        System.out.println("Votre choix : ");

        int choix = scanner.nextInt();

        System.out.println("Entrez le nombre d'étoiles souhaitées : ");

        int etoiles = scanner.nextInt();

        if (choix == 1) {
            version1(etoiles);
        } else if (choix == 2) {
            version2(etoiles);
        } else {
            System.out.println("Choix invalide");
        }

        scanner.close();
    }

    // ✅ Bon algo
    /**
     * Version 1 : Le triangle rectangle
     * 
     * @param args
     */
    public static void version1(int etoiles) {

        int i = 1;

        while (i <= etoiles) {
            System.out.println("*".repeat(i));
            i++;
        }
    }

    // TO DO : à supprimer -> la duplication de la ligne maximum
    /**
     * Version 2 : Le triangle isocèle
     * 
     * @param args
     */
    public static void version2(int etoiles) {

        int i = 1;
        boolean monte = true;

        while (i > 0) {
            System.out.println("*".repeat(i));
            if (monte) {
                if (i == etoiles) {
                    monte = false;
                    i--; // Empeche la 2e ligne max
                } else {
                    i++;
                }
            } else {
                i--;
            }
        }

    }
}
