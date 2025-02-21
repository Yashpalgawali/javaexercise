package com.example.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericsRunner1 {

	// We can Also Generics in method level as well
	static <X> X doubleValue(X value) {
		return value;
	}

	static <X extends List> void duplicates(X list) {
		list.addAll(list);
	}

	// The "? extends " here represents the WildCard, The "? extends "  holds any List that extends
	// "Number" class
	static double sumOfNumberList(List<? extends Number> numbers) {
		double sum = 0.0;
		for (Number num : numbers) {
			sum += num.doubleValue();
		}
		return sum;
	}

	static void addCoupleOfValues(List<? super Number> numbers ) {
		numbers.add(1);
		numbers.add(1.1);
		numbers.add(1L);
		
	}
	
	public static void main(String[] args) {

		List emptyList = new ArrayList<Number>();
		addCoupleOfValues(emptyList) ;
		System.err.println("Empty Lst "+emptyList);
		
		System.out.println(sumOfNumberList(List.of(1, 2, 3)));
		System.out.println(sumOfNumberList(List.of(1.1, 2.1, 3.1)));
		System.out.println(sumOfNumberList(List.of(10l, 20l, 30l)));

		Integer doubleValue = doubleValue(12);

		String str = doubleValue("String returned ");

		ArrayList listObj = doubleValue(new ArrayList());

		ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 2, 3));

		LinkedList<Integer> linkedListNumbers = new LinkedList<>(List.of(100, 200, 300));

		duplicates(numbers);
		duplicates(linkedListNumbers);

		System.err.println("ArrayList Numbers are = " + numbers);

		System.err.println("LinkedList Numbers are = " + linkedListNumbers);

		MyCustomList1<String> list = new MyCustomList1<>();

		list.addElement("element 1");
		list.addElement("element 2");
		list.addElement("element 3");

//		String value = list.get(0);
//		System.err.println("Value = "+value);
//		
		System.out.println("Element Strings are " + list.toString());

		MyCustomList1<Integer> list1 = new MyCustomList1<>();
		list1.addElement(100);
		list1.addElement(200);
		list1.addElement(300);

		System.out.println("Element Integer are " + list1.toString());
//
//		System.err.println("Integer = "+list1.get(1));

	}

}
