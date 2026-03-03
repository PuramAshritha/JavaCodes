package com.languageFundamentals;

public class TestMethodsDemo1 {

	public static void main(String[] args) {
		TestMethodsDemo1 t4 = new TestMethodsDemo1();
		t4.Addition(20,40);
		
	}
   
	
	void Addition(int a, int b ){
		int c=a+b;
		System.out.println("addition : "+c);
		Subtraction(100,c);
		
	}
    void Subtraction(int a, int b) {
    	   int c=a-b;
    	   System.out.println("subtraction : "+c);
    	   multiplication(10, c);
    }
     
    static void multiplication(int a, int b) {
    	    int c= a*b;
    	    System.out.println("multiplication : "+c);
    	    division(5.5f,c);
    }
    static void division(float f, double d) {
    	    double c= d/f;
    	    System.out.println("division : "+c);
    }
}
