package Homework4;

public class ArrayAverage {
    public static void main(String[] args) {
        int[] numbers = new int[20];

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 5;
            sum += numbers[i];
        }

        double average = (double) sum / numbers.length;

        System.out.println("The array contains the following values:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println("\nThe average value of the elements in the array is: " + average);
    }
}