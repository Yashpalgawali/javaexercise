package com.example.exceptionhandling;

import java.util.Scanner;

public class FinallyRunner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int[] numbers = { 12, 3, 4, 5 };

			int num = numbers[5];
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Before scanner close");
			sc.close();
		}
		
	
		System.out.println("after scanner close");
		
		System.out.println("Main closed");
		

	}

}
