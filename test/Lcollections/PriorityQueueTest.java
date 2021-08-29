package Lcollections;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.PriorityQueue;
import java.util.ArrayDeque;
import java.util.LinkedList;

public class PriorityQueueTest {
	public static void main(String[] args) {
		//Queue<String> queue = new PriorityQueue<>();
		//Queue<String> queue = new ArrayDeque<>();
		Queue<String> queue = new LinkedList<>();
		
		queue.add("Test");
		queue.add("Dado");
		queue.add("Boca");
		queue.add("Cuca");
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.remove("Test"));
		System.out.println(queue);
	}
}