package com.atmproject;

import java.util.Scanner;

public class AtmMain {

	public static void main(String[] args) {
		UserInfo[] u = new UserInfo[5];
		u[0] = new UserInfo(1432, "Ashritha", 3421, 5000.0);
		u[1] = new UserInfo(2341, "NagaLaxmi", 9867, 54330.0);
		u[2] = new UserInfo(8965, "Ashritha", 5674, 12000.0);
		u[3] = new UserInfo(7564, "Pravalika", 9876, 235000.0);
		u[4] = new UserInfo(6453, "Deepthi", 8765, 878000.0);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the account number: ");
		int n = sc.nextInt();
		System.out.println("Enter the Pin number: ");
		int n1 = sc.nextInt();
		UserInfo u1 = null;
		boolean status = false;
		for (UserInfo user : u) {
			if (n == user.getAccountNumber() && n1 == user.getPin()) {
				status = true;
				u1 = user;
				break;
			}
		}
		if (!status) {
		    System.out.println("Invalid Account Number or PIN");
		    return;
		}
		System.out.println(u1.getUserName() + " Welcome to Our Bank");
		AtmImplementsInterface atm = new AtmImplementsInterface(u1);
		while (status) {
			System.out.println("1.Check Balane\n2.Withdraw\n3.Deposit\n4.Pin Change \n5.Exit ");
			System.out.println("Enter your choice: ");
			int n2 = sc.nextInt();
			switch (n2) {
			case 1 -> atm.checkBalance();
			case 2 -> atm.withdraw();
			case 3 -> atm.deposit();
			case 4 -> atm.pin();
			case 5 -> atm.Exit();
			case 6 -> {
				status = false;
				System.out.println("Thanks for using Our Servies");
			}
			default -> System.out.println("You entered Invalid Choice");
			}
		}

		sc.close();

	}

}
