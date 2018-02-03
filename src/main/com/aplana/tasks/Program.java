package com.aplana.tasks;

import com.aplana.application.modules.Calculator;
import com.aplana.application.modules.Arrays;
import com.aplana.application.modules.Gift;

import java.util.Scanner;

/**
 * My tasks
 *
 * @author Artem Tugushev
 */
public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("Enter number of task: (1 - calculator, 2 - string array, 3 - gifts) [0 - exit]");
            number = scanner.nextInt();
            switch (number) {
                case 1:
                    Calculator calculator = new Calculator();
                    calculator.runCalculator();
                    break;
                case 2:
                    Arrays.findTheLongestWord();
                    break;
                case 3:
                    Gift.makeGiftBox(new Gift("Candy", 111, 1.5f, 15.25f), new Gift("Jellybean", 222, 0.7f, 7.50f),
                            new Gift("Kinder Surprise", 333, 0.5f, 9.99f));
                    break;
                case 0:
                    break;
                default:
                    System.out.println("You entered an incorrect number, please retry");
            }
        } while (number != 0);

        scanner.close();
    }
}
