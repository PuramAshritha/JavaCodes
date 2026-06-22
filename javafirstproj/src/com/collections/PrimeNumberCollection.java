package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class PrimeNumberCollection {
	public static boolean isPrime(int n) {

		if (n <= 0) {
			return false;

		}
		if (n % 2 == 0) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Collection<Integer> c = new ArrayList<>();
		c.add(10);
		c.add(11);
		c.add(13);
		c.add(15);
		c.add(17);
		c.add(20);
		System.out.println("The prime numbers are: ");
		for (int num : c) {
			if (isPrime(num)) {
				System.out.print(num + " ");
			}
		}
	}

}
