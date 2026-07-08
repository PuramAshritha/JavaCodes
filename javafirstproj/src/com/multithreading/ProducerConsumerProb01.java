package com.multithreading;

class Warehouse {
	int stock = 20;

	public void addItems(int quantity) {
		stock += quantity;
		System.out.println("Supplier added " + quantity + " items.");
		System.out.println("Available Stock: " + stock);
	}

	public void removeItems(int quantity) {
		if (stock >= quantity) {
			stock -= quantity;
			System.out.println("Customer purchased " + quantity + " items.");
			System.out.println("Available Stock: " + stock);
		} else {
			System.out.println("Insufficient Stock");
		}
	}

	public int getStock() {
		return stock;
	}
}

class Supplier implements Runnable {
	Warehouse warehouse;

	Supplier(Warehouse warehouse) {
		this.warehouse = warehouse;
	}

	public void run() {
		warehouse.addItems(10);
	}
}

class Customer implements Runnable {
	Warehouse warehouse;

	Customer(Warehouse warehouse) {
		this.warehouse = warehouse;
	}

	public void run() {
		warehouse.removeItems(5);
	}
}

public class ProducerConsumerProb01 {
	public static void main(String[] args) throws InterruptedException {

		Warehouse warehouse = new Warehouse();

		Thread supplier = new Thread(new Supplier(warehouse));
		Thread customer = new Thread(new Customer(warehouse));

		supplier.start();
		customer.start();

		supplier.join();
		customer.join();

		System.out.println("Final Available Stock: " + warehouse.getStock());
	}
}