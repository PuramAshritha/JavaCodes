package com.oops1;

public class TestPassengerDemo {
	public static void main(String[] args) {
		Passenger p1 = new Passenger();
		p1.setName("Ashritha");
		p1.setContact(9234562344l);
		p1.setEmail("ashritha@gmail.com");
		System.out.println("Passport Number: " + p1.passportNumber);
		System.out.println("Name: " + p1.getName());
		System.out.println("Contact: " + p1.getContact());
		System.out.println("Email: " + p1.getEmail());
		
		System.out.println("**************************************");
		Passenger p2 = new Passenger();

		p2.setName("Gayatri");
		p2.setContact(723562344l);
		p2.setEmail("gayatri@gmail.com");
		System.out.println("Passport Number: " + p2.passportNumber);
		System.out.println("Name: " + p2.getName());
		System.out.println("Contact: " + p2.getContact());
		System.out.println("Email: " + p2.getEmail());

	}
}
