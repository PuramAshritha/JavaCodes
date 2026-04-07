package com.logicalStatements.Loops;

import java.util.Scanner;

public class TestLsDemo9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to Add: ");
		int n = sc.nextInt();
		int r = 0;
		int sum = 0;
		while (n != 0) {
			r = n % 10;
			n = n / 10;
			sum = sum + r;
		}
		System.out.println("The sum of digits of given number is: " + sum);
		sc.close();

	}

}
