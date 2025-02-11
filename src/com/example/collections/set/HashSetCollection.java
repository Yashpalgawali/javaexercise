package com.example.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashSetCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> set = new HashSet<>();

		set.add(789);
		set.add(78);
		set.add(7);
		set.add(70);
		set.add(12);

		// Hashset does not store the items in sorted manner or as they are inserted.
		// They are stored in random manner
		// O/p :- [789, 7, 78]
		System.err.println(set);

		// To retain the insertion order user LinkedHashSet

		Set<Integer> lhashSet = new LinkedHashSet<>();

		lhashSet.add(789);
		lhashSet.add(78);
		lhashSet.add(7);
		lhashSet.add(70);
		lhashSet.add(12);

		System.out.println("Linked Hash Set" + lhashSet);

//		TreeSet stores the items in sorted manner, it does not care about insertion order.
		Set<Integer> treeSet = new TreeSet<>();

		treeSet.add(789);
		treeSet.add(78);
		treeSet.add(7);
		treeSet.add(72);
		treeSet.add(14);

		System.err.println("Tree Hash Set" + treeSet);

		List<Character> chars = List.of('D','A', 'C', 'B',  'A', 'C', 'B');

		System.err.println("Characters are " + chars);

		// Unique -Set

		Set<Character> charSet = new TreeSet<>(chars);
		System.out.println("Characters using treeset " + charSet);

		// Store in the set using insertion order
				Set<Character> linkedHashSet = new LinkedHashSet<>(chars);
				System.err.println("Characters using LinkedHashSet " + linkedHashSet);
				
		// dont care the insertion order use HashSet
		Set<Character> hashSet = new HashSet<>(chars);
		System.err.println("Characters using  HashSet " + hashSet );

	}

}
