package com.aplana.tasks;

import java.util.Scanner;

/**
 * Calculator
 *
 * @author Artem Tugushev
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        float firstNumber = scanner.nextFloat();
        System.out.println("Enter the second number: ");
        float secondNumber = scanner.nextFloat();

        sum(firstNumber, secondNumber);
        subtract(firstNumber, secondNumber);
        multiply(firstNumber, secondNumber);
        divide(firstNumber, secondNumber);

        scanner.close();
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
