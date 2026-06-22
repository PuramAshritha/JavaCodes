package com.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			String name = "Ashritha";
			System.out.println("length of name: " + name.length());
		} catch (NullPointerException ex) {
			System.err.println(ex);
		}
		try {
			System.out.println("Enter age: ");
			int age = sc.nextInt();
			System.out.println("age is " + age);
		} catch (InputMismatchException e) {
			System.err.println("Entered wrong age");
		}
		try {
			System.out.println("Enter total marks: ");
			int marks = sc.nextInt();
			System.out.println("Enter total number of subjects: ");
			int subjects = sc.nextInt();
			System.out.println("Average: " + marks / subjects);
		} catch (Exception ex) {
			System.err.println(ex);
		}
			try {
				int[] arr = { 10, 20, 30 };
				System.err.println(arr[3]);
			} catch (ArrayIndexOutOfBoundsException exp) {
				System.err.println(exp.getMessage());
			} finally {
				sc.close();
			}

		}
	}
