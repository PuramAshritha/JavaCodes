package com.logicalStatements;

import java.util.Scanner;

public class TestLSDemo4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age: ");
		int age = sc.nextInt();
		if (age > 0 && age < 5) {
			System.out.println("Child");
		} else if (age > 5 && age < 13) {
			System.out.println("Kid");
		} else if (age > 12 && age < 20) {
			System.out.println("Teen Age");
		} else if (age > 19 && age < 36) {
			System.out.println("Young");
		} else if (age > 35 && age < 60) {
			System.out.println("Middle Age");
		} else if (age > 59) {
			System.out.println("Old Age");
		} else {
			System.out.println("Invalid Age");
		}
		sc.close();
	}

}
