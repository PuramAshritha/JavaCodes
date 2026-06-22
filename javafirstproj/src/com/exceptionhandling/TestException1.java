package com.exceptionhandling;

import java.util.Scanner;

public class TestException1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter total marks: ");
			int sum = sc.nextInt();
			System.out.println("Enter how many subjects: ");
			int count = sc.nextInt();
			double Average = sum / count;
			System.out.println("Average: " + Average);
		} catch (ArithmeticException e) {
			System.err.println("number of subjects should not be Zero!!!!");
		}
		sc.close();
	}

}
