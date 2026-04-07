package com.logicalStatements.Loops;

import java.util.Scanner;

public class ArmStrongNumber1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int temp = n;
		int n1 = n;
		int r, count = 0;
		int sum = 0;
		while (n > 0) {
			r = n % 10;
			n = n / 10;
			count++;
		}
		while (n1 > 0) {
			r = n1 % 10;
			n1 = n1 / 10;
			sum = (int) (sum + Math.pow(r, count));
		}
		if (sum == temp) {
			System.out.println("The Given Number is Armstrong Number ");
		} else {
			System.out.println("The Given Number is Not Armstrong Number ");
		}
		sc.close();
	}

}
