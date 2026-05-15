package com.applications;

import java.util.Scanner;
import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		int randomNumber = rand.nextInt(50) + 1; // 1 to 100
		int userGuess = 0;
		int attempts = 0;

		System.out.println("Welcome to Number Guessing Game!");
		System.out.println("Guess a number between 1 and 50");

		while (userGuess != randomNumber) {
			System.out.print("Enter your guess: ");
			userGuess = sc.nextInt();
			attempts++;

			if (userGuess < randomNumber) {
				System.out.println("Too low! Try again.");
			} else if (userGuess > randomNumber) {
				System.out.println("Too high! Try again.");
			} else {
				System.out.println("Correct! You guessed it in " + attempts + " attempts.");
			}
		}

		sc.close();
	}
}
