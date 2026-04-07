package com.logicalStatements;

import java.util.Scanner;

public class Factorial {
	static int FindFact(int n) {
		if (n == 1) {
			return 1;
		}
		return n * FindFact(n - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int ft = FindFact(n);
		System.out.println("The factoral of the given number is: " + ft);
		sc.close();
	}

}
