package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class SecondLargest {

	public static void main(String[] args) {
		Collection<Integer> c= new ArrayList<>();
		c.add(10);
		c.add(25);
		c.add(40);
		c.add(15);
		c.add(35);
		c.add(20);
		int largest =Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		
		for(int num:c) {
			if(num>largest) {
				secondLargest =largest;
				largest =num;
			}else if (num >secondLargest && num !=largest) {
				secondLargest =num;
			}
		}
		System.out.println("Second largest Element= "+secondLargest);
	}

}
