package com.example.excercise;

import java.util.ArrayList;

public class StringOperation {

	public static void main(String[] args) {
		 
		String s = "10";
		 
	    char[] carr = s.toCharArray();
		  
		 for(int i=0;i<carr.length;i++) {
			if(Character.getNumericValue(carr[i]) == 1) {
				System.err.println(s.lastIndexOf('1'));
			}
		 }

	}

}
