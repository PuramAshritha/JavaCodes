package com.multithreading;

class TicketGenerater {

	private int tickets = 0;
	private final int MAX = 5;

	public synchronized void addTicket(String ticketName) throws InterruptedException {

		while (tickets == MAX) {
			System.out.println("Storage Full! Admin waiting...");
			wait();
		}

		tickets++;
		System.out.println(Thread.currentThread().getName() + " Added " + ticketName + " | Available = " + tickets);

		notify();
	}

	public synchronized void bookTicket() throws InterruptedException {

		while (tickets == 0) {
			System.out.println(Thread.currentThread().getName() + " waiting for tickets...");
			wait();
		}

		System.out.println(Thread.currentThread().getName() + " booked a ticket" + " | Remaining = " + (tickets - 1));

		tickets--;

		notify();
	}
}

class Admin1 extends Thread {

	TicketGenerater tc;

	Admin1(TicketGenerater tc) {
		this.tc = tc;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				tc.addTicket("Ticket-" + i);
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class Customers1 extends Thread {

	TicketGenerater tc;

	Customers1(TicketGenerater tc, String name) {
		super(name);
		this.tc = tc;
	}

	public void run() {
		while (true) {
			try {
				tc.bookTicket();
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class BookTickets {

	public static void main(String[] args) {

		TicketGenerater tc = new TicketGenerater();

		Admin1 admin = new Admin1(tc);

		Customers1 c1 = new Customers1(tc, "Customer-1");
		Customers1 c2 = new Customers1(tc, "Customer-2");
		Customers1 c3 = new Customers1(tc, "Customer-3");
		admin.start();
		c1.start();
		c2.start();
		c3.start();
	}
}