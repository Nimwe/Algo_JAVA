package algojava;

// ✅ Bon algo
public class SommeValTableau {
    public static void main(String[] args) {

        int[][] array2D = {
                { 4, 6, 5 },
                { 7, 11, 34 },
                { 28, 6, 2 },
                { 1, 2, 3 },
                { 4, 3, 10 }
        };

        int height = array2D.length;
        int width = array2D[0].length;
        int result = sommeTableau2D(array2D, width, height);

        System.out.println("Affichage du tableau : ");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(array2D[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Somme totale des valeures du tableau : " + result);
    }

    /**
     * Calcul de la somme des chiffres du tableau
     * 
     * @param array2D
     * @param width
     * @param height
     * @return
     */
    public static int sommeTableau2D(int[][] array2D, int width, int height) {
        int somme = 0;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                somme += array2D[i][j];
            }
        }
        return somme;
    }
}