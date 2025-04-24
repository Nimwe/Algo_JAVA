package algojava;

import java.util.Arrays;
import java.util.Scanner;

public class ManipTableauUser {

    // ✅
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Combien d'entrées souhaitez-vous saisir ? :");
        int nbEntiers = scanner.nextInt();

        int[] array = new int[nbEntiers];

        for (int i = 0; i < nbEntiers; i++) {
            System.out.println("Saisir le nombre : " + (i + 1) + ":");
            array[i] = scanner.nextInt();
        }

        System.out.println("\nTableau des nombres saisis : " + Arrays.toString(array));

        double moyenne = averageCalculation(array);
        int min = findMin(array);
        int max = findMax(array);

        System.out.println("Moyenne : " + moyenne);
        System.out.println("Minimum : " + min);
        System.out.println("Maximum : " + max);
        scanner.close();

    }

    /**
     * Fonction de calcul de la moyenne des valeurs du tableau
     * 
     * TODO ajouter indications Javadoc pour paramètre et retour => ok
     * 
     * @param array // Tableau des entiers saisis
     * @return // Moyenne des entiers du tableau
     */
    public static double averageCalculation(int[] array) {

        // ✅ programmation défensive : CHECKED !
        if (array == null || array.length == 0) {
            System.out.println("Boom");
            return 0;
        }

        // ✅
        int somme = 0;
        for (int nb = 0; nb < array.length; nb++) {
            somme += array[nb];
        }
        return (double) somme / array.length;
    }

    /**
     * Fonction pour trouver la valeur minimum du tableau
     * 
     * TODO ajouter indications Javadoc pour paramètre et retour => ok
     * 
     * @param array // Tableau des entiers saisis
     * @return // Entier le plus petit du tableau
     */
    public static int findMin(int[] array) {
        int min = array[0];

        // ✅
        for (int nb = 1; nb < array.length; nb++) {
            if (array[nb] < min) {
                min = array[nb];
            }
        }
        return min;
    }

    /**
     * Fonction pour trouver la valeur maximum du tableau
     * 
     * @param array // Tableau des entiers saisis
     * @return // Entier le plus haut du tableau
     */
    public static int findMax(int[] array) {

        int max = array[0];

        // ✅
        for (int nb = 1; nb < array.length; nb++) {
            if (array[nb] > max) {
                max = array[nb];
            }
        }

        return max;
    }

}
