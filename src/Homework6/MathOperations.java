package Homework6;

public class MathOperations {
    public static double average (int a, int b) {
        return (a + b) / 2.0;
    }
    public static int sum(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 8;
        int num4 = 4;
        int result = sum(num3, num4);

        double avg = average(num1, num2);

        System.out.println("The average of the numbers " + num1 + " and " + num2 + " is: " + avg);
        System.out.println("The sum of the numbers " + num3 + " and " + num4 + " is: " + result);
    }
}