package com.stringhandling;

public class TestCaptalizeDemo2 {

	public static void main(String[] args) {
		String str = "hello world";
		String result = " ";
		for (int i = 0; i < str.length(); i++) {
			if (i == 0 || str.charAt(i - 1) == ' ') {
				result += Character.toUpperCase(str.charAt(i));
			} else {
				result += str.charAt(i);
			}
		}
		System.out.println(result);
	}

}
