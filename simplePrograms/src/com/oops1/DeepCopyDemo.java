package com.oops1;

class Employee {
	int eid;
	String ename;
	Address1 add1;

	public Employee(int eid, String ename, Address1 add1) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.add1 = add1;
	}

	public Employee(Employee employee) {
		this.eid = employee.eid;
		this.ename = employee.ename;
		this.add1 = new Address1(employee.add1);

	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", city=" + add1.city + "]";
	}
}

class Address1 {
	String city;

	public Address1(String city) {
		super();
		this.city = city;
	}

	public Address1(Address1 add1) {
		this.city = add1.city;
	}

}

public class DeepCopyDemo {

	public static void main(String[] args) {
		Address1 add1 = new Address1("Hyderabad");
		Employee e1 = new Employee(101, "Ashu", add1);
		System.out.println(e1.eid);
		System.out.println(e1.ename);
		System.out.println(e1.add1.city);
		System.out.println("*****************************");

		Employee e2 = new Employee(e1);
		System.out.println(e2.eid);
		System.out.println(e2.ename);
		System.out.println(e2.add1.city);

		System.out.println("---------------------");
		e2.add1.city = "Banglore";

		System.out.println(e1.add1.city);// Hyderabad
		System.out.println(e2.add1.city);// Banglore

	}

}
