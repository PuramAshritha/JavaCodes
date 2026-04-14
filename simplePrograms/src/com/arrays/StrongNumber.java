package com.arrays;

import java.util.Scanner;

public class StrongNumber {
	static int fact(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int temp = n;
		int sum = 0;
		while (temp > 0) {
			int r = temp % 10;
			sum += fact(r);
			temp = temp / 10;
		}
		if (sum == n) {
			System.out.println("The given number is happy number");
		} else {
			System.out.println("The given number is not a happy number");
		}
		sc.close();
	}

}
