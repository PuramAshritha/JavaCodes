package com.Starpatterns;

public class AlphabetPattern {

	public static void main(String[] args) {
		char[] arr = {'D','H','O','N','I'};
		char ch = 'A';
		int n=arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j||i+j==n-1) {
					System.out.print(arr[i]+" ");
				}
				else {
					System.out.print(ch+" ");
					ch++;
				}
			}
			System.out.println();
		}
	}

}
