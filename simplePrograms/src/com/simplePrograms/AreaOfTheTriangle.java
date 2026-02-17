package com.simplePrograms;

public class AreaOfTheTriangle {
	float b;
	float h;
    float calculate() {
    	   return (b*h)/2;
    }
	public static void main(String[] args) {
		AreaOfTheTriangle t1= new AreaOfTheTriangle();
		t1.b=20;
		t1.h=20;
		System.out.println("Area of the Triangle: " +t1.calculate());
	}

}
