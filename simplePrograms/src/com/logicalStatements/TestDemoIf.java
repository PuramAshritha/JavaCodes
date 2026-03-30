package com.logicalStatements;

import java.util.Scanner;

public class TestDemoIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int no = sc.nextInt();
		if (no > 0) {
			System.out.println(no + " is a positive number");
		} else if (no == 0) {
			System.out.println("The number is zero");
		} else {
			System.out.println(no + " is a negitive number");
		}

		sc.close();
	}

}
