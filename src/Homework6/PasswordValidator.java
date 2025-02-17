package Homework6;

public class PasswordValidator {
    public static boolean isValidPassword(String password) {
    if (password.length() < 8) {
        return false;
    }

    boolean hasLetter = false;
    boolean hasDigit = false;
    boolean hasSpecialChar = false;

    for (char ch : password.toCharArray()) {
        if (Character.isLetter(ch)) {
            hasLetter = true;
        } else if (Character.isDigit(ch)) {
            hasDigit = true;
        } else if (!Character.isWhitespace(ch)) {
            hasSpecialChar = true;
        }
    }

    return hasLetter && hasDigit && hasSpecialChar;
}

    public static void main(String[] args) {
        String[] passwords = {
                "pass123",
                "password",
                "Pass1234",
                "P@ssword1",
                "Hello@2024"
        };

        for (String password : passwords) {
            System.out.println("Password: " + password + " -> " + (isValidPassword(password) ? "Valid" : "Not valid"));
        }
    }
}
