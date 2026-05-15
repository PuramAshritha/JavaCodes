package com.Starpatterns;

import java.util.Scanner;

public class DiagonalSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the rows count: ");
		int row = sc.nextInt();
		System.out.println("enter columns count: ");
		int col = sc.nextInt();
		int[][] arr = new int[row][col];
		System.out.println("Enter the matrix: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int sum = 0;
		for (int i = 0; i < Math.min(row, col); i++) {
					sum += arr[i][i];
		}
		System.out.println(sum);
		sc.close();
	}

}
