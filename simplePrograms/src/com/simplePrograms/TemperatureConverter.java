package com.simplePrograms;

public class TemperatureConverter {
	public static void main(String[] args) {
		double fah = calculateF();
        double c = calculateC();
		System.out.println("Fahrenheit: " +fah);
		System.out.println("Celcius: " +c);
	}
	static double calculateF()	{
		double cel = 30;
		double fah = (cel * 9 / 5) + 32;
         return fah;
	}
	static double calculateC() {
        double f = 86;
		double c = (f - 32)* 5 / 9;
        return c;
	}
   
}
