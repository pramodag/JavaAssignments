package com.hagenberg.ENI515.exercise7.test;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import static org.junit.Assert.assertTrue;

import com.hagenberg.ENI515.exercise7.Person;
import com.hagenberg.ENI515.exercise7.PersonQueue;

public class TestPersonQueue {

	@Rule
	public ExpectedException exception = ExpectedException.none();

	@Test
	public void testEnqueue() {
		Person p1 = new Person("Pramod", "Hagenberg");
		Person p2 = new Person("Pramod1", "Hagenberg");
		Person p3 = new Person("Pramod2", "Hagenberg");
		Person p4 = new Person("Pramod3", "Hagenberg");
		PersonQueue pq = new PersonQueue(3);
		pq.enqueue(p1);
		pq.enqueue(p2);
		assertTrue(2 == pq.size());
		pq.enqueue(p3);
		assertTrue(3 == pq.size());
		exception.expect(RuntimeException.class);
		pq.enqueue(p4);

		System.out.println(pq.dequeue());
	}

	@Test
	public void testDequeue() {
		Person p1 = new Person("Pramod", "Hagenberg");
		Person p2 = new Person("Pramod1", "Hagenberg");
		Person p3 = new Person("Pramod2", "Hagenberg");
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
