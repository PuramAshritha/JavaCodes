package com.multithreading;

public class TestTables extends Thread {
	int number;

	TestTables(int number) {
		this.number = number;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(number + "X" + i + "=" + (number * i));
		}

	}

	public static void main(String[] args) {
		TestTables t1 = new TestTables(2);
		TestTables t2 = new TestTables(3);
		TestTables t3 = new TestTables(5);
		t1.start();
		t2.start();
		t3.start();

	}

}
