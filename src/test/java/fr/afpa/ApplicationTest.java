package fr.afpa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
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

    @Test
    void testFizzbuzz() {
        Object[] resultArray = Application.fizzbuzz(5);
        Object[] expectedArray = {1, 2, "Fizz", 4, "Buzz"};

        assertArrayEquals(expectedArray, resultArray);
    }

    @Test
    void testFactorial() {
        int result = Application.factorial(5);
        int expectedResult = 120;

        assertEquals(expectedResult, result);
    }
}
