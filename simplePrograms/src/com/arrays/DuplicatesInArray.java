package com.arrays;

public class DuplicatesInArray {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 20, 10, 40, 10,30, 20, 50, 100 };
		for (int i = 0; i < arr.length; i++) {
			boolean isDuplicate = false;
			for (int j =0; j < i; j++) {
				if (arr[i] == arr[j]) {
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {
				for (int k = i+1; k < arr.length; k++) {
					if (arr[i] == arr[k]) {
						System.out.println(arr[i]);
						break;
					}
				}
			}
		}
	}

}
