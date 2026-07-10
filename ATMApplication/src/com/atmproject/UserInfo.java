package com.atmproject;

public class UserInfo {
     private int accountNumber;
     private String userName;
     private int pin;
     private double balance;
	 public int getAccountNumber() {
		 return accountNumber;
	 }
	 public void setAccountNumber(int accountNumber) {
		 this.accountNumber = accountNumber;
	 }
	 public String getUserName() {
		 return userName;
	 }
	 public void setUserName(String userName) {
		 this.userName = userName;
	 }
	 public int getPin() {
		 return pin;
	 }
	 public void setPin(int pin) {
		 this.pin = pin;
	 }
	 public double getBalance() {
		 return balance;
	 }
	 public void setBalance(double balance) {
		 this.balance = balance;
	 }
	 public UserInfo(int accountNumber, String userName, int pin, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.userName = userName;
		this.pin = pin;
		this.balance = balance;
	 }
     
}
