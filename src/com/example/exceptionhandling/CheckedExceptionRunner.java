package com.example.exceptionhandling;

public class CheckedExceptionRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		try {
//			
//			someOtherMethod();
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		someOtherMethod1();
	}

	private static void someOtherMethod() throws InterruptedException{
		// TODO Auto-generated method stub
		Thread.sleep(1000);
	}
	
	private static void someOtherMethod1() throws RuntimeException{
		// TODO Auto-generated method stub
		 
	}

}
