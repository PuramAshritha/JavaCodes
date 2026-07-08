package com.multithreading;

public class TestDemo1 extends Thread {

	public static void main(String[] args) {
		TestDemo1 t = new TestDemo1();
		t.start();
		System.out.println("main method");
		for (int i = 0; i < 10; i++) {
			System.out.println("main : " + i);
		}
	}

	@Override
	public void run() {
		System.out.println("run method");
		for (int i = 0; i < 10; i++) {
			System.out.println("run:" + i);
		}

	}

}
