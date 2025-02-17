package Homework6;

import java.util.Scanner;

public class NumberChecker {
    public static boolean arePositive(int a, int b, int c) {
        return a > 0 && b > 0 && c > 0;
    }

    public static boolean areEqual(int a, int b, int c) {
        return a == b && b == c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (arePositive(num1, num2, num3)) {
            System.out.println("All numbers are positive.");
        } else {
            System.out.println("Not all numbers are positive.");
        }

        if (areEqual(num1, num2, num3)) {
            System.out.println("The numbers are equal.");
        } else {
            System.out.println("The numbers not are equal.");
        }
        scanner.close();
    }
}