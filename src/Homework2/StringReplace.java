package Homework2;

public class StringReplace {
    public static void main(String[] args) {

        String originalText = "My name is <Test>";
        String replacement = "Bobi";
        String replacedText = originalText.replace("<Test>", replacement);
        System.out.println("Result after replacement: " + replacedText);

    }
}