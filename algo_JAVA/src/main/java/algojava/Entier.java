package algojava;

import java.util.Scanner;

public class Entier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez un entier n : ");

        int n = scanner.nextInt();
        int somme = 0;
        int compteur = 0;

        while (compteur <= n) {
            somme += compteur;
            compteur++;
        }
        System.out.println("La somme des entiers de 0 à " + n + " est : " + somme);

        scanner.close();
    }
}
