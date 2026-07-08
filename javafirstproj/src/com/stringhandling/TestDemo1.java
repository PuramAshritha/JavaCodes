package com.stringhandling;

public class TestDemo1 {

	public static void main(String[] args) {
		String str="hello world";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}

}
