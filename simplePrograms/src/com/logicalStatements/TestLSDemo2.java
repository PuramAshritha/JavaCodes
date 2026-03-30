package com.logicalStatements;

import java.util.Scanner;

public class TestLSDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int numb = sc.nextInt();
		if (numb % 5 == 0 && numb % 11 == 0) {
			System.out.println(numb + " is divisible by both 5 qnd 11");
		} else if (numb % 5 == 0) {
			System.out.println(numb + " is divisible by only 5");
		} else if (numb % 11 == 0) {
			System.out.println(numb + " is divisible by only 11");
		} else {
			System.out.println(numb + " is not divisible by 5 or 11");
		}
		sc.close();
	}

}
