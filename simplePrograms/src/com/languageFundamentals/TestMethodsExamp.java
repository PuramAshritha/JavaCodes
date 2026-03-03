package com.languageFundamentals;

import java.util.Scanner;

public class TestMethodsExamp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Base : ");
		double base = sc.nextDouble();
		System.out.println("Enter height: ");
		double height = sc.nextDouble();
		System.out.println("The area of Triangle is : " + areaOfTriangle(base, height));

		System.out.println("Enter length: ");
		double length = sc.nextDouble();
		System.out.println("Enter breadth: ");
		float breadth = sc.nextFloat();
		System.out.println("The Area of Rectangle is : " + areaOfRectangle(length, breadth));

		System.out.println("Enter the radius : ");
		double radius = sc.nextFloat();
		System.out.println("The Area of Circle is : " + areaOfCircle(radius));

		System.out.println("Enter Side Length : ");
		int side = sc.nextInt();
		System.out.println("The Area of Square is : " + areaOfSquare(side));
		sc.close();
	}

	static double areaOfTriangle(double b, double h) {
		double arTri = 0.5 * b * h;
		return arTri;
	}

	static double areaOfRectangle(double l, float h) {
		double arRec = l * h;
		return arRec;
	}

	static double areaOfCircle(double r) {
		double arCir = Math.PI * r *r;
		return arCir;
	}

	static int areaOfSquare(int s) {
		int arSqa = (s * s);
		return arSqa;
	}
}
