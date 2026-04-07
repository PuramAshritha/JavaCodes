package com.logicalStatements.Loops;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a Number: ");
		int n = sc.nextInt();
		int temp = n;
		int r, sum = 0;
		String s = Integer.toString(n);
		int count = s.length();
		while (n != 0) {
			r = n % 10;
			n = n / 10;
			sum = (int) (sum + Math.pow(r, count));
		}
		if (temp == sum) {
			System.out.println("The Given Number is Armstrong Number");
		} else {
			System.out.println("The Given Number is Not Armstrong Number");
		}
		sc.close();
	}

}
