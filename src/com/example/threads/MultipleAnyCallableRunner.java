package com.example.threads;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleAnyCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
			ExecutorService exserv = Executors.newFixedThreadPool(2);
			
			List<CallableTask> tasks = List.of(new CallableTask("Yashpal"),new CallableTask("Shona"),new CallableTask("Ranga"),new CallableTask("praful"));
			
			String invList = exserv.invokeAny(tasks); //  It returns the result which gets executed first
			System.err.println(invList);

			exserv.shutdown();
	}

}
