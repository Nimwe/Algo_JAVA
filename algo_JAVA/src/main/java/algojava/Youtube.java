package algojava;

public class Youtube {
    public static void main(String[] args) {

        double abonnes = 2500;

/* Boucle While
        
        int mois = 0;
        while (mois < 24) {
            abonnes *= 0.5;
            mois ++ ;
        }
        System.out.println("Le nombre d'abonnés estimés dans 24 mois est de : "+ abonnes);*/

// Boucle For
        for (int mois = 0; mois < 24 ; mois ++) {
            abonnes = abonnes + abonnes * 0.5 ;
            System.out.println(abonnes);

        }
    
    }
}
