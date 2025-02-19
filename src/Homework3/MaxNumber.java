package Homework3;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        int maxNumber;

        if (num1 >= num2 && num1 >= num3) {
            maxNumber = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            maxNumber = num2;
        } else {
            maxNumber = num3;
        }

        System.out.println("The largest number is: " + maxNumber);

        scanner.close();
    }
}