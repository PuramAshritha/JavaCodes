package com.arrays;

public class LargestAndSmallest {

	public static void main(String[] args) {
		int[] arr = { 10, 25, 40, 15 };
		int lar = arr[0];
		int small = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > lar) {
				lar = arr[i];
			} else if (arr[i] < small) {
				small = arr[i];
			}
		}
		System.out.println("The Largest number in array is: " + lar);
		System.out.println("The Smallest number in the given array is: " + small);
	}

}
