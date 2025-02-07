package com.example.exceptionhandling;

public class ExceptionHandlingRunner {

	public static void main(String[] args) {
		 
		method1();
		
		System.err.println("Main Ended");
	}

	private static void method1() {
		method2();
		System.err.println("Method 1 Ended");
	}

	private static void method2() {
		String s= null;
		s.length();
		System.err.println("Method 2 Ended");
	}

}
