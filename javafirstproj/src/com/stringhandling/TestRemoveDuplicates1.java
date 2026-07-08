package com.stringhandling;

import java.util.LinkedHashSet;

public class TestRemoveDuplicates1 {

	public static void main(String[] args) {
		String str = "programming";
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for (char ch : str.toCharArray()) {
			set.add(ch);
		}
		for (char ch : set) {
			System.out.print(ch);
		}
	}

}
