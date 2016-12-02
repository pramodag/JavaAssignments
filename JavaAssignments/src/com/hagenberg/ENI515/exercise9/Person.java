package com.hagenberg.ENI515.exercise9;
public class Person {
	private String name;
	private int age;

	public Person() {
		this(null, 0);
	}

	public Person(String name, int age) {
		setName(name);
		setAge(age);
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected int getAge() {
		return age;
	}

	protected void setAge(int age) {
		if (age < 70 && age > 5) {
			this.age = age;
		} else
			throw new IllegalArgumentException("Invalid age ");
	}

	public String toString() {
		return name;
	}

	public boolean equals(Object o) {
		if(! (o instanceof Person)) return false;
		Person p=(Person)o;
		if (name.equalsIgnoreCase(p.getName()))
			return true;
		return false;
	}
}
