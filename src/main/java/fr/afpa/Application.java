package fr.afpa;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
    }

    // TODO ajouter javadoc
    public static void checkAge() {

        // initializing a new Scanner object for it to scan the system for inputs.
        Scanner scanner = new Scanner(System.in);

        // Displaying a prompt in the console
        System.out.print("Enter your birthyear: ");
        // scanning the system for the most recent Int input and implementing it in a
        // variable
        int userBirthYear = scanner.nextInt();
        int currentYear = java.time.LocalDate.now().getYear();
        int userAge = currentYear - userBirthYear;

        if (userAge < 18) {
            System.out.println("You are a minor (gtfo pls).");
        } else {
            System.out.println("Welcome mister Wick.");
        }

        // for the sake of understanding in this first exercise we'll close it this way
        scanner.close();

    }

    // TODO okay pour la logique, serait-il possible de faire une fonction qui prend
    // 3 paramètres (var1,var2, vaer3) de façon à ne pas avoir les valeurs en dur
    public static void findMinAndMax() {
        int var1 = 20;
        int var2 = 10;
        int var3 = 30;

        int min = var1;
        int max = var1;

        if (min > var2) {
            min = var2;
        }
        if (min > var3) {
            min = var3;
        }

        if (max < var2) {
            max = var2;
        }
        if (max < var3) {
            max = var3;
        }

        System.out.println(min);
        System.out.println(max);
    }

    // TODO ajouter javadoc
    // ✅ logique
    public static void sortCharacter() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a character: ");
        char userInput = scanner.next().charAt(0);
        char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'y' };
        Boolean isAVowel = false;

        for (char vowel : vowels) {
            if (vowel == userInput) {
                isAVowel = true;
            }
        }

        if (isAVowel == true) {
            System.out.println('v');
        } else {
            System.out.println('c');
        }

        scanner.close();
    }

    // TODO ajouter javadoc
    // ✅ logique
    public static void checkAccountBalance() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter current account balance: ");
        float accountBalance = scanner.nextFloat();
        System.out.print("Please enter article price: ");
        float articlePrice = scanner.nextFloat();
        float remainingMoneyOnAccount = accountBalance - articlePrice;

        if (remainingMoneyOnAccount < 0) {
            System.out.println("Purchase is unavailable, insufficient money amount on your account.");
        } else {
            System.out.println("Purchase is available. Remaining money after transaction: " + remainingMoneyOnAccount);
        }

        scanner.close();
    }

    // TODO javadoc
    public static void calculateRefundRate() {
        Scanner scanner = new Scanner(System.in);
        // nice variable name
        // Do not forget : There are only two hard things in Computer Science: cache
        // invalidation and naming things. - Martin Fowler
        Boolean loopOver = true;
        int maxHelpRate = 50;

        // TODO micro-optimisation, ne pas faire la comparaison et mettre le booléen
        // directement
        while (loopOver == true) {

            System.out.print("Relationship status (S for single, O for other): ");
            char relationshipStatus = scanner.next().charAt(0);
            System.out.print("Number of children: ");
            int numberOfChildren = scanner.nextInt();
            System.out.print("Monthly income: ");
            int monthlyIncome = scanner.nextInt();
            // TODO serait-il possible de s'affranchir d'une des 2 branches du switch en
            // modifiant l'intialiasation de helpRate ?
            int helpRate = 0;

            switch (relationshipStatus) {
                case 's':
                    helpRate += 20;
                    break;

                case 'o':
                    helpRate += 25;
                    break;
            }

            if (numberOfChildren > 0) {
                helpRate += numberOfChildren * 15;
            }

            if (monthlyIncome < 1800) {
                helpRate += 10;
            }

            if (helpRate > maxHelpRate) {
                helpRate = maxHelpRate;
            }

            System.out.println("Help rate is " + helpRate + "%");
            System.out.println("-----------------------------");
            System.out.print("Do you wish to calculate another help rate? (Y/N) ");

            char userAnswer = scanner.next().charAt(0);

            if (userAnswer == 'n') {
                // classy stuff, casser une boucle while avec un booléen bien nommé est toujours
                // très élégant
                loopOver = false;
            }

        }

        scanner.close();
    }

    // TODO javadoc
    // ✅ logique
    public static void subCountFor() {
        int subCount = 2500;
        double monthlySubGain = 1.05; // +5%

        for (int i = 1; i <= 24; i++) {
            subCount *= monthlySubGain;
        }

        System.out.println("Sub count = " + subCount);
    }

    // TODO javadoc
    // ✅logique
    public static void subCountWhile() {
        int subCount = 2500;
        double monthlySubGain = 1.05;
        int loopCount = 0;

        while (loopCount <= 24) {
            subCount *= monthlySubGain;
            loopCount++;
        }

        System.out.println("Sub count = " + subCount);

    }

    /**
     * Fonction permettant d'additionner les entier de 0 à numberMax
     * ✅okay
     * 
     * @param numberMax Le nombre max à considérer
     * @return La somme calculée
     */
    public static int sumIncrementN(int numberMax) {

        int sum = 0;
        for (int i = 0; i <= numberMax; i++) {
            sum += i;
        }

        return sum;
    }

    /**
     * Tu connais le Fizzbuzz frr sinon t'es pas embauché t'façon
     * ✅okay
     * 
     * @param chosenNumber
     * @return Fizzbuzz is love, fizzbuzz is life.
     */
    public static Object[] fizzbuzz(int chosenNumber) {
        Object[] mixedArray = new Object[chosenNumber];

        for (int i = 1; i <= chosenNumber; i++) {
            int moduloThree = i % 3;
            int moduloFive = i % 5;
            int arrayIndex = i - 1;

            if (moduloThree == 0 && moduloFive == 0) {
                mixedArray[arrayIndex] = "Fizzbuzz";
            } else if (moduloThree == 0) {
                mixedArray[arrayIndex] = "Fizz";
            } else if (moduloFive == 0) {
                mixedArray[arrayIndex] = "Buzz";
            } else {
                mixedArray[arrayIndex] = i;
            }
        }

        return mixedArray;
    }

    // ✅okay
    public static int factorial(int n) {
        int result = 1;

        // Starting at i == 2 to skip 1 * 1
        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    // ✅okay
    public static <T> void printArrayContent(T[] array) {
        for (Object item : array) {
            System.out.println(item);
        }
    }

    /**
     * Uses a for loop to search through an array for a given value.
     * ✅okay
     * 
     * @param array
     * @param arrayLength
     * @param searchedElement
     * @return
     *         Returns index of searched element.
     *         Returns -1 if not found.
     */
    public static int findArrayIndexFor(int[] array, int arrayLength, int searchedElement) {
        for (int i = 0; i < arrayLength; i++) {
            if (array[i] == searchedElement) {
                return i;
            }
        }
        // Only returns this when not found during search.
        return -1;
    }

    // ✅okay
    public static int findArrayIndexWhile(int[] array, int searchedElement) {
        int arrayLength = array.length;
        int loopCount = 0;
        int result = -1;

        while (loopCount < arrayLength) {

            if (array[loopCount] == searchedElement) {
                result = loopCount;
                // early loop stoppage
                loopCount = arrayLength;
            }

            loopCount++;
        }

        return result;
    }

    // ✅okay
    public static int findArrayIndexDoWhile(int[] array, int searchedElement) {
        int arrayLength = array.length;
        int loopCount = 0;
        int result = -1;

        do {
            if (array[loopCount] == searchedElement) {
                result = loopCount;
                // ealry loop stoppage
                loopCount = arrayLength;
            }
            loopCount++;

        } while (loopCount < arrayLength);

        return result;
    }

    // ✅okay
    public static int findSumBetweenIndex(int[] array, int indexA, int indexB) {
        int sum = 0;

        for (int i = indexA; i < indexB; i++) {
            sum += array[i];
        }

        return sum;
    }

    // TODO ajouter Javadoc
    public static int[] arrayMinMaxValues(int[] array) {
        int arrayLength = array.length;
        int min = array[0];
        int max = array[0];
        int indexMin = 0;
        int indexMax = 0;

        // TODO si min et max sont initialisées avec array[0], pouvons nous gagner une
        // itération de boucle avec une autre intiialisation de i ?
        for (int i = 0; i < arrayLength; i++) {
            if (min > array[i]) {
                min = array[i];
                indexMin = i;
            }
            if (max < array[i]) {
                max = array[i];
                indexMax = i;
            }
        }

        int[] minMax = { indexMin, indexMax };
        return minMax;
    }

    public static boolean swapArrayValues(int[] array, int indexA, int indexB) {
        boolean indexAIsValid = false;
        boolean indexBIsValid = false;

        if (indexA >= 0 && indexA < array.length) {
            indexAIsValid = true;
        }
        if (indexB >= 0 && indexB < array.length) {
            indexBIsValid = true;
        }
        if (indexAIsValid == true && indexBIsValid == true) {
            int intermediateVariable = array[indexA];
            array[indexA] = array[indexB];
            array[indexB] = intermediateVariable;

            return true;
        } else {
            return false;
        }
    }

    // TODO javadoc
    public static int calcAverageInArray(int[] array) {
        int sumOfValues = 0;
        int numberOfValues = 0;

        for (int value : array) {
            sumOfValues += value;
            numberOfValues++;
        }

        int averageOfValues = sumOfValues / numberOfValues;

        return averageOfValues;
    }

    /**
     * Inverts the order of elements in the given integer array.
     *
     * @param array the original array to invert
     * @return a new array containing the elements of the original array in reverse
     *         order
     */

    // TODO javado -> bien indiquer que la fonction va créer un nouveau tableau et
    // de pas toucher au tableau passé en paramètre

    /**
     * Inverts the order of elements in the given integer array.
     *
     * @param array the original array to invert
     * @return a new array containing the elements of the original array in reverse
     *         order
     */
    public static int[] invertArray(int[] array) {
        int[] invertedArray = new int[array.length];
        int invertedIndex = array.length - 1;

        for (int number : array) {
            invertedArray[invertedIndex] = number;
            invertedIndex--;
        }

        return invertedArray;
    }

    // ✅ Bonne logique
    /**
     * Sums all elements of an int matrix.
     * 
     * @param matrix
     * @return sum of all elements.
     */
    public static int sum2DArrayValues(int[][] matrix) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    // TO DO
    // Le if / else serait adapté ici pour diagonalStart et diagonalVector au lieu
    // d'initialiser pour
    // diagonalType = 1 et écraser ensuite si diagonalType = 2
    /**
     * Enter a square matrix and get the sum of all values in its diagonals.
     * 
     * @param matrix       square matrix
     * @param diagonalType Can be 1 or 2. 1 starts on top left corner and 2 starts
     *                     on top right.
     * @return Sum of values in given diagonal.
     */
    public static int sumMatrixDiagonal(int[][] matrix, int diagonalType) {
        int sum = 0;
        int diagonalStart = 0;
        // Will be added to diagonalStart to increase or decrease the value of the
        // index.
        int diagonalVector = 1;

        // if type 1, keep start at 0 and vector at 1.
        if (diagonalType == 2) {
            diagonalStart = matrix[0].length - 1;
            diagonalVector = -1;
        }

        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][diagonalStart];
            diagonalStart += diagonalVector;
        }

        return sum;
    }

    // ✅ Okay
    // TODO javadoc
    public static void printPyramid(int chosenNumber) {
        boolean keepLooping = true;
        int numberOfStars = 0;
        String pyramidLine = "";
        char star = '*';
        boolean pyramidTopIsReached = false;

        while (keepLooping) {
            if (!pyramidTopIsReached) {
                if (numberOfStars < chosenNumber) {
                    pyramidLine = pyramidLine + star;
                    numberOfStars++;
                    System.out.println(pyramidLine);
                } else {
                    pyramidTopIsReached = true;
                }
            } else if (numberOfStars > 0) {
                pyramidLine = pyramidLine.substring(0, pyramidLine.length() - 1);
                numberOfStars--;
                System.out.println(pyramidLine);
            } else {
                keepLooping = false;
            }
        }
    }

    // TODO javadoc
    // Math.random() * (100 - 1 + 1) ??
    // ✅ Okay
    public static void guessNumberGame() {
        Scanner scanner = new Scanner(System.in);
        boolean keepPlaying = true;
        int guessesLeft = 10;
        int numberToGuess = (int) (Math.random() * (100 - 1 + 1)) + 1;
        int currentGuess = 0;
        String prompt = "Try and find the secret number (1-100): ";

        while (keepPlaying) {
            System.out.print(prompt);
            currentGuess = scanner.nextInt();

            if (currentGuess != numberToGuess) {
                guessesLeft--;
                if (guessesLeft == 0) {
                    System.out.println("No guesses left, secret number was " + numberToGuess);
                    keepPlaying = false;
                } else if (currentGuess > numberToGuess) {
                    prompt = "Secret number is smaller, try again: ";
                } else {
                    prompt = "Secret number is bigger, try again: ";
                }
            } else {
                System.out.println("Well done! The secret number was indeed " + numberToGuess);
                keepPlaying = false;
            }
        }

        scanner.close();
    }

    // Préferer un do while au lieu d'un for quand on doit sortir avant la fin et
    // éviter les break qui sont difficilement maintenanble
    /**
     * Iterates through given string and returns the amount of vowels in it.
     * 
     * @param string case doesn't matter
     * @return vowel count / -1 if error
     */
    public static int countVowelsInString(String string) {
        if (string == "") {
            return -1;
        }

        int vowelCount = 0;
        char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'y' };
        // lowering case of characters in string to match with vowel array
        String loweredString = string.toLowerCase();

        for (int i = 0; i < string.length(); i++) {
            char character = loweredString.charAt(i);
            for (char vowel : vowels) {
                if (character == vowel) {
                    vowelCount++;
                    break;
                }
            }
        }

        return vowelCount;
    }

    // ✅ Bonne logique
    /**
     * Counts amount of upper cased characters in a given string.
     * 
     * @param string
     * @return -1 if error
     */
    public static int countUpperCasedChars(String string) {
        int upperCaseCount = 0;

        for (char character : string.toCharArray()) {
            if (Character.isUpperCase(character)) {
                upperCaseCount++;
            }
        }

        return upperCaseCount;
    }

    public static String strToUpper(String string) {
        String upperCasedChain = "";

        for (char character : string.toCharArray()) {
            upperCasedChain += Character.toUpperCase(character);
        }

        return upperCasedChain;
    }
}
