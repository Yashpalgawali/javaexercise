package com.example.excercise.string;

public class StringCompare {

	public static void main(String[] args) {
		String s1 = "Yash";
		
		String s2 =  new String("Yash");
		
		if(s1.equals(s2)) {
			System.out.println(s1+" and "+s2+" are equal ");
		}
		else {
			System.err.println(s1+" and "+s2+" are NOT EQUAL ");
		}

	}

}
