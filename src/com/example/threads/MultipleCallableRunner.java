package com.example.threads;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
			ExecutorService exserv = Executors.newFixedThreadPool(2);
			
			List<CallableTask> tasks = List.of(new CallableTask("Yashpal"),new CallableTask("Shona"),new CallableTask("Ranga"),new CallableTask("praful"));
			
			List<Future<String>> invList = exserv.invokeAll(tasks);
			
			for(Future<String> r : invList) {
				System.err.println(r.get().toString());
			}
			
			exserv.shutdown();
	}

}
