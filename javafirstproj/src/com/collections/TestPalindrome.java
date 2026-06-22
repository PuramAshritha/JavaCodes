package com.collections;

import java.util.LinkedList;

public class TestPalindrome {

	public static void main(String[] args) {
		LinkedList<Integer> li=new LinkedList<>();
		 
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(2);
		li.add(1);
		
		LinkedList<Integer> rev=new LinkedList<>();
		
		for(int n:li) {
			rev.addFirst(n);
		}
		if(li.equals(rev)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
	}

}
