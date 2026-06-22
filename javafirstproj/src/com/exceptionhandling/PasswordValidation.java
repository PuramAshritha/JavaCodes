package com.exceptionhandling;

import java.util.Scanner;
import java.util.regex.Pattern;

@SuppressWarnings("serial")
class WeakPasswordException extends Exception {
    public WeakPasswordException(String message) {
        super(message);
    }
}

public class PasswordValidation {

    public static void validatePassword(String password) throws WeakPasswordException {

        if (password.length() < 8) {
            throw new WeakPasswordException("Password must be at least 8 characters long.");
        }

        if (!Pattern.matches(".*\\d.*", password)) {
            throw new WeakPasswordException("Password must contain at least one digit (0-9).");
        }

        System.out.println("Password is Strong");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        try {
            validatePassword(password);
        } catch (WeakPasswordException e) {
            System.out.println("WeakPasswordException: " + e.getMessage());
        }

        sc.close();
    }
}
