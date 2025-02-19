package Homework3;

import java.util.Scanner;

public class RectangleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle:");
        int length = scanner.nextInt();

        System.out.println("Enter the height of the rectangle:");
        int height = scanner.nextInt();

        int perimeter = 2 * (length + height);
        int area = length * height;

        System.out.println("The perimeter of the rectangle is: " + perimeter);
        System.out.println("The area of the rectangle is: " + area);

        scanner.close();
    }
}