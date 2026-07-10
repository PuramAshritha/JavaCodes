package com.atmproject;

import java.util.Scanner;

public class AtmImplementsInterface implements ATMInterface {
	UserInfo u1;

	AtmImplementsInterface(UserInfo u) {
		u1 = u;
	}

	Scanner sc = new Scanner(System.in);

	@Override
	public void checkBalance() {
		System.out.println("Balance : " + u1.getBalance());
	}

	@Override
	public void withdraw() {
		System.out.println("Enter the amount to withdraw: ");
		double amount = sc.nextDouble();
		if(amount<=0){
		    System.out.println("Invalid Amount");
		    return;
		}
		if (amount > u1.getBalance()) {
			System.out.println("Insuficient Balance!!!");
		} else {
			double balance = u1.getBalance();
			balance = balance - amount;
			u1.setBalance(balance);
			System.out.println("Withdraw successful!!!!");
		}
	}

	@Override
	public void deposit() {
		System.out.println("Enter the amount to deposit: ");
		double amount = sc.nextDouble();
		if(amount<=0){
		    System.out.println("Invalid Amount");
		    return;
		}
		double balance = u1.getBalance();
		balance = balance + amount;
		u1.setBalance(balance);
		System.out.println("Deposit Successfull!!!");
	}

	@Override
	public void pin() {
		System.out.println("Enter the Pin: ");
		int oldPin = sc.nextInt();
		if (oldPin == u1.getPin()) {
			System.out.println("Enter new Pin: ");
			int newPin = sc.nextInt();
			System.out.println("Pin changed Successfully!!!");
			u1.setPin(newPin);
		} else {
			System.out.println("Entered wrong Pin!!!");
		}
	}

	@Override
	public void Exit() {
		 System.out.println("Thank you for using our ATM.");
	}

}
