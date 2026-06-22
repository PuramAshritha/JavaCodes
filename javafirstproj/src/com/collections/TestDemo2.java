package com.collections;

import java.util.HashSet;

public class TestDemo2 {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);

		HashSet<Integer> hs1 = new HashSet<>();
		hs1.add(30);
		hs1.add(40);
		hs1.add(60);
		hs1.add(70);

		HashSet<Integer> com = new HashSet<>();

		for (int num : hs) {
			if (hs1.contains(num)) {
				com.add(num);
			}
		}
		System.out.println("Common Elements: " + com);
	}

}
