package com.example.excercise.string;

import java.util.Arrays;

public class StringsAnagram {

	public static void main(String[] args) {

		String s1= "hello";
		String s2= "loleh";
			
		if(s1.length() == s2.length()) {
			
			char[] charr1 = s1.toCharArray();
			char[] charr2 = s2.toCharArray();
			
			Arrays.sort(charr2);
			Arrays.sort(charr1);
			
			Arrays.equals(charr1, charr2);
		}

	}

}
