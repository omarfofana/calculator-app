package com.example.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AdvancedCalculatorTest {

    private final AdvancedCalculator calculator = new AdvancedCalculator();

    @Test
    void shouldCalculateSquare() {
        assertEquals(9, calculator.square(3));
    }

    @Test
    void shouldReturnMaxValue() {
        assertEquals(10, calculator.max(10, 3));
    }

    @Test
    void shouldReturnMinValue() {
        assertEquals(3, calculator.min(10, 3));
    }
}
