package com.collections;

import java.util.LinkedList;

public class TestMissingNumber {

	public static void main(String[] args) {
		LinkedList<Integer> li = new LinkedList<>();

		li.add(1);
		li.add(2);
		li.add(3);
		li.add(5);
		li.add(6);

		int n = 6;
		int total = n * (n + 1) / 2;
		int sum=0;
		for(int num:li) {
			sum+=num;
		}
		int missing=total-sum;
		System.out.println("Missing number:"+missing);
	}

}
