package com.logicalStatements;

import java.util.Scanner;

public class TestLSDemo5 {
	static boolean IsPrime(int n) {
		boolean status = true;
		if (n == 0 || n == 1) {
			return false;
		} else {
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					return false;
				}
			}
		}
		return status;

	}

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = Sc.nextInt();
		for (int i = 0; i <= n; i++) {
			if (IsPrime(i)) {
				System.out.print(i);
				System.out.print(" ");
			}
		}
		Sc.close();
	}

}
