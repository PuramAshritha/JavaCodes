package com.languageFundamentals.constructors;

public class FirstExample {
	String sId;
	String name;
	int Marks;

	FirstExample() {
		System.out.println("No-arg Constructor Created");
	}

	public static void main(String args[]) {
		System.out.println("Main Method started ");
		FirstExample s1 = new FirstExample();
		s1.sId = "JFS-B70-031";
		s1.name = "Ashritha";
		s1.Marks = 100;
		System.out.println("Student Id :" + s1.sId);
		System.out.println("Student Name :" + s1.name);
		System.out.println("Student Marks :" + s1.Marks);
	}

}
