package queue_demos;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PqDemo {

	public static void main(String[] args) {

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		pq.add(143);
		pq.add(534);
		pq.add(96);
		
		System.out.println(pq);
		
		//Printing the top (last added) element.
		System.out.println(pq.peek());
		
		//Print top deck and remove it.
		System.out.println(pq.poll());
		System.out.println(pq.peek());
		
		System.out.println(pq);
		
		pq.add(54);
		pq.add(90);
		System.out.println("Primary Queue: "+pq);
		
		pq.remove(534);
		System.out.println("After removal: "+pq);
		System.out.println("Poll Method: "+pq.poll());
		System.out.println("Final Queue: "+pq);
		
		//iterating with Iterator.
		Iterator<Integer> i = pq.iterator();
		
		while(i.hasNext()){
			System.out.println(i.next()+" ");
		}

	}

}
