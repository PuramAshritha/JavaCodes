package com.logicalStatements.Loops;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		int r = 0;
		int sum = n;
		while (sum > 9) {
			int temp = sum;
			sum = 0;
			while (temp != 0) {
				r = temp % 10;
				temp = temp / 10;
				sum += r * r;
			}
		}
		if (sum == 1) {
			System.out.println("The given Number is Happy Number");
		} else {
			System.out.println("The Given number is not Happy Number");
		}

		sc.close();

	}

}
