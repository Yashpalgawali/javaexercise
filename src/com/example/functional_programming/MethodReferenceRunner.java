package com.example.functional_programming;

import java.util.List;

public class MethodReferenceRunner {

	public static void print(Integer number) {
		System.out.println(number);
	}

	public static boolean isEven(Integer number) {

		return number % 2 == 0;

	}

	public static void main(String[] args) {
 //		List.of("Ant","Bat","Cat","Elephant").stream().map(s -> s.length()).forEach(s-> System.out.println(s)); 

		// Method Reference
//		List.of("Ant","Bat","Cat","Elephant").stream().map(s -> s.length()).forEach( System.out::println);

		// Use Custom method reference
//		List.of("Ant","Bat","Cat","Elephant").stream().map(s -> s.length()).forEach(MethodReferenceRunner::print);

		// Use Custom method reference
//		List.of("Ant","Bat","Cat","Elephant").stream().map(String::length).forEach(MethodReferenceRunner::print);

		// Use Method reference for filter() and max()
		Integer res = List.of(1, 2, 3, 4, 5, 60, 7, 8).stream().filter(MethodReferenceRunner::isEven)
				.max(Integer::compare).orElse(0);
		System.err.println(res);
	}

}
