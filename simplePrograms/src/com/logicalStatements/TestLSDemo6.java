package com.logicalStatements;

import java.util.Scanner;

public class TestLSDemo6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Limit: ");
		int n = sc.nextInt();
		int sum = 0;
		int sum1 = 0;
		int count = 0;
		int count1 = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
				count++;
			} else {
				sum1 = sum1 + i;
				count1++;
			}
		}
		System.out.println("The sum of even numbers is: " + sum);
		System.out.println("the sum of odd numbers is: " + sum1);
		System.out.println("The count of even numbers is: " + count);
		System.out.println("the count of odd numbers is: " + count1);
		sc.close();
	}
}
