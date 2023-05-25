/************
 T.C. Sakarya University
 SWE202 Software Verification and Validation Homework 1
 Mehmet Fatih YILDIZ
 B201202013

 https://github.com/mfatihyildiz/SVaVHomework
 */

package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @ParameterizedTest
    @CsvSource({
            "10, 2, 5",
            "10, 4, 2.5",
            "12.5, 5, 2.5",
            "10, 2.5, 4",
            "12.5, 2.5, 5"
    })
    void testDivision(double num1, double num2, double result) {
        assertEquals(result, Calculator.divide(num1, num2));
    }

    @Test
    void testDivisionByZero() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.divide(12.5, 0),
                "IllegalArgumentException expected.");
    }
}