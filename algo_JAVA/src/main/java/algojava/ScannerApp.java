package algojava;

import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ecrire un nombre : ");

        int nombre = scanner.nextInt();
        System.out.println(nombre);
        scanner.close();
    }
}
