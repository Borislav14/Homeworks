package Homework4;

public class FibonacciSum {
    public static void main(String[] args) {
        int N = 12;

        int sum = calculateFibonacciSum(N);

        System.out.println("The sum of the former " + N + " member of the Fibonacci sequence is: " + sum);
    }

    public static int calculateFibonacciSum(int N) {
        int a = 0, b = 1, sum = 0;

        for (int i = 0; i < N; i++) {
            sum += a;
            int next = a + b;
            a = b;
            b = next;
        }

        return sum;
    }
}