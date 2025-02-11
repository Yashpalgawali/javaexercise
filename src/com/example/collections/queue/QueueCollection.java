package com.example.collections.queue;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;


class Strinlength implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.length(), o2.length());
	}
	
}

public class QueueCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> queue = new PriorityQueue<>();
		
		System.err.println(queue.poll());
				
		queue.offer("Yash");
		
		queue.offer("Shona");
		
		System.err.println(queue.poll());
		
		List<String> of = List.of("Apple","Cat");
		Queue<String> queueL = new PriorityQueue<>(new Strinlength());
		queueL.addAll(of);
		System.err.println(queueL.poll());
		System.err.println(queueL.poll());
		System.err.println(queueL.poll());
		
	}

}
