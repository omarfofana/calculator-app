package com.example.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void shouldAddTwoNumbers() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void shouldSubtractTwoNumbers() {
        assertEquals(1, calculator.subtract(3, 2));
    }

    @Test
    void shouldMultiplyTwoNumbers() {
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    void shouldDivideTwoNumbers() {
        assertEquals(2.0, calculator.divide(6, 3));
    }

    @Test
    void shouldThrowExceptionWhenDivideByZero() {
        assertThrows(IllegalArgumentException.class,
                () -> calculator.divide(10, 0));
    }

    @Test
    void shouldDetectEvenNumber() {
        assertTrue(calculator.isEven(4));
        assertFalse(calculator.isEven(5));
    }
}
