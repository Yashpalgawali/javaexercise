package com.example.threads;

public class ThreadBasicRunner {

	public static void main(String[] args) throws InterruptedException {
		
				// Task1	
		System.out.println("\nTask1 Kicked Off");
				Task1 task1Thread = new Task1();
				task1Thread.start();
				//task1Thread.setPriority(Thread.MAX_PRIORITY);
				task1Thread.setPriority(10);
				
				
				// Task2
				System.out.println("\nTask2 Kicked Off");
				Task2 task2 = new Task2();
			
				Thread task2Thread = new Thread(task2);
				task2Thread.start();
				
//				task1Thread.setPriority(Thread.MAX_PRIORITY);
				
				System.err.println(task1Thread.getName());
				
				System.err.println(task2Thread.getName());
				task1Thread.join(); // this ensures the task1Thread will get executed first , when this Thread is dead/terminated then other threads will start
				task2Thread.join();// this ensures the task2Thread will get executed first , when this Thread is dead/terminated then other threads will start
				// Task3
				System.out.println("\nTask3 Kicked Off");
				for(int i=301;i<=399;i++) {
					System.err.print(i+" ");
				}
				System.out.println("\nTask3 DONE");
				
				System.out.println("\nMain DONE");
	}

}

class Task1 extends Thread {
	
	public void run() {
		System.out.println("\nTask1 started");
		for(int i=101;i<=199;i++) {
			System.err.print(i+" ");
		}
		System.out.println("\nTask1 DONE");
	}
}

class Task2 implements Runnable {

	@Override
	public void run() {
		for(int i=201;i<=299;i++) {
			System.err.print(i+" ");
		}
		System.out.println("\nTask2 DONE");
		
	}
	
}
