package com.aplana.application.modules.Calculator;

/**
 * DivideByZeroException handling
 *
 * @author Artem Tugushev
 */
class DivideByZeroException extends ArithmeticException {
    public DivideByZeroException(String s) {
        super(s);
    }

    public DivideByZeroException() {
        super();
    }
}
