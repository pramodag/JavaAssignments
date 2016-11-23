package com.hagenberg.ENI515.exercise7;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class PersonQueue implements Iterable<String> {
	private String[] a;
	private int N = 0;
	private int first = 0;
	private int last = 0;

	// cast needed since no generic array creation in Java
	public PersonQueue(int capacity) {
		a = new String[capacity];
	}

	public boolean isEmpty() {
		return N == 0;
	}

	public int size() {
		return N;
	}

	public void enqueue(String person) {
		if (N == a.length) {
			throw new RuntimeException("Person queue overflow");
		}
		a[last] = person;
		last = (last + 1) % a.length; // wrap-around
		N++;
	}

	public String dequeue() {
		if (isEmpty()) {
			throw new RuntimeException("Person queue underflow");
		}
		String item = a[first];
		a[first] = null;
		N--;
		first = (first + 1) % a.length;
		return item;
	}

	public Iterator<String> iterator() {
		return new PersonQueueIterator();
	}

	// an iterator, doesn't implement remove() since it's optional
	public class PersonQueueIterator implements Iterator<String> {
		private int i = 0;

		public boolean hasNext() {
			return i < N;
		}

		public void remove() {
			throw new UnsupportedOperationException("Method unimplemented.");
		}

		public String next() {
			if (!hasNext())
				throw new NoSuchElementException();
			return a[i++];
		}
	}

}
