package algojava;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entre votre texte svp");
        String original = scanner.nextLine();
        scanner.close();

        if (palindrome(original)) {
            System.out.println("Ceci est un palindrome");
        } else {
            System.out.println("Ce n'est pas un palindrome");
        }
    }

    /**
     * Fonction booleenne pour déterminer si un txte est un palindrome ou non avec
     * - Normalisation du texte par rapport aux accents et majuscules
     * - Appel de la fonction miroir déjà crée dans un fichier précedent
     *
     * @param original
     * @return
     */
    public static boolean palindrome(String original) {
        String normalise = original.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String inverse = MiroirString.miroir(normalise);
        return normalise.equals(inverse);
    }

}
