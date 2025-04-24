package algojava;

import java.util.Scanner;

public class Compte {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ecrire le solde bancaire");
        float solde = scanner.nextFloat();
        System.out.println(solde);

        System.out.println("Ecrire le prix du produit");
        float prix = scanner.nextFloat();
        System.out.println(prix);

        scanner.close();

        float newSolde = solde - prix;

        // TODO que se passe-t-il si la personne a juste assez d'argent sur son compte
        // bancaire ? => Elle peut l'acheter mais elle ne mangera plus jusque sa
        // prochaine paie :D
        if (solde > prix) {
            System.out.println("Vous pouvez acheter cet article - Il vous restera : " + newSolde + " euros.");
        } else if (solde == prix) {
            System.out.println("Vous avez juste le necessaire pour acheter cet article - Il vous restera : " + newSolde
                    + " euros");
        } else {
            System.out.println("Vous n'avez pas le solde necessaire pour cet achat, veuillez alimenter votre compte");
        }
    }
}
