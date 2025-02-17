package Homework8;

import java.util.Random;

public class RandomArray {
    public static int[] generateRandomArray(int length) {

        int[] array = new int[length];
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(100);
        }

        return array;
    }

    public static void main(String[] args) {
        int length = 5;

        try {
            int[] randomArray = generateRandomArray(length);

            System.out.print("Generated array: ");
            for (int num : randomArray) {
                System.out.print(num + " ");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
