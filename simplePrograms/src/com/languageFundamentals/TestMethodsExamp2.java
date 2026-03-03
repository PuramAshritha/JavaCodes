package com.languageFundamentals;

import java.util.Scanner;

public class TestMethodsExamp2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Id: ");
		int sId = sc.nextInt();
		System.out.println("Enter your First Name: ");
		String fName = sc.next();
		System.out.println("Enter your Last Name: ");
		String lName = sc.next();
		System.out.println("Student Id is : " + sId);
		System.out.println("Full Name is : " + getFullName(fName, lName));
		sc.close();
	}

	static String getFullName(String fn, String ln) {
		return fn + " " + ln;
	}
}
