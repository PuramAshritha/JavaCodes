package com.logicalStatements.Loops;

import java.util.Scanner;

public class TestLsDemo10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		int r = 0;
		int rev = 0;
		while (n > 0) {
			r = n % 10;
			n = n / 10;
			rev = rev * 10 + r;
		}
		System.out.println("The reverse of the given number is: " + rev);
		sc.close();
	}

}
