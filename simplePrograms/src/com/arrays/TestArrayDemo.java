package com.arrays;

public class TestArrayDemo {
	public static void main(String[] argd) {
		int[] numbers = { 10, 15, 20, 25, 30 };
		System.out.println("Even Numbers: ");
		for (int n : numbers) {
			if (n % 2 == 0) {
				System.out.println(n + " ");
			}
		}
		System.out.println("Odd numbers: ");
		for (int n : numbers) {
			if (n % 2 != 0) {
				System.out.println(n + " ");
			}
		}

	}
}
