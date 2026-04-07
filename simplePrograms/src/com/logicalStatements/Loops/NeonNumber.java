package com.logicalStatements.Loops;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		int n1 = n * n;
		int r, sum = 0;
		while (n1 > 0) {
			r = n1 % 10;
			n1 = n1 / 10;
			sum = sum + r;
		}
		if (n == sum) {
			System.out.println("The Given Number is Neon Number");
		} else {
			System.out.println("The Given Number is Not Neon Number");
		}
		sc.close();
	}

}
