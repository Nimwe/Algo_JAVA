package algojava;

import java.text.Normalizer;
import java.util.Scanner;

public class DecompteVoyelles {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ecrivez votre phrase : ");
        String phrase = scanner.nextLine();
        scanner.close();

        int compteurVoyelles = 0;

        for (int i = 0; i < phrase.length(); i++) {
            char voyelle = phrase.charAt(i);
            if (isVoyelle(voyelle)) {
                compteurVoyelles++;
            }
        }
        System.out.println("Il y a " + compteurVoyelles + " de voyelles dans la phrase.");
    }

    /**
     * Boolean pour déterminer si un caractère est ou non une voyelle
     * 
     * @param voyelle Détermine si c'est une voyelle
     * @return Retourne les voyelles
     */
    public static boolean isVoyelle(char voyelle) {
        String sansAccent = Normalizer.normalize(String.valueOf(voyelle), Normalizer.Form.NFD)
                .replaceAll("\\p{M}", "").toLowerCase();
        char minuscule = sansAccent.charAt(0);

        return minuscule == 'a' ||
                minuscule == 'e' ||
                minuscule == 'i' ||
                minuscule == 'o' ||
                minuscule == 'u' ||
                minuscule == 'y';

    }
}
