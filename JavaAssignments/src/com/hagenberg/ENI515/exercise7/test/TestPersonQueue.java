package com.hagenberg.ENI515.exercise7.test;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import static org.junit.Assert.assertTrue;

import com.hagenberg.ENI515.exercise7.String;
import com.hagenberg.ENI515.exercise7.PersonQueue;

public class TestPersonQueue {

	@Rule
	public ExpectedException exception = ExpectedException.none();

	@Test
	public void testEnqueue() {
		String p1 = new String("Pramod", "Hagenberg");
		String p2 = new String("Pramod1", "Hagenberg");
		String p3 = new String("Pramod2", "Hagenberg");
		String p4 = new String("Pramod3", "Hagenberg");
		PersonQueue pq = new PersonQueue(3);
		pq.enqueue(p1);
		pq.enqueue(p2);
		assertTrue(2 == pq.size());
		pq.enqueue(p3);
		assertTrue(3 == pq.size());
		assertTrue(p1==pq.dequeue());
		assertTrue(p2==pq.dequeue());
		assertTrue(p3==pq.dequeue());
	/*	exception.expect(RuntimeException.class);
		pq.enqueue(p4);*/

	/*	System.out.println(pq.dequeue());*/
	}

	@Test
	public void testDequeue() {
		String p1 = new String("Pramod", "Hagenberg");
		String p2 = new String("Pramod1", "Hagenberg");
		String p3 = new String("Pramod2", "Hagenberg");
		PersonQueue pq = new PersonQueue(3);
		pq.enqueue(p1);
		pq.enqueue(p2);
		pq.enqueue(p3);
		System.out.println("Removing: " + pq.dequeue());
		assertTrue(2 == pq.size());
		System.out.println("Removing: " + pq.dequeue());
		System.out.println("Removing: " + pq.dequeue());
		exception.expect(RuntimeException.class);
		System.out.println("Removing: " + pq.dequeue());

	}
}
