package com.arrays;

import java.util.Scanner;

public class CountOfEvenAndOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter " + n + " elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int count = 0;
		int count1 = 0;
		for (int a : arr) {
			if (a % 2 == 0) {
				count++;
			} else {
				count1++;
			}
		}
		System.out.println("The count of even numbers is: " + count);
		System.out.println("The count of odd numbers is: " + count1);
		sc.close();

	}

}
