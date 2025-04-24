package algojava;

public class SommeIndex {

    public static void main(String[] args) {

        int[] array = { 10, 20, 30, 40, 50 };
        System.out.println(searchIndexi(array, 20));
        System.out.println(searchIndexj(array, 40));
        System.out.println(searchIndexi(array, 20) + searchIndexj(array, 40));

    }

    /**
     * Recherche de l'index i et récuperation de sa valeur
     * 
     * @param tableau
     * @param ivalue
     * @return
     */
    public static int searchIndexi(int[] tableau, int ivalue) {

        // Vérification des paramètres
        if (tableau.length < 1) {
            return -1;
        }
        // Recherche de la valeur de l'index i
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == ivalue) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Recherche de l'index j et récuperation de sa valeur
     * 
     * @param tableau
     * @param jvalue
     * @return
     */
    public static int searchIndexj(int[] tableau, int jvalue) {

        // Vérification des paramètres
        if (tableau.length < 1) {
            return -1;
        }
        // Recherche de la valeur de l'index i
        for (int j = 0; j < tableau.length; j++) {
            if (tableau[j] == jvalue) {
                return jvalue;
            }
        }
        return -1;
    }

    /**
     * z = curseur dans le tableau
     * 
     * @param tableau
     * @param i
     * @param j
     * @return
     * 
     */
    public static int sumIndex(int[] tableau, int i, int j) {
        int result = 0;
        for (int z = i; z < tableau.length && z < j; z++) {
            result += tableau[z];
            // équivalent à :
            // result = result + tableau[z];
        }
        return result;
    }

}
