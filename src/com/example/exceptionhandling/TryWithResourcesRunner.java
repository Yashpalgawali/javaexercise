package com.example.exceptionhandling;

import java.util.Scanner;

public class TryWithResourcesRunner {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int[] numbers = { 12, 3, 4, 5 };

			int num = numbers[5];

			sc.close();
		}
	}

}
