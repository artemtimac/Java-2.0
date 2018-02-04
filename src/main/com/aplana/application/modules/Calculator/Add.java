package com.aplana.application.modules.Calculator;

/**
 * Add operation
 *
 * @author Artem Tugushev
 */
public class Add implements Operation {
    private float firstNumber;
    private float secondNumber;

    public Add(float firstNumber, float secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    @Override
    public float calculate() {
        float sum = 0;

        try {
            sum = firstNumber + secondNumber;
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

        return sum;
    }

    @Override
    public String toString() {
        return String.format("Sum is: %.4f \n", calculate());
    }
}
