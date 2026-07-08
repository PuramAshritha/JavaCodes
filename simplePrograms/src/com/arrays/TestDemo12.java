package com.arrays;

public class TestDemo12 {

	public static void main(String[] args) {
		int[] arr = { -23, 1, 1, 2, 2, -2, -1, 1, -1 };
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] >= 0 && arr[j + 1] < 0) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int a : arr) {
			System.out.print(a + " ");
		}

	}

}
