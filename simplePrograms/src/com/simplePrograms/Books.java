package com.simplePrograms;

public class Books {
	int bookId;
	String title;
	String author;
	int price;

	double discountPrice() {
		return price - (price * 0.1);
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

		Books a2 = new Books();
		a2.bookId = 11;
		a2.title = "The Alchemist ";
		a2.author = "Paulo Coelho";
		a2.price = 600;

		a1.PrintStatements();
		a2.PrintStatements();
	}

}
