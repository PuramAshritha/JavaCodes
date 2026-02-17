package com.simplePrograms;

public class Books {
	int bookId;
	String title;
	String author;
	static int price;

	static double discountPrice() {
		double dp = price - (price * 0.1);
		return dp;
	}

	void PrintStatements() {
		System.out.println("Book Id: " + bookId);
		System.out.println("Book Title: " + title);
		System.out.println("Book Author: " + author);
		System.out.println("Selling Price: " + price);
		System.out.println("Discounted Price : " + discountPrice());
	}

	public static void main(String[] args) {
		Books a1 = new Books();
		a1.bookId = 10;
		a1.title = "Pride and Prejudice";
		a1.author = "Jane Austen";
		a1.price = 500;
		a1.PrintStatements();
	}

}
