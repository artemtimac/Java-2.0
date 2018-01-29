package com.aplana.tasks;

import com.aplana.application.modules.Calculator;
import com.aplana.application.modules.Arrays;

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
            System.out.println("Enter number of task: (1 - calculator, 2 - string array) [0 - exit]");
            number = scanner.nextInt();
            switch (number) {
                case 1:
                    Calculator calculator = new Calculator();
                    calculator.runCalculator();
                    break;
                case 2:
                    Arrays.findTheLongestWord();
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
