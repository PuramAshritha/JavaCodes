package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class TestDemo3 {

	public static void main(String[] args) {
		String[] words = { "eat", "tea", "tan", "ate", "nat", "bat" };

		HashMap<String, ArrayList<String>> map = new HashMap<>();
		for (String word : words) {
			char[] ch = word.toCharArray();
			Arrays.sort(ch);
			String key = new String(ch);
			if(!map.containsKey(key)) {
				map.put(key, new ArrayList<>());
			}
			map.get(key).add(word);
		}
		for(ArrayList<String> group:map.values()){
			Collections.sort(group);
			System.out.println(group);
		}
				
	}

}
