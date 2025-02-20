package com.example.generics;

 
public class GenericsRunner {

	public static void main(String[] args) {

		MyCustomList<String> list = new MyCustomList<>();

		list.addElement("Yash");

		System.err.println(list);
		System.out.println(list.get(0));
		MyCustomList<Integer> list2 = new MyCustomList<>();

		list2.addElement(Integer.valueOf(5));
		list2.addElement(Integer.valueOf(50));
		list2.addElement(Integer.valueOf(51));
		System.err.println(list2);
		
		System.out.println(list2.get(1));
	}
}
