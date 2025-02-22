package com.example.Multithreading;

class Task1 extends Thread {

	public void run() {
		System.out.print("\nTask 1 Started \n");
		for (int i = 1; i <= 199; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\nTask 1 Done \n");
	}
}

class Task2 implements Runnable {

	@Override
	public void run() {
		System.out.print("\nTask 2 Started\n");

		for (int i = 200; i <= 299; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\nTask 2 Done\n");
	}

}

public class ThreadBasicRunner {

	public static void main(String[] args) {

		// Task1
		Task1 task1 = new Task1();
		task1.start();
		System.out.print("\nTask 1 Kicked Off \n");

		// Task2
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);

		task2Thread.start();
		System.out.print("\nTask 2 Kicked Off \n");

		System.out.print("\nTask 3 Kicked Off \n");

		// Task3
		for (int i = 300; i <= 399; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\nTask 3 Done");
	}

}
