package com.example.excercise.string;

public class StringReverse {
	
	public static void main(String[] args) {
		
		String s = "Shona";
		
		reverseString(s);
	}
	
	static String reverseString(String s) {
		char[] chararr = s.toCharArray();
		//StringBuffer bf = new StringBuffer();
		String bf= "";
		for(int i=chararr.length-1 ;i>=0;i--) {
			bf = bf+""+chararr[i];
//			bf.append(chararr[i]);
		}
		System.err.println("Reversed "+bf);
		return bf;
	}
}
