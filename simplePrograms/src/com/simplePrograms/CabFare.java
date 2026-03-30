package com.simplePrograms;

public class CabFare {
	String cname;
	double distance;
	static int pricePerKm = 15;

	double calculateFare() {
		return distance * pricePerKm;
	}

	double addPlatformFee() {
		return calculateFare() + 30;
	}

	void show() {
		System.out.println("Name Of the Customer :" + cname);
		System.out.println("Distance : " + distance);
		System.out.println("Price Per Kilometers : " + pricePerKm);
		System.out.println("Fare : " + calculateFare());
		System.out.println("Platform Fee : 30 rupees");
		System.out.println("Total Amount to be paid: " + addPlatformFee());
		System.out.println("********************");
	}

	public static void main(String[] args) {
		CabFare customer1 = new CabFare();
		customer1.cname = "Ashritha";
		customer1.distance = 10.2;
		customer1.show();

		CabFare customer2 = new CabFare();
		customer2.cname = "deepthi";
		customer2.distance = 12.1;
		customer2.show();
	}

}
