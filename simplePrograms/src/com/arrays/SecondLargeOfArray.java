package com.arrays;

import java.util.Scanner;

public class SecondLargeOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements into array: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int secondLar = arr[0];
		int lar = arr[0];
		for (int i = 0; i < n; i++) {
			if (arr[i] > lar) {
				secondLar = lar;
				lar = arr[i];
				
			} else if ((arr[i] > secondLar) && (arr[i] != lar)) {
				secondLar = arr[i];
			}
		}
		System.out.println("the Second largest is : " + secondLar);
		sc.close();
	}

}
