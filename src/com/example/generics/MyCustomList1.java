package com.example.generics;

import java.util.ArrayList;

public class MyCustomList1<TYPE> {

	ArrayList<TYPE> list = new ArrayList<>();

	public void addElement(TYPE element) {
		list.add(element);
	}

	public void removeElement(TYPE element) {
		list.remove(element);
	}

	public String toString() {
		return list.toString();
	}

	public TYPE get(int i) {
		return list.get(i);
	}

}
