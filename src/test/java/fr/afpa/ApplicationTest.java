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
        Object[] expectedArray = { 1, 2, "Fizz", 4, "Buzz" };

        assertArrayEquals(expectedArray, resultArray);
    }

    @Test
    void testFactorial() {
        int result = Application.factorial(5);
        int expectedResult = 120;

        assertEquals(expectedResult, result);
    }

    @Test
    void testFindArrayIndexFor() {
        int[] array = { 1, 2, 3, 4, 5 };
        int result = Application.findArrayIndexFor(array, array.length, 0);
        int expectedResult = -1;

        assertEquals(expectedResult, result);
    }

    @Test
    void testFindArrayIndexWhile() {
        int[] array = { 1, 2, 3, 4, 5 };
        int result = Application.findArrayIndexWhile(array, 1);
        int expectedResult = 0;

        assertEquals(expectedResult, result);
    }

    @Test
    void testFindArrayIndexDoWhile() {
        int[] array = { 1, 2, 3, 4, 5 };
        int result = Application.findArrayIndexDoWhile(array, 3);
        int expectedResult = 2;

        assertEquals(expectedResult, result);
    }

    @Test
    void testFindSumBetweenIndex() {
        int[] array = { 1, 2, 3, 4, 5, 6, 7 };
        int result = Application.findSumBetweenIndex(array, 0, 3);
        int expectedResult = 6;

        assertEquals(expectedResult, result);
    }

    @Test
    void testArrayMinMax() {
        int[] array = { 1, 2, 3, 4 };
        int[] result = Application.arrayMinMaxValues(array);
        int[] expectedResult = { 0, 3 };

        assertArrayEquals(expectedResult, result);
    }

    @Test
    void testcalcAverageOfArrayValues() {
        int[] array = { 10, 15, 20 };
        int result = Application.calcAverageInArray(array);
        int expectedResult = 15;

        assertEquals(expectedResult, result);
    }

    @Test
    void testInvertArray() {
        int[] array = { 1, 2, 3, 4, 5 };
        int[] invertedArray = Application.invertArray(array);
        int[] expectedResult = { 5, 4, 3, 2, 1 };

        assertArrayEquals(expectedResult, invertedArray);
    }

    // TODO ajouter test unitaire pour tester fizzbuzz
    // indice : pour comparer des tableau, possibilité d'utiliser assertArrayEquals

    @Test
    void testSum2DArrayValues() {
        int[][] matrix = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
        };
        int result = Application.sum2DArrayValues(matrix);
        int expectedResult = 45;

        assertEquals(expectedResult, result);
    }

    @Test
    void testSumMatrixDiagonal() {
        int[][] matrix = {
            { 2, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
        };
        int result = Application.sumMatrixDiagonal(matrix, 1);
        int expectedResult = 16;

        assertEquals(expectedResult, result);
    }

    @Test
    void TestCountVowelsInString() {
        String string = "";
        int testResult = Application.countVowelsInString(string);
        int expectedResult = -1;

        assertEquals(expectedResult, testResult);
    }

    @Test
    void testcountUpperCasedChars() {
        String string = "Why Are You Gae?";
        int testResult = Application.countUpperCasedChars(string);
        int expectedResult = 4;

        assertEquals(expectedResult, testResult);
    }

    @Test
    void testStrToUpper() {
        String string = "Are you winning son?";
        String testResult = Application.strToUpper(string);
        String expectedResult = "ARE YOU WINNING SON?";
        
        assertEquals(expectedResult, testResult);
    }
}
