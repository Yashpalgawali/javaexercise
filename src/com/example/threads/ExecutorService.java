package com.example.threads;

import java.util.concurrent.Executors;


class Task extends Thread {
	private int number;

	public Task(int number) {
		this.number = number;
		
	} 
	
	public void run() {
		System.out.println("\nTask "+ number+ " Started");
		for(int i=number*100 ;i<=number *100+99;i++) {
			System.err.print(i+" ");
		}
		System.out.println("\nTask "+ number+ " Done");
	}
}


public class ExecutorService {

	public static void main(String[] args) {
		// For Single Thread Execution

//		
//		java.util.concurrent.ExecutorService exservice=  Executors.newSingleThreadExecutor();
//		exservice.execute(new Thread(new Task2()));
//		exservice.execute(new Task1());
//		
//		
//		
//		// Task3
//		System.out.println("\nTask3 Kicked Off");
//		for(int i=301;i<=399;i++) {
//			System.err.print(i+" ");
//		}
//		System.out.println("\nTask3 DONE");
//		
//		System.out.println("\nMain DONE");
//		
//		exservice.shutdown();
		
	// End of Single Thread Execution
		
		
		java.util.concurrent.ExecutorService exservice = Executors.newFixedThreadPool(2);
		exservice.execute(new Task(1));
		exservice.execute(new Task(2));
		exservice.execute(new Task(3));
		exservice.execute(new Task(4));
		 
		
		exservice.shutdown();
		
	}

}
