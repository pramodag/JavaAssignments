package com.hagenberg.ENI515.exercise7;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class PersonQueue implements Iterable<Person> {
	private Person[] a;
	private int N = 0;
	private int first = 0;
	private int last = 0;

	// cast needed since no generic array creation in Java
	public PersonQueue(int capacity) {
		a = new Person[capacity];
	}

	public boolean isEmpty() {
		return N == 0;
	}

	public int size() {
		return N;
	}

	public void enqueue(Person person) {
		if (N == a.length) {
			throw new RuntimeException("Person queue overflow");
		}
		a[last] = person;
		last = (last + 1) % a.length; // wrap-around
		N++;
	}

	public Person dequeue() {
		if (isEmpty()) {
			throw new RuntimeException("Person queue underflow");
		}
		Person item = a[first];
		a[first] = null;
		N--;
		first = (first + 1) % a.length;
		return item;
	}

	public Iterator<Person> iterator() {
		return new PersonQueueIterator();
	}

	// an iterator, doesn't implement remove() since it's optional
	public class PersonQueueIterator implements Iterator<Person> {
		private int i = 0;

		public boolean hasNext() {
			return i < N;
		}

		public void remove() {
			throw new UnsupportedOperationException("Method unimplemented.");
		}

		public Person next() {
			if (!hasNext())
				throw new NoSuchElementException();
			return a[i++];
		}
	}

}
