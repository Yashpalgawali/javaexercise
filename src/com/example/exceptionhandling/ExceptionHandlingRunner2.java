package com.example.exceptionhandling;

import java.io.IOException;

public class ExceptionHandlingRunner2 {

	public static void main(String[] args) {

		method1();
		System.err.println("Main Ended");
	}

	private static void method1() {
		method2();
		System.err.println("Method 1 Ended");
	}

	private static void method2() {
		try {
//			String s = null;
//			s.length();
			int[] i = {1 ,2};
			
			int num = i[3];
		} catch ( NullPointerException e) {
			System.out.println("Matched Exception NullPointerException");
			e.printStackTrace();
		}
		 catch ( ArrayIndexOutOfBoundsException e) {
			 System.out.println("Matched Exception ArrayIndexOutOfBoundsException ");
				e.printStackTrace();
			}
		 catch ( Exception e) {
			 System.out.println("Matched Exception Eception");
				e.printStackTrace();
			}

		System.err.println("Method 2 Ended");
	}

}
