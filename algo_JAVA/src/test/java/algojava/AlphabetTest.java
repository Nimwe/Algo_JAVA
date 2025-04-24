package algojava;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AlphabetTest {

    @Test
    void shouldCorrectlyCheckIfVoyelle() {
        // But du jeu : appeler la fonction à tester
        // et vérifier le résultat qu'elle donne

        char result = Alphabet.isVoyelle('a');
        assertEquals('V', result);

        result = Alphabet.isVoyelle('R');
        assertEquals('C', result);

        // Cas particuliers non pris en compte par la fonction à tester
        // result = Alphabet.isVoyelle('7');
        // assertEquals('V', result);

        // result = Alphabet.isVoyelle('+');
        // assertEquals('V', result);
    }
}
