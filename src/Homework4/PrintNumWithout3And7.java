package Homework4;

public class PrintNumWithout3And7 {
    public static void main(String[] args) {
        int N = 25;

        printNumbersSkipping3And7(N);
    }

    public static void printNumbersSkipping3And7(int N) {
        for (int i = 1; i <= N; i++) {
            if (i % 3 != 0 && i % 7 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}