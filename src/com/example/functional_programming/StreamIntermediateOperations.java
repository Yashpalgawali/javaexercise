package com.example.functional_programming;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamIntermediateOperations {

	public static void main(String[] args) {
		 
		// Find the squares of each numbers in given range
//		IntStream numRange = IntStream.range(1, 11);
//		numRange.map(n -> n * n).forEach(System.out::println);

		// Map the string to Lower Case
		List<String> str = List.of("Apple","Bat","Cat");
//		str.stream().map(s -> s.toLowerCase()).forEach(System.out::println);
		
		// Print the length of each element
		HashMap<String, Integer> map = new HashMap<>();
		
		 str.stream().map(s -> { 
								return map.put(s, s.length()); 
							 }) ;
		
		 System.err.println(map);
		
//		str.stream().map(s -> {
//			return map.put(s, s.length());
//		}).forEach(System.out::println);
		
		
		
	}

}
