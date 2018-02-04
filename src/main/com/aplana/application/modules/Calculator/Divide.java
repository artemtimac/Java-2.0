package com.aplana.application.modules.Calculator;

/**
 * Divide operation
 *
 * @author Artem Tugushev
 */
public class Divide implements Operation {
    private float firstNumber;
    private float secondNumber;

    public Divide(float firstNumber, float secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;

        if (secondNumber == 0) throw new DivideByZeroException("Divide by Zero!");
    }

    @Override
    public float calculate() {
        float quotient = 0;

        try {
            quotient = firstNumber / secondNumber;
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

        return quotient;
    }

    @Override
    public String toString() {
        return String.format("Quotient is: %.4f \n", calculate());
    }
}
