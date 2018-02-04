package com.aplana.application.modules.Calculator;

/**
 * Subtract operation
 *
 * @author Artem Tugushev
 */
public class Subtract implements Operation {
    private float firstNumber;
    private float secondNumber;

    public Subtract(float firstNumber, float secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    @Override
    public float calculate() {
        float difference = 0;

        try {
            difference = firstNumber - secondNumber;
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

        return difference;
    }

    @Override
    public String toString() {
        return String.format("Difference is: %.4f \n", calculate());
    }
}
