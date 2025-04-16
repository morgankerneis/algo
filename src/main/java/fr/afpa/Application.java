package fr.afpa;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {


    }

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

    public static void calculateRefundRate() {
        Scanner scanner = new Scanner(System.in);
        Boolean loopOver = true;
        int maxHelpRate = 50;

        while (loopOver == true) {

            System.out.print("Relationship status (S for single, O for other): ");
            char relationshipStatus = scanner.next().charAt(0);
            System.out.print("Number of children: ");
            int numberOfChildren = scanner.nextInt();
            System.out.print("Monthly income: ");
            int monthlyIncome = scanner.nextInt();
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
                loopOver = false;
            }

        }

        scanner.close();
    }

    public static void subCountFor() {
        int subCount = 2500;
        double monthlySubGain = 1.05; // +5%

        for (int i = 1; i <= 24; i++) {
            subCount *= monthlySubGain;
        }

        System.out.println("Sub count = " + subCount);
    }

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

    public static int factorial(int n) {
        int result = 1;

        // Starting at i == 2 to skip 1 * 1
        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public static <T> void printArrayContent(T[] array) {
        for (Object item : array) {
            System.out.println(item);
        }
    }

    /**
     * Uses a for loop to search through an array for a given value.
     * @param array
     * @param arrayLength
     * @param searchedElement
     * @return
     * Returns index of searched element.
     * Returns -1 if not found.
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

    public static int findSumBetweenIndex(int[] array, int indexA, int indexB) {
        int sum = 0;

        for (int i = indexA; i < indexB; i++) {
            sum += array[i];
        }

        return sum;
    }

    public static int[] arrayMinMaxValues(int[] array) {
        int arrayLength = array.length;
        int min = array[0];
        int max = array[0];
        int indexMin = 0;
        int indexMax = 0;

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

        int[] minMax = {indexMin, indexMax};
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

    public static int[] invertArray(int[] array) {
        int[] invertedArray = new int[array.length];
        int invertedIndex = array.length - 1;

        for (int number : array) {
            invertedArray[invertedIndex] = number;
            invertedIndex--;
        }

        return invertedArray;
    }
}
