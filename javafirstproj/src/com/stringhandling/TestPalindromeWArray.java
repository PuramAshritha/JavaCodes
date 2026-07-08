package com.stringhandling;

public class TestPalindromeWArray {

	public static void main(String[] args) {
		String[] arr = { "madam", "hello", "civic" };
		System.out.println("Palindrome Strings: ");
		for (String str : arr) {
			String rev = "";
			for (int i = str.length()-1; i >= 0; i--) {
				rev += str.charAt(i);
			}
			if (str.equals(rev)) {
				System.out.println(str);
			}
		}
	}
}
