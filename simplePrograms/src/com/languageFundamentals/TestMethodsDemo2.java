package com.languageFundamentals;

public class TestMethodsDemo2 {

	public static void main(String[] args) {
		TestMethodsDemo2 t5 =new TestMethodsDemo2();
		t5.studentTotalMarks(60, 70, 80);

	}
	void studentTotalMarks(int m1, int m2, int m3) {
		int t=m1+m2+m3;
		System.out.println("Total Marks: "+t);
		Average(t);
	}
	static void Average(int total) {
		int t1=total/3;
		System.out.println("Average: " +t1);
	}
}
