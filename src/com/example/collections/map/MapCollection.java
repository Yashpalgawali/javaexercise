package com.example.collections.map;

import java.util.HashMap;
import java.util.Map;

public class MapCollection {
	public static void main(String[] args) {

		String str = "This is an awesome Location . I Love This Location";

		Map<Character, Integer> occurances = new HashMap<>();

		char[] chararr = str.toCharArray();

		for (char character : chararr) {
			Integer res = occurances.get(character);
			if (res == null) {
				occurances.put(character, 1);
			} else {
				occurances.put(character, (res + 1));
			}

		}

		System.err.println(occurances);

		
		Map<String, Integer> stringOccurances = new HashMap<>();
		String[] words = str.split(" ");
		
		for(String word : words) {
			Integer integer = stringOccurances.get(word);
			if(integer==null) {
				stringOccurances.put(word, 1);
			}
			else {
				stringOccurances.put(word, integer+1);
			}
		}
		
		System.err.println("Words are "+stringOccurances);
	}
}
