package com.arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr= {6,10,5,3,4};
        for(int i=0;i<arr.length-1;i++) {
        	int minIndex=i;
        	   for(int j=i+1;j<arr.length-1;i++) {
        		   if(arr[j]<arr[minIndex]) {
        			   minIndex=j;
        		   }
        	   }
        		   int temp=arr[i];
        		   arr[i]=arr[minIndex];
        		   arr[minIndex]=temp;
        	   
        }
        	   System.out.println("Sorted Array: ");
        	  for(int a:arr) {
        		  System.out.print(a+" ");
        	  }
	}

}
