package algojava;

public class SommeValTableauDiagonale {
    /*
     * public static void main(String[] args) {
     * int[][] array2D = {
     * { 4, 6, 5, 2 },
     * { 7, 11, 34, 1 },
     * { 28, 6, 2, 15 },
     * { 1, 2, 3, 19 }
     * };
     * 
     * int width = array2D.length;
     * int height = array2D[0].length;
     * int result = sommeTableau2D(array2D, width, height);
     * 
     * // Affichage du tableau
     * System.out.println("Tableau 2D");
     * for (int i = 0; i < width; i++) {
     * for (int j = 0; j < height; j++) {
     * System.out.print(array2D[i][j] + "\t");
     * }
     * System.out.println();
     * }
     * // Affichage de la somme de tous les nombres
     * System.out.println("Somme de tous les nombres du tableau : " + result);
     * // Affichage de la somme de la diagonale gauche
     * int sommeDiagonaleGauche = diagonalGauche(array2D);
     * System.out.println(
     * "Somme de la diagonale partant du haut-gauche et finissant au bas-droit " +
     * sommeDiagonaleGauche);
     * // Affichage de la somme de la diagonale droite
     * int sommeDiagonaleDroite = diagonalDroite(array2D);
     * System.out.println(
     * "Somme de la diagonale partant du haut-droit et finissant au bas-gauche " +
     * sommeDiagonaleDroite);
     * 
     * }
     * 
     * /**
     * Caldul de la somme de tous les nombres du tableau
     * 
     * @param array2D
     * 
     * @param width
     * 
     * @param height
     * 
     * @return
     */
    /*
     * public static int sommeTableau2D(int[][] array2D, int width, int height) {
     * int somme = 0;
     * for (int i = 0; i < width; i++) {
     * for (int j = 0; j < height; j++) {
     * somme += array2D[i][j];
     * }
     * }
     * return somme;
     * }
     * 
     * /**
     * Calcul de la diagonale gauche partant du haut-gauche et finissant au
     * bas-droit
     * 
     * @param array2D
     * 
     * @return
     */
    /*
     * public static int diagonalGauche(int[][] array2D) {
     * int somme = 0;
     * int longueur = array2D.length;
     * for (int i = 0; i < longueur; i++) {
     * somme += array2D[i][i];
     * }
     * return somme;
     * }
     * 
     * /**
     * Calcul de la diagonale droite partant du haut-droit et finissant au
     * bas-gauche
     * 
     * @param array2D
     * 
     * @return
     */
    /*
     * public static int diagonalDroite(int[][] array2D) {
     * int somme = 0;
     * int longueur = array2D.length;
     * for (int i = 0; i < longueur; i++) {
     * somme += array2D[i][longueur - 1 - i];
     * }
     * return somme;
     * }
     * }
     */

    /********************************************************************************************************************************************************************* */

    /* Version avec diagonaleType */

    public static void main(String[] args) {
        int[][] array2D = {
                { 4, 6, 5, 2 },
                { 7, 11, 34, 1 },
                { 28, 6, 2, 15 },
                { 1, 2, 3, 19 }
        };

        int width = array2D.length;
        int height = array2D[0].length;
        int diagonaleType = 1;
        int result = sommeDiagonale(array2D, diagonaleType);

        // Affichage du tableau
        System.out.println("Tableau 2D");
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print(array2D[i][j] + "\t");
            }
            System.out.println();
        }
        // Affichage du choix de la diagonale
        System.out.println("Choix de la diagonale : " + diagonaleType);
        // Affichage de la somme de la diagonale
        System.out.println("Somme de la diagonale : " + result);
    }

    // ✅ Bon algo. Le cahier des charges demandaient de donner la longueur en entrée
    // mais, effectivement, c'est plus logique comme cela
    /**
     * Définition du calcul suivant le choix de diagonale
     * 
     * @param array2D
     * @param diagonaleType
     * @return
     */
    public static int sommeDiagonale(int[][] array2D, int diagonaleType) {
        int longueur = array2D.length;
        int somme = 0;

        if (array2D[0].length != longueur) {
            System.out.println("Erreur : matrice non carrée");
            return -1;
        }

        for (int i = 0; i < longueur; i++) {
            if (diagonaleType == 1) {
                somme += array2D[i][i];
            } else if (diagonaleType == 2) {
                somme += array2D[i][longueur - 1 - i];
            } else {
                System.out.println("Diagonale non valide");
                return -1;
            }
        }
        return somme;
    }
}