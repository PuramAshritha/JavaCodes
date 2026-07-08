package com.stringhandling;

public class TestDemo3 {

	public static void main(String[] args) {
		String s="abc@123";
		
		int v=0;
		int c=0;
		int special=0;
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(Character.isLetter(ch)){
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					v++;
				}else {
					c++;
				}
			}
			else {
				special++;
			}
		}
		System.out.println("Vowels: "+v);
		System.out.println("Consonants: "+c);
		System.out.println("Special Characters: "+special);
	}

}
