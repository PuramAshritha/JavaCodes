package com.oops1;

public class TestStudent {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setSid(8);
		s1.setSname("Ashritha");
		s1.setPhone(9177323455L);
		System.out.println("Student ID: " + s1.getSid());
		System.out.println("Student Name: " + s1.getSname());
		System.out.println("Phone Number: " + s1.getPhone());
	}

}
