package com.languageFundamentals.constructors;

public class Student {
	String name;
	int marks1;
	int marks2;
	int marks3;

	Student(int marks1, int marks2, int marks3) {
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}

	int calculateTotal() {
		int total = marks1 + marks2 + marks3;
		return total;
	}

	double calculateAverage() {
		double average = calculateTotal() / 3.0;
		return average;
	}

	public static void main(String[] args) {
		Student s1 = new Student(89, 99, 88);
		s1.name = "Sanju";
		s1.display();

		Student s2 = new Student(91, 92, 96);
		s2.name = "Ashritha";
		s2.display();
	}

	void display() {
		System.out.println("Name of the student : " + name);
		System.out.println("Marks of subject 1 :" + marks1);
		System.out.println("Marks of subject 2 :" + marks2);
		System.out.println("Marks of subject 3 :" + marks3);
		System.out.println("Total Marks : " + calculateTotal());
		System.out.println("Average :" + calculateAverage());
		System.out.println("********************************");
	}

}
