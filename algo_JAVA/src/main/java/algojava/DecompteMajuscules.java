package algojava;

import java.util.Scanner;

public class DecompteMajuscules {
    public static void main(String[] args) {

        // Scanner afin de permettre à l'utilisateur de rentrer une phrase
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ecrivez votre phrase : ");
        String phrase = scanner.nextLine();
        scanner.close();

        int compteurMajuscules = 0;

        for (int i = 0; i < phrase.length(); i++) {
            char majuscule = phrase.charAt(i);
            if (isMajuscule(majuscule)) {
                compteurMajuscules++;
            }
        }

        System.out.println("Il y a " + compteurMajuscules + " dans la phrase.");
    }

    /**
     * Boolean pour Déterminer si la lettre est en majuscule ou pas
     * 
     * @param majuscule // Détermine si le caractère est une majuscule ou non
     * @return // Retourne les caractères en majuscule
     */
    public static boolean isMajuscule(char majuscule) {
        return Character.isUpperCase(majuscule);
    }

}
