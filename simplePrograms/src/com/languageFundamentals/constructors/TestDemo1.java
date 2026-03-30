package com.languageFundamentals.constructors;

class Vehicle {
	String brand;

	Vehicle(String brand) {
		this.brand = brand;
	}
}

class Car extends Vehicle {
	String name;
	String model;
	double price;

	Car(String name, String model, double price, String brand) {
		super(brand);
		this.name = name;
		this.model = model;
		this.price = price;
	}
}

class ElectricCar extends Car {
	double batteryCapacity;

	ElectricCar(String name, String model, double price, String brand, double batteryCapacity) {
		super(name, model, price, brand);
		this.batteryCapacity = batteryCapacity;
	}

	void display() {
		System.out.println("Name of the customer : " + name);
		System.out.println("Model of the car : " + model);
		System.out.println("Brand of the car :" + brand);
		System.out.println("Price of the car : " + price);
		System.out.println("Battery Capacity : " + batteryCapacity);
	}
}

public class TestDemo1 {

	public static void main(String[] args) {
		ElectricCar c1 = new ElectricCar("Ashritha", "sonet", 2000000.00, "Kia", 600000.0);
		c1.display();
	}

}
