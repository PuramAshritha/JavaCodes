package com.simplePrograms;

public class Employee {
	int eid;
	String eName;
	float salary;
	float eSalary;

	float calculateSalary() {
		eSalary = salary + (salary * 20 / 100);
		return eSalary;
	}

	void PrintStatements() {
		System.out.println("Employee Id : " + eid);
		System.out.println("Employee Name : " + eName);
		System.out.println("Salary before : " + salary);
		System.out.println("Salary After Bonus : " + eSalary);
		System.out.println("*******************************");
	}

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.eid = 1;
		e1.eName = "Ashritha";
		e1.salary = 50000;
		e1.calculateSalary();
		e1.PrintStatements();
		Employee e2 = new Employee();
		e2.eid = 2;
		e2.eName = "Deepthi";
		e2.salary = 40000;
		e2.calculateSalary();
		e2.PrintStatements();

	}

}
