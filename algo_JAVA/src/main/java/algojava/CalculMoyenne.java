package algojava;

public class CalculMoyenne {
    // array int
    // moyenne des valeures
    public static void main(String[] args) {
        int[] array = { 10, 20, 30, 40, 50 };
        System.out.println(" La moyenne est : " + moyenne(array));

    }

    /**
     * 
     * Fonction de somme et de calcul de moyenne des valeurs d'un tableau
     * 
     * TODO ajouter commentaire Javadoc sur le paramètre et le retour
     * Plus d'information su
     * 
     * @param array // tableau d'entiers
     * @return
     * 
     */
    public static int moyenne(int[] array) {

        if (array == null || array.length == 0) {
            // TODO pour le moment, si les paramètres ne sont pas bons il y a juste un
            // message d'erreur qui apparaît et la fonction continue (avec le System.out)
            // il serait judicieux de renvoyer une valeur indiquant qu'il y a eu un problème
            // comme la fonction une moyenne de nombres entiers positifs nous pouvons partir
            // du principe que la valeur -1 est aberrante
            // il est important de mettre les return pour interrompre le déroulé de la
            // fonction => ok
            System.out.println("Boom");
            return -1;
        }


        // ✅ okay logique et foreach
        int somme = 0;
        for (int nb : array) {
            somme += nb;
        }
        return somme / array.length;
    }

}
