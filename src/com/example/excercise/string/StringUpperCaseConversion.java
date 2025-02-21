package com.example.excercise.string;

public class StringUpperCaseConversion {

	public static void main(String[] args) {
	 
//		Input: s = "i love programming"
//		Output: "I Love PrograMMing"

		String s = "i love prograMMing";

		char[] chararr = s.toCharArray();
		int reset = 0;

		for (int i = 0; i < chararr.length; i++) {

			if (Character.isWhitespace(chararr[i])) {
				reset = 1;
			} else {
				if (reset == 1 || i == 0) {
					chararr[i] = Character.toUpperCase(chararr[i]);
					reset = 0;
				}
//				else {
//					chararr[i] = Character.toLowerCase(chararr[i]);
//				}
			}
		}

		System.err.println(String.copyValueOf(chararr));

	}

}
