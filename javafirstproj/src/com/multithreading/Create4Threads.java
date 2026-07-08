package com.multithreading;

class FizzBuzz {

	private int n;
	private int current = 1;

	public FizzBuzz(int n) {
		this.n = n;
	}

	public synchronized void fizz() {
		while (current <= n) {
			while (current <= n && !(current % 3 == 0 && current % 5 != 0)) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			if (current <= n) {
				System.out.println("Fizz ");
				current++;
				notifyAll();
			}
		}
		notifyAll();
	}

	public synchronized void buzz() {
		while (current <= n) {
			while (current <= n && !(current % 5 == 0 && current % 3 != 0)) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			if (current <= n) {
				System.out.println("Buzz ");
				current++;
				notifyAll();
			}
		}
		notifyAll();
	}

	public synchronized void fizzBuzz() {
		while (current <= n) {
			while (current <= n && !(current % 15 == 0)) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			if (current <= n) {
				System.out.println("FizzBuzz ");
				current++;
				notifyAll();
			}
		}
		notifyAll();
	}

	public synchronized void number() {
		while (current <= n) {
			while (current <= n && (current % 3 == 0 || current % 5 == 0)) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			if (current <= n) {
				System.out.println(current + " ");
				current++;
				notifyAll();
			}
		}
		notifyAll();
	}
}

public class Create4Threads {

	public static void main(String[] args) {

		int n = 15;

		FizzBuzz fb = new FizzBuzz(n);

		Thread A = new Thread(() -> fb.fizz());

		Thread B = new Thread(() -> fb.buzz());

		Thread C = new Thread(() -> fb.fizzBuzz());

		Thread D = new Thread(() -> fb.number());

		A.start();
		B.start();
		C.start();
		D.start();
	}
}