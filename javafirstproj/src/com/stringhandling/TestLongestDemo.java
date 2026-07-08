package com.stringhandling;

public class TestLongestDemo {

	public static void main(String[] args) {
		String str = "I Love Programming and debugging";
		String[] sen = str.split(" ");
		String Longest = "";
		String secondLon = "";
		for (String s : sen) {
			if (s.length() > Longest.length()) {
				secondLon = Longest;
				Longest = s;
			} else if (s.length() > secondLon.length() && !s.equals(Longest)) {
				secondLon = s;
			}
		}
		System.out.println("Longest word : " + Longest);
		System.out.println("Length : " + Longest.length());
		System.out.println("Second Longest : " + secondLon);
		System.out.println("Length : " + secondLon.length());
	}

}
