package com.example.collections.map;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapCollection {

	public static void main(String[] args) {

		Map<String, Integer> map = Map.of("A", 1, "B", 2, "C", 3);
		System.out.println(map.keySet());

		TreeMap<String, Integer> tree = new TreeMap<>();

		tree.put("F", 25);
		tree.put("A", 12);
		tree.put("E", 31);
		tree.put("N", 301);
		tree.put("M", 100);

		System.err.println(tree);

		// This will get only the value which is greater than "F"
		System.out.println(tree.higherKey("F"));

		// This will get only the value which is greater than "F" or Equal to "F"
		System.err.println(tree.ceilingKey("F"));

		// This will get only the value which is greater than "F"
		System.out.println(tree.lowerKey("F"));

		// This will get only the value which is greater than "F"
		System.err.println(tree.floorKey("F"));

		System.out.println(tree.lastEntry());
		// Output N=301

		// "E" is included but the "M" is excluded
		System.err.println(tree.subMap("E", "M"));
		// Output {E=31, F=25}

		// To include "E" and to include "M"
		System.err.println(tree.subMap("E", true, "M", true));
		// Output {E=31, F=25, M=100}

		// To exclude "E" and to exclude "M"
		System.err.println(tree.subMap("E", false, "M", false));

		// Output {F=25}

		String s1 = "hellO";

		String s2 = "olelh";

		if (s1.length() != s2.length()) {
			System.err.println("String length not equal \n");
		}

		boolean res = false;

		String str1 = s1.toLowerCase();
		String str2 = s2.toLowerCase();

		System.out.println("Strings are " + str1 + "\n" + str2);

		char[] chararr1 = s1.toCharArray();
		char[] chararr2 = s2.toCharArray();

		Arrays.sort(chararr1);
		Arrays.sort(chararr2);

		System.err.println("After sorting \n " + chararr1 + "\n Second array " + chararr2);

		if (chararr1.equals(chararr2)) {
			System.out.println("Equal ");
		} else {
			System.out.println("Not Equal ");
		}

		System.err.println("String are anagram " + res);
	}

}
