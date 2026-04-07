package com.logicalStatements.Loops;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int temp=n;
		int r=0;
		int rev=0;
		
		while(n>0) {
			r=n%10;
			n=n/10;
			rev=rev*10+r;
		}
		if(temp==rev) {
			System.out.println("The given number is a palindrome");
			
		}else {
			System.out.println("The given number is not a Palindrome");
		}
     sc.close();
	}

}
