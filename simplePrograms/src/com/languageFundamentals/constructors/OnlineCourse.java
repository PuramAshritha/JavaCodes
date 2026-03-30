package com.languageFundamentals.constructors;

public class OnlineCourse {
	String sname;
	double courseFee;
	double discount;

	OnlineCourse(String sname, double courseFee, double discount) {
		this.sname = sname;
		this.courseFee = courseFee;
		this.discount = discount;
	}

	double calculateDiscount() {
		return courseFee * discount;
	}

	double addDiscount() {
		double fee = courseFee - (calculateDiscount()) + 1000;
		return fee;
	}

	public static void main(String[] args) {
		OnlineCourse s1 = new OnlineCourse("Ashritha", 32000, 0.2);
		s1.display();

		OnlineCourse s2 = new OnlineCourse("Gambhir", 32000, 0.3);
		s2.display();
	}

	void display() {
		System.out.println("Name of the student: " + sname);
		System.out.println("Registration fee: 1000");
		System.out.println("Course Fee : " + courseFee);
		System.out.println("Discount : " + discount);
		System.out.println("Total Fee to be paid : " + addDiscount());
		System.out.println("************************");
	}
}
