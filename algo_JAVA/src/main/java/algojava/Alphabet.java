package algojava;

import java.text.Normalizer;

public class Alphabet {
    public static void main(String[] args) {

        // ✅ logique okay
        char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
                'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'à', 'é', 'è', 'ê', 'ë', 'ù', 'ô', 'î',
                'ï', 'â', 'ä', 'ü', 'ç' };
        // char[] voyelle = { 'a', 'e', 'i', 'o', 'u', 'y' };

        // Pour la partie optimisée par Ludo
        // => pour la 1ere partie décommentariser ( oui oui tout ça :) ) ce qui est en
        // commentaire et mettre en commentaire cette partie ainsi que la fonction
        // isVoyelle svp
        for (char lettre : alphabet) {
            System.out.println(lettre + "=" + isVoyelle(lettre));
        }

        /*
         * for (int ia = 0; ia < alphabet.length; ia++) {
         * boolean isVoyelle = false;
         * 
         * String sansAccent = Normalizer.normalize(String.valueOf(alphabet[ia]),
         * Normalizer.Form.NFD)
         * .replaceAll("\\p{M}", "").toLowerCase();
         * char minuscule = sansAccent.charAt(0);
         * 
         * for (int iv = 0; iv < voyelle.length && !isVoyelle; iv++) {
         * 
         * if (minuscule == voyelle[iv]) {
         * System.out.println(alphabet[ia] + " = V");
         * isVoyelle = true;
         * }
         * }
         * 
         * if (isVoyelle == false) {
         * System.out.println(alphabet[ia] + " = C");
         * }
         * }
         */
    }

    // Optimisé JAVA (par Ludovic)

    /**
     * Vérifie si un caractère passé en paramètre est une voyelle
     * 
     * @param caractereAVerif
     * @return
     */
    public static char isVoyelle(char caractereAVerif) {
        String sansAccent = Normalizer.normalize(String.valueOf(caractereAVerif), Normalizer.Form.NFD)
                .replaceAll("\\p{M}", "").toLowerCase();
        char minuscule = sansAccent.charAt(0);

        // TODO comment faire pour considérer également les lettres majuscules ?
        // Indice : la JDK offre une multitude de méthodes diverses
        // par exemple, pour transformer un caractère en minuscule :
        // https://www.javaguides.net/2024/06/java-character-tolowercase-method.html

        // 1ere version
        /*
         * if (caractereAVerif == 'a' ||
         * caractereAVerif == 'e' ||
         * caractereAVerif == 'i' ||
         * caractereAVerif == 'o' ||
         * caractereAVerif == 'u' ||
         * caractereAVerif == 'y') {
         */
        // Version avec gestion des majuscules et des accents
        if (minuscule == 'a' ||
                minuscule == 'e' ||
                minuscule == 'i' ||
                minuscule == 'o' ||
                minuscule == 'u' ||
                minuscule == 'y') {
            return 'V';
        }
        return 'C';
    }

}
