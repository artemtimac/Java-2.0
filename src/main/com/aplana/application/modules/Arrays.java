package com.aplana.application.modules;

import java.util.Random;
import java.util.Scanner;

/**
 * Arrays methods
 *
 * @author Artem Tugushev
 */
public class Arrays {
    public static String findTheLongestWord() {
        String[] words;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of array: ");
        int length = scanner.nextInt();
        words = new String[length];

        // Adding words to array
        for (int i = 0; i < words.length; i++) {
            System.out.println("Enter the word you want to add to array: ");
            words[i] = scanner.next();
        }

        // Find the longest one
        int maxLengthOfWord = 0;
        String theLongestWord = "";
        for (String word : words) {
            if (word.length() > maxLengthOfWord) {
                maxLengthOfWord = word.length();
                theLongestWord = word;
            }
        }

        System.out.printf("The longest word in array is: %s \n", theLongestWord);
        return theLongestWord;
    }

    public static int[] swapTheMaxAndMinElementsOfArray() {
        int[] array = new int[20];
        Random random = new Random();

        // Fill an array with random numbers from -10 to 10
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21) - 10;
        }

        // Find the max and min elements
        int min = array[0];
        int max = array[0];
        int indexOfMin = 0;
        int indexOfMax = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                indexOfMax = i;
            }
            else if (array[i] < min) {
                min = array[i];
                indexOfMin = i;
            }
        }

        // Swap min and max in array
        int temp = array[indexOfMax];
        array[indexOfMax] = array[indexOfMin];
        array[indexOfMin] = temp;

        return array;
    }
}
