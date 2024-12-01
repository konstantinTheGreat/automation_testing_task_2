package org.testing_task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int A;
        int B;
        int C;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sides of the triangle: ");
        System.out.println("A: ");
        A = scanner.nextInt();
        System.out.println("B: ");
        B = scanner.nextInt();
        System.out.println("C: ");
        C = scanner.nextInt();


        System.out.println(TriangleChecker.getTriangleType(A, B, C));
    }

}