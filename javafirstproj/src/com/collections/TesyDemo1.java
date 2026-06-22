package com.collections;

import java.util.ArrayList;

public class TesyDemo1 {

	public static void main(String[] args) {
		ArrayList<Integer> li=new ArrayList<>();
		li.add(2);
		li.add(7);
		li.add(11);
		li.add(15);
		li.add(3);
		li.add(6);
		
		int target=9;
		
		for(int i=0; i<li.size();i++) {
			for(int j=i+1;j<li.size();j++) {
				if(li.get(i)+li.get(j)==target) {
					System.out.println("("+li.get(i)+","+li.get(j)+")");
				}
			}
		}

	}

}
