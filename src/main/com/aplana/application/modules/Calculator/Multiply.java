package com.aplana.application.modules.Calculator;

/**
 * Multiply operation
 *
 * @author Artem Tugushev
 */
public class Multiply implements Operation {
    private float firstNumber;
    private float secondNumber;

    public Multiply(float firstNumber, float secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    @Override
    public float calculate() {
        float product = 0;

        try {
            product = firstNumber * secondNumber;
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

        return product;
    }

    @Override
    public String toString() {
        return String.format("Product is: %.4f \n", calculate());
    }
}
