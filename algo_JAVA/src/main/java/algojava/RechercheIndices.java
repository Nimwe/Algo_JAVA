package algojava;

public class RechercheIndices {

    public static void main(String[] args) {

        int[] array1 = { 30, 40, 50, 20, 10 };
        int[] indices = findMinMAx(array1);

        System.out.println("L'indice minimum est : " + indices[0]);
        System.out.println("L'indice maximum est : " + indices[1]);

    }

    /**
     * Recherche des index Min (iMin) et max (iMax)
     * 
     * @param array
     * @return
     * 
     */
    public static int[] findMinMAx(int[] array) {

        int iMin = 0;
        int iMax = 0;

        // Vérification des paramètres
        if (array.length < 1) {
            return new int[] { -1 };
        }

        // Recherche des index min et max
        for (int i = 0; i < array.length; i++) {

            if (array[i] < array[iMin]) {
                iMin = i;
            }

            if (array[i] > array[iMax]) {
                iMax = i;
            }
        }
        return new int[] { iMin, iMax };
    }

}
