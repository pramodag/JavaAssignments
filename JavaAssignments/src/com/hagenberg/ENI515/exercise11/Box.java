package com.hagenberg.ENI515.exercise11;
public class Box<T> {
	private T type;

	public void set(T t) {
		this.type = t;
	}

	public T get() {
		return type;
	}
}
