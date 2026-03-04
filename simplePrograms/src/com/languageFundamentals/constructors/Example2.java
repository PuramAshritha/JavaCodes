package com.languageFundamentals.constructors;

public class Example2 {
	static int count = 0;

	Example2() {
		count++;
	}

	static int getCount() {
		return count;
	}

	public static void main(String[] args) {
		new Example2();
		new Example2();
		new Example2();
		System.out.println("The number of objects created :" + getCount());

	}

}
