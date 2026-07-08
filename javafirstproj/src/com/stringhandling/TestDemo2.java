package com.stringhandling;

import java.util.HashSet;

public class TestDemo2 {

	public static void main(String[] args) {
		String str="pwwlewp";
		HashSet<Character> set=new HashSet<>();
		int max=0;
		int start=0;
		for(int i=0;i<str.length();i++) {
			while(set.contains(str.charAt(i))) {
				set.remove(str.charAt(start));
				start++;
			}
			set.add(str.charAt(i));
			if(set.size()>max) {
				max=set.size();
			}
		}
		System.out.println("Length of Longest String: "+max);
	}

}
