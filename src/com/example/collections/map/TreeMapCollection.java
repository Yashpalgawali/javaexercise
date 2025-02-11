package com.example.collections.map;

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
		//Output N=301
		
		// "E" is included but the "M" is excluded
		System.err.println(tree.subMap("E", "M"));
		// Output {E=31, F=25}
		
		
		// To include "E" and to include "M"
		System.err.println(tree.subMap("E", true, "M", true));
		// Output  {E=31, F=25, M=100}
		
		
		// To exclude "E" and to exclude "M"
		System.err.println(tree.subMap("E", false, "M", false));
		
		//  Output {F=25}
	}

}


