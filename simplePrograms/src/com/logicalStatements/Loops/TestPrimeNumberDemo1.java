package com.logicalStatements.Loops;

import java.util.Scanner;

public class TestPrimeNumberDemo1 {
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
		System.out.println("Enter range start: ");
		int n = sc.nextInt();
		System.out.println("Enter the range end: ");
		int n1 = sc.nextInt();
		int sum = 0;
		for (int i = n; i < n1; i++) {
			if (IsPrime(i)) {
				sum = sum + i;
			}
		}
		System.out.println("Sum of primes in between give range is: " +sum);
		sc.close();

	}

}
