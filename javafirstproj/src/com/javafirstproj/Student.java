package com.javafirstproj;

public class Student {
	String student_Name;
	int student_id;
	int student_age;
	char gender;
	int math;
	int sci;
	int eng;
	int java;
	
	int calculateSum() {
		return math+sci+eng+java;
	}
	double average() {
		return calculateSum() / 4.0 ;
	}
	
	void printStudentDetails() {
		System.out.println("Student Name: " + student_Name);
		System.out.println("Student Id: " + student_id);
		System.out.println("Student Age: " + student_age);
		System.out.println("Student Gender: " + gender);
		System.out.println("Math marks: " + math);
		System.out.println("Science Marks: " + sci);
		System.out.println("English Marks: " + eng);
		System.out.println("Total Marks: " + calculateSum());
		System.out.println("Average: " + average());
		System.out.println("--------------------------------");
	}

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.student_Name="Ashritha";
		s1.student_id=1;
		s1.student_age=20;
		s1.gender='F';
		s1.math=70;
		s1.sci=68;
		s1.eng=97;
		s1.java=80;	
		
		Student s2 = new Student();
		s2.student_Name="suresh";
		s2.student_id=2;
		s2.student_age=21;
		s2.gender='M';
		s2.math=72;
		s2.sci=61;
		s2.eng=91;
		s2.java=70;	
		
		s1.printStudentDetails();
		s2.printStudentDetails();
	}
	
	
}
