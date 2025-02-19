package Homework4;

public class PrintNum {
    public static void main(String[] args) {
        int N = 12;

        printNumbersUpToN(N);
    }

    public static void printNumbersUpToN(int N) {
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}