package com.logicalStatements;

import java.util.Scanner;

public class TestForDemo {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the Limit: ");
		int n = Sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println("The Sum of Numbers is: " + sum);
		Sc.close();
	}

}
