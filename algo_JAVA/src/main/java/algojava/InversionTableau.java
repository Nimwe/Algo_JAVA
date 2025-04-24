package algojava;

import java.util.Arrays;

// ✅ Parfait
public class InversionTableau {
    public static void main(String[] args) {
        int[] array = { 54, 1, 4, 6, 8 };
        int[] newArray = invert(array);

        System.out.println("Voici le tableau original : " + Arrays.toString(array));
        System.out.println("Voici le tableau inversé : " + Arrays.toString(newArray));
    }

    public static int[] invert(int[] array) {
        int[] invertArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            invertArray[i] = array[array.length - 1 - i];
        }
        return invertArray;
    }

}
