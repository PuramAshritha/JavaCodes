package com.languageFundamentals.constructors;

class College_Student {
	String name;
	String Rollno;

	College_Student(String name, String Rollno) {
		this.name = name;
		this.Rollno = Rollno;
	}
}

class GraduateStudent extends College_Student {
	String course;
	double fee;

	GraduateStudent(String name, String Rollno, String course, double fee) {
		super(name, Rollno);
		this.course = course;
		this.fee = fee;
	}

	void display() {
		System.out.println("Name of the Student: " + name);
		System.out.println("Roll Number: " + Rollno);
		System.out.println("Course: " + course);
		System.out.println("Fee of the course: " + fee);

	}
}
	public class TestDemo2 {

		public static void main(String[] args) {
			GraduateStudent cs1 = new GraduateStudent("Ashritha", "21RG1A05Q0", "JFS", 30000);
			cs1.display();
		}
	}

