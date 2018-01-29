package com.aplana.application.modules;

import java.util.Scanner;

/**
 * Words
 *
 * @author Artem Tugushev
 */
public class Arrays {
    public String findTheLongestWord() {
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


}
