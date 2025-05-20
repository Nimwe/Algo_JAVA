package algojava;

import java.util.Scanner;

public class MiroirString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer votre phrase ici : ");
        String originale = scanner.nextLine();
        scanner.close();

        String inverse = miroir(originale);
        System.out.println("Votre phrase inversées est : " + inverse);
    }




    
    // Modification du nom de la fonction pour que ça soit plus clair lors de la
    // recuperation pour la palindrome





    /**
     * Fonction miroir pour parcourir la phrase originale à rebours
     * 
     * @param originale Entrée utilisateur via le scanner
     * @return L'entrée originale parcourue à rebour pour inverser le sens
     *         d'écriture
     */
    public static String miroir(String originale) {
        StringBuilder resultat = new StringBuilder();

        // Parcours de la string à l'envers
        for (int i = originale.length() - 1; i >= 0; i--) {
            resultat.append(originale.charAt(i));
        }
        return resultat.toString();
    }
}
