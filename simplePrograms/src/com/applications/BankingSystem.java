package com.applications;

import java.util.Scanner;

class Account {
	int id;
	double balance;

	Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}

	void calcualteInterest() {

	}
}

class SavingsAccount extends Account {

	SavingsAccount(int id, double balance) {
		super(id, balance);

	}

	void calcualteInterest() {
		double interest = balance * 0.06;
		System.out.println("The Interest is: " + interest);
	}
}

class CurrentAccount extends Account {

	CurrentAccount(int id, double balance) {
		super(id, balance);
	}

	void calcualteInterest() {
		double interest = balance * 0.02;
		System.out.println("The Interest is : " + interest);
	}
}

public class BankingSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CurrentAccount acc1 = new CurrentAccount(1234561, 30000.00);
		SavingsAccount acc2 = new SavingsAccount(1623423, 40000.00);
		System.out.println("Account Number: " + acc1.id);
		System.out.println("Salary is : " + acc1.balance);
		acc1.calcualteInterest();
		System.out.println("Account Number: " + acc2.id);
		System.out.println("Salary is : " + acc2.balance);
		acc2.calcualteInterest();
		sc.close();
	}

}
