package algojava;

import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer votre texte ici :");
        String saisie = scanner.nextLine();
        scanner.close();

        String camelCase = camelCase(saisie);
        System.out.println("Voici la version en camelCase : " + camelCase);

    }

    /**
     * Fonction de transformation de la saisie en camelCase
     * - Suppression de tous ce qui n'est pas lettre ou espace
     * - Séparation des mots de la phrase et les mettre en minuscules
     * - Construction de la phrase
     * - Parcourir les mots de la phrase
     * - If pour determiner le 1er mot afin de ne pas le mettre en majuscule
     * - Séparation la 1ere lettre du mot, mise en majuscule, récupération du reste
     * du mot et reassemblage du mot (else)
     * 
     * @param saisie Chaine de caractère entrée dans le scanner
     * @return Les mots modifiés remis en chaine de caractère
     */
    public static String camelCase(String saisie) {

        saisie = saisie.replaceAll("[^a-zA-Z]", " ");
        String[] mots = saisie.toLowerCase().trim().split("\\s+");
        StringBuilder resultat = new StringBuilder();

        for (int i = 0; i < mots.length; i++) {
            String mot = mots[i];
            if (i == 0) {
                resultat.append(mot);
            } else {
                resultat.append(Character.toUpperCase(mot.charAt(0))).append(mot.substring(1));
            }
        }
        return resultat.toString();
    }
}
