package com.arrays;

public class TestselectionSortDemo {

	public static void main(String[] args) {
		int[] arr= {45,10,5,7,56,8,27};
		int temp=0;
		for (int i =0;i<arr.length;i++) {
			int midIndex=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[midIndex]) {
					midIndex=j;
				}
			}
			temp=arr[midIndex];
			arr[midIndex]=arr[i];
			arr[i]=temp;
		}
		System.out.println("After Sorting: ");
		for(int a:arr) {
			System.out.print(a+" ");
		}

	}

}
