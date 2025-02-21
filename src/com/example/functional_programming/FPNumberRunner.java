package com.example.functional_programming;

import java.util.List;
import java.util.stream.Stream;

public class FPNumberRunner {

	public static void main(String[] args) {
		 
		List<Integer> numbers = List.of(1,2,3,4,5);

		//numbers.stream().forEach(System.out::println);
		
		//find sum of the numbers from the list 
//		Integer sum = numbers.stream().reduce(0 , (num1 , num2) -> num1 + num2 );
//		System.err.println("Sum of All Numbers = "+sum);
//		
		// Find the sum of all odd numbers from the list
		
		//Integer oddNumSum = numbers.stream().filter(num -> num %2 !=0).reduce(0 , (num1 , num2) -> num1 + num2 );
		Stream<Integer> filter = numbers.stream().filter(num -> num %2 !=0); 
		
		System.err.println("filter stream "+filter);
		
	}

}
