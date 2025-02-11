package com.example.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListCollection {

	public static void main(String[] args) {
	 
		List<String> list = List.of("Apple","CAT","BAT");
		 
		List<String> wordsAL = new ArrayList<>(list);
		
		System.err.println(wordsAL);
		
		// we can add or remove items in or from wordsAL		
		wordsAL.add("DOG");
		wordsAL.add(2, "Elephant ");
		System.out.println("ArrayList = "+wordsAL);		
		
		List<String> wordsLinkedList = new LinkedList<>(list);
		System.err.println("Linked List = "+wordsLinkedList);
			
	}

}
