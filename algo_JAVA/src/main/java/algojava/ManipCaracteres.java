package algojava;

import java.util.Scanner;

public class ManipCaracteres {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez rediger une phrase à transformer svp ");

        String original = scanner.nextLine();
        scanner.close();

        String upper = majuscule(original);
        System.out.println("Votre phrase en majuscules : " + upper);

    }

    /**
     * Fonction utilisant toUpperCase qui permet de transformer les lettres en
     * majscules
     * 
     * @param original Entrée utilisateur dans le scanner
     * @return L'entrée originale modifiée en majuscule grâce à toUpperCase
     */
    public static String majuscule(String original) {
        return original.toUpperCase();
    }

}
