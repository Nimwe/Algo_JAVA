package algojava;

import java.time.Year;
// import java.util.Calendar; => trop lourd à l'heure actuelle, utile pour des versions de JAVA antérieure à la 8. Je choisis donc d'utiliser java.time.year
import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {

    /*
     * public static void main(String[] args) {
     * System.out.println("Hello World!");
     */

    /**
     * @param args
     */
    public static void main(String[] args) {

        // TODO trouver la date actuelle pour que ça soit dynamique
        // Indice pour trouver la data actuelle :
        // https://www.w3docs.com/snippets/java/get-integer-value-of-the-current-year-in-java.html
        // il est possible de garder "en dur" la date de naissance (plus tard elle sera
        // renseignée par un formulaire ou un scanner) => ok

        /*
         * Original
         * int actualYear = 2025;
         * int birthYear = 2023;
         * int age = actualYear - birthYear;
         */

        int actualYear = Year.now().getValue();
        // int age = actualYear - birthYear; => Soyons fou faisons un scanner plutot ;)
        Scanner scanner = new Scanner(System.in);
        int birthYear = 0;

        boolean saisieInvalide = true;

        // TODO enlever 2007 en dur du message afin de rendre le programme plus
        // générique pour toutes les années => ok

        // Gestion des saisies invalides
        while (saisieInvalide) {
            System.out.println("Veuillez entrer votre année de naissance svp :");
            try {
                birthYear = scanner.nextInt();

                if (birthYear > actualYear) {
                    System.out.println("Tu fais comment pour rentrer une année sans être né ?");
                } else if (birthYear < 1900) {
                    System.out.println(
                            "C'est super d'être aussi moderne à un tel âge avancé, mais c'est mieux d'entrer une année valide ;)");
                } else {
                    saisieInvalide = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Merci d'entrer uniquement une année sous forme AAAA");
                scanner.next();
            }
        }

        // Détermination de la majorité ou non
        int age = actualYear - birthYear;

        if (age >= 18) {
            System.out.println("Nous sommes en " + actualYear + ".");
            System.out.println("Vous avez " + age + " ans, vous êtes majeur !");
        } else {
            System.out.println("Nous sommes en " + actualYear + ".");
            System.out.println("Vous avez " + age + " ans, vous n'êtes pas majeur !");
        }
        scanner.close();
    }
}
