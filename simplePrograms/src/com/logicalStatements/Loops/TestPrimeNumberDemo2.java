package com.logicalStatements.Loops;

import java.util.Scanner;

public class TestPrimeNumberDemo2 {
	static boolean IsPrime(int n) {
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Prime number: ");
		int a = sc.nextInt();
		while (!IsPrime(a)) {
			System.out.println("Invalid Input!  Enter a Prime number: ");
			a = sc.nextInt();
		}
		System.out.println("Enter another Prime Number: ");
		int b = sc.nextInt();
		while (!IsPrime(b)) {
			System.out.println("Enter Another Prime Number: ");
			b = sc.nextInt();
		}
		int c = a + b;
		if (IsPrime(c)) {
			System.out.println(c + " is a Prime Number.");
		} else {
			System.out.println(c + " is not a Prime Number.");
		}
		sc.close();
	}

}
