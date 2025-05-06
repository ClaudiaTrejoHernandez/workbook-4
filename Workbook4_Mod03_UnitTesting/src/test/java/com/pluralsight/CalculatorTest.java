package com.pluralsight;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add_ShouldReturnSumOfTwoNumbers() {
        // arrange
        int firstNumber = 2;
        int secondNumber = 4;
        int expectedResult = 6;
        Calculator cn = new Calculator();
        // act
        int actualFunctionResult = cn.add(firstNumber,secondNumber);
        // assert
        assertEquals(expectedResult, actualFunctionResult,"Calculator should add the two numbers");
    }

    @Test
    void subtract_ShouldReturnDifferanceOfTwoNumbers() {
        // arrange
        int firstNumber = 4;
        int secondNumber = 2;
        int expectedResult = 2;
        Calculator cn = new Calculator();
        // act
        int actualFunctionResult = cn.subtract(firstNumber,secondNumber);
        // assert
        assertEquals(expectedResult, actualFunctionResult,"Calculator should subtract the two numbers");
    }
}
