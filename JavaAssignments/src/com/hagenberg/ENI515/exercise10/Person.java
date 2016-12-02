package com.hagenberg.ENI515.exercise10;
public class Person implements Item {
	private String name;
	private int id;

	public Person(String name, int id) {
		if (name == null || id == 0)
			throw new IllegalArgumentException("Invalid arguments");
		this.name = name;
		this.id = id;
	}

	public String toString() {
		return name;
	}

	public boolean equals(Object o) {
		if (!(o instanceof Person))
			return false;
		Person p = (Person) o;
		if (name.equalsIgnoreCase(p.getName()))
			return true;
		return false;
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Item item) {
		return name.compareTo(item.getName());
	}
}
