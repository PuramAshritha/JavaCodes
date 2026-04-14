package com.arrays;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		String str = "";
		while (n != 0) {
			int r = n % 2;
			str = r + str;
			n = n / 2;
		}
		System.out.println("THe binary number is: " + str);
		sc.close();
	}

}
