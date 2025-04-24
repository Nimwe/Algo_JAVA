package algojava;

import java.util.ArrayList;
import java.util.Collections;
// import java.util.Arrays;  => Utiliser pour la version avec outils

/* Exemple pour comprendre la fonction swap 
=> utilisable qu'avec une list, chaine, ou objet 
!! Il faut importer la java.util.* pour utiliser cette fonction

public class SwapFunction {

    public static <T> void swapElements(ArrayList<T> list, int index1, int index2) {
        Collections.swap(list, index1, index2);         => Collections.swap ne fonctionne qu'avec des listes

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList <>(Arrays.asList("Apple", "Banana","Orange", "kiwi")) ;
            System.out.println("Before Swap : " + list); 
            swapElements(list, 1,2) ;
            System.out.println(("After Swap : " + list));
    }
}*/

// TODO renommer la classe pour avoir du CamelCase
// plus d'information sur les conventions de nommage : https://loribel.com/java/normes/nommage.html#classes
public class Echange_valeur {

    public static void main(String[] args) {
        /*
         * En utilisant les outils java :
         * 
         * ArrayList<String> list = new ArrayList <> (Arrays.asList ( "4", "155", "2",
         * "6" ));
         * System.out.println("Before swap : " + list);
         * swapElements(list, 1,3);
         * System.out.println("After swap : " + list);
         */

        // Avec la fonction manuelle
        int[] array = { 4, 6, 2, 155 };
        swap(array, 1, 3);
        // TODO la ligne qui suit fait figurer un System.out vide, à supprimer
        System.out.println();
        displayContent(array);
    }

    // ✅ version générique, approche particulière utilisant les principes de POO, à
    // documenter
    public static <T> void swapElements(ArrayList<T> list, int index1, int index3) {
        Collections.swap(list, index1, index3);
    }

    /**
     * Fonction swap manuelle
     * 
     * TODO compléter la javadoc pour information concernant les paramètres et le
     * type de retour
     * 
     * @param array  TODO javadoc à compléter ici
     * @param index1 et ici
     * @param index2 et par là
     * @return et aussi ici.
     * 
     */
    public static boolean swap(int[] array, int index1, int index2) {

        if (index1 > array.length && index1 < 0 && index2 > array.length && index2 < 0 && array.length < 2) {
            // TODO ajouter "return" dans ce "if" pour interrompre la fonction
            System.out.println("Boum");
        }

        int temp = array[index1];

        array[index1] = array[index2];
        array[index2] = temp;

        return true;
    }

    // Normalement c'est une procedure car ne renvoie rien, fait juste un affichage,
    // ce n'est pas une fonction
    // mais par abus de langage c'est aussi appelé une fonction
    public static void displayContent(int[] displayArray) {
        for (int i = 0; i < displayArray.length; i++) {
            System.out.println(displayArray[i]);
        }
    }

}