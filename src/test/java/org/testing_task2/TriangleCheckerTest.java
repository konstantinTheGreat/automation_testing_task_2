package org.testing_task2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleCheckerTest {

    @Test
    void testInvalidTriangleZeroSide() {
        assertEquals("Invalid", TriangleChecker.getTriangleType(0, 1, 1));
    }

    @Test
    void testInvalidTriangleSumEqualsThird() {
        assertEquals("Invalid", TriangleChecker.getTriangleType(1, 2, 3));
    }

    @Test
    void testInvalidTriangleSumLessThanThird() {
        assertEquals("Invalid", TriangleChecker.getTriangleType(10, 2, 5));
    }

    @Test
    void testEquilateralTriangle() {
        assertEquals("Equilateral", TriangleChecker.getTriangleType(5, 5, 5));
    }

    @Test
    void testIsoscelesTriangle() {
        assertEquals("Isosceles", TriangleChecker.getTriangleType(5, 5, 3));
    }

    @Test
    void testIsoscelesTriangleAlternateOrder() {
        assertEquals("Isosceles", TriangleChecker.getTriangleType(3, 5, 5));
    }

    @Test
    void testScaleneTriangle() {
        assertEquals("Scalene", TriangleChecker.getTriangleType(3, 4, 5));
    }

    @ParameterizedTest
    @CsvSource({
            "0, 1, 1, Invalid",
            "1, 2, 3, Invalid",
            "10, 2, 5, Invalid",
            "5, 5, 5, Equilateral",
            "5, 5, 3, Isosceles",
            "3, 5, 5, Isosceles",
            "3, 4, 5, Scalene"
    })
    void testTriangleType(int a, int b, int c, String expectedResult) {
        assertEquals(expectedResult, TriangleChecker.getTriangleType(a, b, c));
    }
}
