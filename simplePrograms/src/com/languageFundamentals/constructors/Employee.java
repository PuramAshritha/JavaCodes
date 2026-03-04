package com.languageFundamentals.constructors;

public class Employee {
	String ename;
	double basicSalary;

	Employee(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	double calculateHRA() {
		double hra = basicSalary * 0.2;
		return hra;
	}

	double calculateDA() {
		double da = basicSalary * 0.1;
		return da;
	}

	double calculateNetSalary() {
		double na = basicSalary + calculateHRA() + calculateDA();
		return na;
	}

	public static void main(String[] args) {
		Employee e1 = new Employee(50000.0);
		e1.ename = "Ashritha";
		e1.displaySalarySlip();

		Employee e2 = new Employee(80000.0);
		e2.ename = "Laxmi";
		e2.displaySalarySlip();
	}

	void displaySalarySlip() {
		System.out.println("Name of the Employee : " + ename);
		System.out.println("Basic Salary  : " + basicSalary);
		System.out.println("House Rental Allowances : " + calculateHRA());
		System.out.println("Dearness Allowance :" + calculateDA());
		System.out.println("Net Salary : " + calculateNetSalary());
		System.out.println("******************************");
	}

}
