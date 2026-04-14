package com.arrays;

import java.util.Scanner;

public class PrimeInArray {
	static boolean isPrime(int a) {
		boolean flag = true;
		if (a == 0 || a == 1) {
			return false;
		}
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter " + n + " elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The Prime Numbers are: ");
		for (int a : arr) {
			if (isPrime(a)) {
				System.out.print(a + " ");
			}

		}
		sc.close();
	}

}
