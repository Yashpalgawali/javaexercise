package com.example.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<String> {

	private String name;

	public CallableTask(String name) {
		super();
		this.name = name;
	}

	@Override
	public String call() throws Exception {

		Thread.sleep(1000);
		
		return "Hello " + name;
	}

}

public class CallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService exservice = Executors.newFixedThreadPool(1);

		Future<String> future = exservice.submit(new CallableTask("Yashpal"));
		String string = future.get();
		System.err.println(string);

		System.err.println("Main COmpleted");
		exservice.shutdown();
	}

}
