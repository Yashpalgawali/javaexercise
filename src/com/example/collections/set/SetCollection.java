package com.example.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> set = Set.of("Apple","Bat","Cat");

		//set.add("Dog");
		System.err.println(set);

		 Set<String> hashSet = new HashSet<>(set);
		 hashSet.add("Cat");
		 System.err.println("Dog added "+hashSet.add("Dog"));
		 System.err.println("Bat added "+hashSet.add("Bat"));

		 System.err.println(hashSet);
	}

}
