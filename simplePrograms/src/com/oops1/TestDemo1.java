package com.oops1;

import java.util.Scanner;

public class TestDemo1 {
// Write a Java program that accepts a numerical range from the user and identifies 
//	exactly the first five prime numbers within that range. Once collected, analyze their 
//	sum. check whether the sum is even or odd. 
//	Input: range from 1 to 20 
//	Output:2, 3, 5, 7, 11,    sum:28 ,  sum of prime numbers is even
	public static boolean IsPrime(int n) {
		if(n<=1) {
			return false;
		}
		for (int i = 2; i <= n/2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range Start: ");
		int n = sc.nextInt();
		System.out.println("Enter the Range End: ");
		int n1 = sc.nextInt();
		int sum = 0;
		int count = 0;
			for (int i = n; i < n1&&count<5; i++) {
				if (IsPrime(i)) {
					sum = sum + i;
					count++;
				}
			}
			 System.out.println("Sum of Prime Numbers: " + sum);

		        if (sum % 2 == 0) {
		            System.out.println("Sum of prime numbers is EVEN");
		        } else {
		            System.out.println("Sum of prime numbers is ODD");
		        }

		sc.close();
	}

}
