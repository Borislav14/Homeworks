package Homework4;

public class SumEvenOddNum {
    public static void main(String[] args) {
    int[] numbers = {10, 7, 4, 15, 8, 21, 30, 11, 6, 17};

    int evenSum = 0, oddSum = 0;

    for (int num : numbers) {
        if (num % 2 == 0) {
            evenSum += num;
        } else {
            oddSum += num;
        }
    }

    System.out.println("The array contains the following numbers:");
    for (int num : numbers) {
        System.out.print(num + " ");
    }

    System.out.println("\nThe sum of the even numbers is: " + evenSum);
    System.out.println("The sum of the odd numbers is: " + oddSum);
}
}