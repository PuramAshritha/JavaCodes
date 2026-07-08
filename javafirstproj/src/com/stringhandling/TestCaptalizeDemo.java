package com.stringhandling;

public class TestCaptalizeDemo {

	public static void main(String[] args) {
		String str = "hello world";
		String[] str1 = str.split(" ");
		String result = "";
		for (String word : str1) {
			result += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
		}
		System.out.println(result.trim());

	}

}
