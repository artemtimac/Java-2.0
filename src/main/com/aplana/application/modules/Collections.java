package com.aplana.application.modules;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * Collections methods
 *
 * @author Artem Tugushev
 */
public class Collections {
    private static final String FILE_NAME = "src\\resources\\file.txt";

    public static void sortWordsInFile() {
        Map<String, Integer> words = new TreeMap<>();
        String maxWord = "";
        int maxCount = 0;

        try {
           Scanner scanner = new Scanner(new File(FILE_NAME));
           while (scanner.hasNext()) {
               String word = scanner.useDelimiter("\\s+").next();
               Integer count = words.get(word);
               if (count == null) {
                   count = 0;
               }
               words.put(word, ++count);
               if (count > maxCount) {
                   maxWord = word;
                   maxCount = count;
               }
           }
        } catch (IOException e) {
           System.out.println(e.getMessage());
        }

        // Статистика
        System.out.println(words);
        System.out.printf("Слово с максимальным количеством повторений: %s. %d повторения \n", maxWord, maxCount);
    }
}
