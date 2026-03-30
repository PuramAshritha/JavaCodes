package com.logicalStatements;

import java.util.Scanner;

public class TestSwitchDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter category: ");
		String cate = sc.next();
			switch (cate) {
			case "vegi" -> {
				System.out.println("Enter a vegitable: ");
				String item = sc.next();
				switch (item) {
				case "tmt" -> System.out.println("Tomato and The price is 20rs Per Kg");
				case "ptt" -> System.out.println("Potato and The price is 30rs Per Kg");
				case "onn" -> System.out.println("Onion and The price is 25rs Per Kg");
				case "crt" -> System.out.println("Carrot and The price is 40rs Per Kg");
				case "cbb" -> System.out.println("Cabbage and The price is 18rs Per Kg");
				case "cfl" -> System.out.println("Cauliflower and The price is 35rs Per Kg");
				case "brn" -> System.out.println("Brinjal and The price is 22rs Per Kg");
				case "chk" -> System.out.println("Chilli and The price is 60rs Per Kg");
				case "bns" -> System.out.println("Beans and The price is 45rs Per Kg");
				case "lky" -> System.out.println("Lady Finger (Okra) and The price is 50rs Per Kg");
				case "ptk" -> System.out.println("Pumpkin and The price is 28rs Per Kg");
				case "cuc" -> System.out.println("Cucumber and The price is 30rs Per Kg");
				default -> System.out.println("Vegetable not available");
				}
			}
			case "Fru" -> {
				System.out.println("Enter a Fruit: ");
				String item = sc.next();
				switch (item) {
				case "apl" -> System.out.println("Apple and The price is 120rs Per Kg");
				case "bnn" -> System.out.println("Banana and The price is 50rs Per Dozen");
				case "mgr" -> System.out.println("Mango and The price is 80rs Per Kg");
				case "org" -> System.out.println("Orange and The price is 70rs Per Kg");
				case "grp" -> System.out.println("Grapes and The price is 90rs Per Kg");
				case "png" -> System.out.println("Pineapple and The price is 60rs Each");
				case "wml" -> System.out.println("Watermelon and The price is 25rs Per Kg");
				case "ppr" -> System.out.println("Papaya and The price is 40rs Per Kg");
				case "gva" -> System.out.println("Guava and The price is 50rs Per Kg");
				case "str" -> System.out.println("Strawberry and The price is 150rs Per Kg");
				case "plm" -> System.out.println("Pomegranate and The price is 140rs Per Kg");
				case "kwi" -> System.out.println("Kiwi and The price is 200rs Per Kg");
				default -> System.out.println("Fruit not available");

				}
			}
			default -> System.out.println("Category not Available");
			}
		sc.close();
	}
}