package Homework2;

public class WordCount {
    public static void main(String[] args) {
        String textToCount = "This is my homework";
        String[] words = textToCount.trim().split("\\s+");
        System.out.println("The number of words in the text: " + words.length);
    }
}