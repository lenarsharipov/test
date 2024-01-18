package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void test1() {
        int actual = calculator.add(2,  2);
        assertEquals(4, actual);
    }

}