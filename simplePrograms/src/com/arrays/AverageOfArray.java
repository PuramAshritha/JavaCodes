package com.arrays;

import java.util.Scanner;

public class AverageOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter " + n + " elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for (int a : arr) {
			sum += a;
		}
		int avg = sum / n;
		System.out.println("The average of the given digits is : " + avg);
		sc.close();
	}

}
