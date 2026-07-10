package com.multithreading;

class TicketCounter {
	int tickets = 0;
	final int max = 5;

	public synchronized void addTicket(String ticketName) throws InterruptedException {
		while (tickets == max) {
			wait();
		}
		tickets++;
		System.out.println("Admin added : " + ticketName);
		System.out.println("Available Tickets : " + tickets);
		notify();
	}

	public synchronized void bookTicket() throws InterruptedException {
		while (tickets == 0) {
			System.out.println("No Tickets...");
			wait();
		}
		System.out.println("Customer booked the ticket :");
		System.out.println("Available Tickets : " + tickets);
		tickets--;
		notify();
	}

}

class Admin extends Thread {
	TicketCounter tc;

	public Admin(TicketCounter tc) {
		this.tc = tc;
	}

	public void run() {
		for (int i = 0; i <= 10; i++) {
			try {
				tc.addTicket("Ticket- " + i);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Customers extends Thread {
	TicketCounter tc;

	public Customers(TicketCounter tc) {
		this.tc = tc;
	}

	public void run() {
		for (int i = 0; i <= 10; i++) {
			try {
				tc.bookTicket();
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class BookMyShowApp {
	public static void main(String[] args) {
		TicketCounter tc = new TicketCounter();
		Admin a = new Admin(tc);
		Customers c = new Customers(tc);
		a.start();
		c.start();
	}

}
