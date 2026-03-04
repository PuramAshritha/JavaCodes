package com.languageFundamentals.constructors;

public class FoodOnlineOrder {
	double price;
	int quantity;

	double calculateItemTotal(double price, int quantity) {
		double amount = price * quantity;
		return amount;
	}

	double addGST(double amount) {
		return amount * 0.05;
	}

	double addDeliverCharges(double amount) {
		return amount + 40;
	}

	void printBill() {
		double total = calculateItemTotal(price, quantity);
		double gst = addGST(total);
		double Tamount = addDeliverCharges(total + gst);
		System.out.println("Total Amount : " + total);
		System.out.println("With GST :" + gst);
		System.out.println("Total Amount : " + Tamount);
	}

	public static void main(String[] args) {
		FoodOnlineOrder c1 = new FoodOnlineOrder();
		c1.price = 100.00;
		c1.quantity = 4;
		c1.printBill();
	}

}
