package com.example.excercise.string;

public class StringSpaceRemove {

	public static void main(String[] args) {
		String s ="Shona Yash";
		String newstr = s.replaceAll("\\s", "");
		
		
		System.err.println("Striped \n"+ newstr);

	}

}
