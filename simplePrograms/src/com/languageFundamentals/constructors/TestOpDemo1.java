package com.languageFundamentals.constructors;

import java.util.Scanner;

public class TestOpDemo1 {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter a number: ");
        int a= sc.nextInt();
        String s1=((a&1)==0)?"Even":"Odd";
        System.out.println(s1);
        sc.close();
	}

}
