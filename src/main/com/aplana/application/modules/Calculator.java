package com.aplana.application.modules;

import java.util.Scanner;

/**
 * Calculator
 *
 * @author Artem Tugushev
 */
public class Calculator {
    public void runCalculator() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        float firstNumber = sc.nextFloat();

        System.out.println("Enter the operation: '+' - sum, '-' - subtract, '*' - multiply, ':' - divide");
        String operation = sc.next();

        System.out.println("Enter the second number: ");
        float secondNumber = sc.nextFloat();

        switch (operation) {
            case "+":
                sum(firstNumber, secondNumber);
                break;
            case "-":
                subtract(firstNumber, secondNumber);
                break;
            case "*":
                multiply(firstNumber, secondNumber);
                break;
            case ":":
                divide(firstNumber, secondNumber);
                break;
            default:
                System.out.println("You entered an incorrect operation!");
        }
    }

    public static float sum(float firstNumber, float secondNumber) {
        float sum = firstNumber + secondNumber;
        System.out.printf("Sum is: %.4f \n", sum);
        return sum;
    }

    public static float subtract(float firstNumber, float secondNumber) {
        float difference = firstNumber - secondNumber;
        System.out.printf("Difference is: %.4f \n", difference);
        return difference;
    }

    public static float multiply(float firstNumber, float secondNumber) {
        float product = firstNumber * secondNumber;
        System.out.printf("Product is: %.4f \n", product);
        return product;
    }

    public static float divide(float firstNumber, float secondNumber) {
        float quotient = firstNumber / secondNumber;
        System.out.printf("Quotient is: %.4f \n", quotient);
        return quotient;
    }
}
