package com.arrays;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int[] arr = { 12,13,14,15,17,18,19,20 };
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i + 1] - arr[i]!=1) {
				System.out.println("The Missing number is : " + (arr[i] + 1));
				break;
			}
		}

	}

}
