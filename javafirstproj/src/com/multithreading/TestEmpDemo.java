package com.multithreading;

public class TestEmpDemo implements Runnable {
	String message;

	TestEmpDemo(String message) {
		this.message = message;
	}

	public static void main(String[] args) {
		TestEmpDemo r1 = new TestEmpDemo("Employee name: Ashritha");
		Thread t1 = new Thread(r1);
		TestEmpDemo r2 = new TestEmpDemo("Employee Id: emp101");
		Thread t2 = new Thread(r2);
		TestEmpDemo r3 = new TestEmpDemo("Employee salary: 100000");
		Thread t3 = new Thread(r3);
		t1.start();
		t2.start();
		t3.start();
	}

	@Override
	public void run() {
		System.out.println(message);
	}

}
