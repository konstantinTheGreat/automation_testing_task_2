package org.testing_task2;

public class TriangleChecker {
    public static String getTriangleType(int A, int B, int C) {
        if (A + B <= C || A + C <= B || B + C <= A) {
            return "Invalid";
        }
        if (A <= 0 || B <= 0 || C <= 0) {
            return "Invalid";
        }
        if (A == B && B == C) {
            return "Equilateral";
        } else if (A == B || B == C || A == C) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }
}

