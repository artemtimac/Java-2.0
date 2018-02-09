package com.aplana.tests;

import com.aplana.application.modules.Calculator.*;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Calculator Unit Tests
 *
 * @author Artem Tugushev
 */
public class CalculatorTest {
    private float firstNumber = 7;
    private float secondNumber = 4;

    @Test
    public void testSum() {
        float sum = new Add(firstNumber, secondNumber).calculate();

        assertTrue("Results should be equal", (firstNumber + secondNumber) == sum);
    }

    @Test
    public void testSubtract() {
        float difference = new Subtract(firstNumber, secondNumber).calculate();

        assertTrue("Results should be equal", (firstNumber - secondNumber) == difference);
    }

    @Test
    public void testMultiply() {
        float product = new Multiply(firstNumber, secondNumber).calculate();

        assertTrue("Results should be equal", (firstNumber * secondNumber) == product);
    }

    @Test
    public void testDivide() {
        float quotient = new Divide(firstNumber, secondNumber).calculate();

        assertTrue("Divide by zero!", secondNumber != 0);
        assertTrue("Results should be equal", (firstNumber / secondNumber) == quotient);
    }
}
