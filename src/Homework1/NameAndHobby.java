package Homework1;

import java.util.Scanner;

public class NameAndHobby {
    public static void main(String[] args) {
        System.out.println("Please fill in name: ");

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        System.out.println(userName + " What is your favourite hobby?");
        String hobby = scanner.nextLine();

        System.out.println("Nice to meet you " + userName + "! " + hobby + " is really nice hobby.");

    }
}