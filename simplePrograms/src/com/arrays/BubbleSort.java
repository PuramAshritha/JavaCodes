package com.arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr= {5,3,1,8,2};
		int temp=0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
			System.out.println("Sorted array is : ");
			for (int a:arr) {
				System.out.print(a+" ");
			}
	}
	}

