package com.arrays;

public class MissingNumberInArray1 {

	public static void main(String[] args) {
		int[] arr= {1,2,4,5};
		int sum=0;
		int n=arr.length+1;
		int exSum=n*(n+1)/2;
		for(int a:arr) {
			sum+=a;
		}
        System.out.println("The missing number is: "+(exSum-sum));
	}

}
