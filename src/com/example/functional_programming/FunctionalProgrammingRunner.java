package com.example.functional_programming;

import java.util.List;
import java.util.function.Predicate;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {
		 
		List<String> list = List.of("Apple","Bat","Cat","Dog","Lat");
		
//		printBasic(list);
//		printBasicWithFiltering(list);
//		printWithFP(list);
		printWithFPFiltering(list);

	}

	private static void printBasic(List<String> list) {
		for(String ls : list ) {
			System.err.println(ls);
		}
	}

	private static void printBasicWithFiltering(List<String> list) {
		for(String ls : list ) {
			if(ls.endsWith("at"))
			{
				System.err.println(ls);
			}
		}
	}
	private static void printWithFP(List<String> list) {
		 
		list.stream().forEach(System.out::println);
	}
	
	private static void printWithFPFiltering(List<String> list) {
		 
		Predicate<? super String> predicate = p -> p.endsWith("at");
		list.stream().filter(predicate).forEach(System.out::println); ;
	}

}
