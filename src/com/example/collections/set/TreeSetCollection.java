package com.example.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> set = Set.of(5, 74, 87, 1, 3, 47);
		TreeSet<Integer> treeSet = new TreeSet<>(set);

		System.err.println(treeSet);

		// treeSet.addFirst(100);

		// "floor(num)" will check the number lower than or equal to "num". Means in
		// above example if we give num=5 then result will be 5
		System.err.println(treeSet.floor(5));

		// get the number less than "num"
		System.err.println(treeSet.lower(5));

		// number greater than "num" or equal to "num" will be returned
		System.err.println(treeSet.ceiling(74));

		// number greater than "num" or equal to "num" will be returned
		System.err.println(treeSet.higher(74) );
		
		// Get Subset lower limit is inclusive , upper limit is exclusive
		System.err.println(treeSet.subSet(47, 87));
		// o/p : [47, 74]
		
		// Get Subset including the less than and greater than 
				System.err.println(treeSet.subSet(47, true , 87 , true));
				// o/p: [47, 74, 87]
				
				// Get Subset excluding the less than and greater than 
				System.err.println(treeSet.subSet(47, false, 87 , false ));
				// o/p: [74]
				
				// print numbers upto the certain limit
				System.err.println(treeSet.headSet(80) );
				// o/p : [1, 3, 5, 47, 74]
				
				// print numbers after the certain limit
				System.err.println(treeSet.tailSet(80) );
				
				// o/p [87]

	}

}
