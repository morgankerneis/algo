package fr.afpa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ApplicationTest {


    /**
     * Fonction de test de la méthode "sumIncrementN"
     */
    @Test
    void testSumIncrementN() {

        // appel de la fonction statique avec le nombre max de 5
       int result = Application.sumIncrementN(5);

       // vérification du résultat
       assertEquals(15, result);
    }
    
    @Test
    void testFindMinMax() {
        Application.findMinAndMax();
    }

    @Test
    void testSortCharacter() {
        Application.sortCharacter();
    }
}
