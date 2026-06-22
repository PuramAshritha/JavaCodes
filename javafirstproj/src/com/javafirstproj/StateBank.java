package com.javafirstproj;

public class StateBank {

	static int sc=1292435;
	
	{
		sc=sc+1;
	}
	
	int acc;
	String userName;
	int phoneNumber;
	double balance;

	public static void main(String[] args) {
		System.out.println(" *************User1************");
		StateBank sb=new StateBank();
		sb.acc=sc;
		sb.userName="Ashritha";
		sb.phoneNumber= 95243459;
		sb.balance=5000.50;
		System.out.println("User Name: "+ sb.userName);
		System.out.println("Phone Number: " + sb.phoneNumber);
		System.out.println("Bank Balance: " + sb.balance);
		System.out.println("Account Number: " + sb.acc);
		System.out.println(" *************User2************");
		StateBank sb1=new StateBank();
		sb1.acc=sc;
		sb1.userName="kjoihij";
		sb1.phoneNumber= 923453459;
		sb1.balance=5500.60;
		System.out.println("User Name: "+ sb1.userName);
		System.out.println("Phone Number: " + sb1.phoneNumber);
		System.out.println("Bank Balance: " + sb1.balance);
		System.out.println("Account Number: " + sb1.acc);
		System.out.println(" *************User3************");
		StateBank sb2=new StateBank();
		sb2.acc=sc;
		sb2.userName="asdfghj";
		sb2.phoneNumber= 946345349;
		sb2.balance=10000.77;
		System.out.println("User Name: "+ sb2.userName);
		System.out.println("Phone Number: " + sb2.phoneNumber);
		System.out.println("Bank Balance: " + sb2.balance);
		System.out.println("Account Number: " + sb2.acc);
	}

}
