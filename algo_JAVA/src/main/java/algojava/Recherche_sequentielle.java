package algojava;

public class Recherche_sequentielle {
    public static void main(String[] args) {

        int[] array = { 10, 20, 30, 40, 50 };
        System.out.println(searchIndexFor(array, 20)); // nom fonction + parametres
        System.out.println(searchIndexWhile(array, 10));
        System.out.println(searchIndexDoWhile(array, 40));
    }

    // Déclaration de fonction/methode recherche index

    /**
     * Avec une for
     * 
     * @param tableau
     * @param value
     * @return
     */
    public static int searchIndexFor(int[] tableau, int value) {
        // Principe de programmation défensive : on vérifie en tout début de fonction la
        // validité des paramètres
        // Exemple : ici on vérifie la taille du tableau
        if (tableau.length < 0) { // "if" de vérification
            return -1;
        }

        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == value) {
                return i;
            }
        }
        return -1; // Par convention on met -1, signifie que la methode n'a pu satisfaire la
                   // demande initiale
    }

    /**
     * Avec une while
     * 
     * @param tableau
     * @param value
     * @return
     */
    public static int searchIndexWhile(int[] tableau, int value) {

        int i = 0;
        while (i < tableau.length) {
            if (tableau[i] == value) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Avec une DoWhile
     * 
     * @param tableau
     * @param value
     * @return
     */
    public static int searchIndexDoWhile(int[] tableau, int value) {
        int i = 0;
        do {
            if (tableau[i] == value) {
                return i;
            }
            i++;
        } while (i < tableau.length);
        return -1;
    }
}
