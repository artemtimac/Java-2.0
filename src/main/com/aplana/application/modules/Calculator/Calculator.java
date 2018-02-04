package com.aplana.application.modules.Calculator;

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
                System.out.println(new Add(firstNumber, secondNumber));
                break;
            case "-":
                System.out.println(new Subtract(firstNumber, secondNumber));
                break;
            case "*":
                System.out.println(new Multiply(firstNumber, secondNumber));
                break;
            case ":":
                try{
                    System.out.println(new Divide(firstNumber, secondNumber));
                } catch (DivideByZeroException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Please change the second number");
                }
                break;
            default:
                System.out.println("You entered an incorrect operation!");
        }
    }
}
