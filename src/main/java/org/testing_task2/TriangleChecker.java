package org.testing_task2;

public class TriangleChecker {
    public static String getTriangleType(int A, int B, int C) throws IllegalArgumentException {
        try {
            if (C - A >= B || B - A >= C || A - B >= C) {
                return "Not a valid triangle. No such triangle exists!";
            }
            if (A <= 0 || B <= 0 || C <= 0) {
                return "Not a valid triangle. No such triangle exists!";
            }
            if (A == B && B == C) {
                return "Equilateral";
            } else if (A == B || B == C || A == C) {
                return "Isosceles";
            } else {
                return "Scalene";
            }
        }
        catch (IllegalArgumentException e) {
            return "Invalid";
        }
    }
}

