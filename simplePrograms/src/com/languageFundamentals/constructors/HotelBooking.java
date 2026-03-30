package com.languageFundamentals.constructors;

public class HotelBooking {
	String QuestName;
	int roomRentPerDay;
	int noOfDays;

	HotelBooking(String QuestName, int roomRentPerDay, int noOfDays) {
		this.QuestName = QuestName;
		this.roomRentPerDay = roomRentPerDay;
		this.noOfDays = noOfDays;
	}

	double calculateCost() {
		return roomRentPerDay * noOfDays;
	}

	double calculateLuxuryTax() {
		return calculateCost() * 12 / 100;
	}

	double totalAmount() {
		return calculateCost() + calculateLuxuryTax();
	}

	void display() {
		System.out.println("Name of the Quest : " + QuestName);
		System.out.println("Room Rent Per Day : " + roomRentPerDay);
		System.out.println("Number of Days the Quest Stays : " + noOfDays);
		System.out.println("Cost of the stay : " + calculateCost());
		System.out.println("Luxury Tax(12%) : " + calculateLuxuryTax());
		System.out.println("Total Cost To be paid by Quest : " + totalAmount());
		System.out.println("*********************************");
	}

	public static void main(String[] args) {
		HotelBooking q1 = new HotelBooking("Ashritha", 2000, 2);
		q1.display();
		 
		HotelBooking q2 = new HotelBooking("Deepthi", 2500,3);
		q2.display();

	}

}
