package com.hagenberg.ENI515.exercise9;
public class Student extends Person {
	private String course;
	private int semister;

	public Student() {
		this(null, 0, null, 0);
	}

	public Student(String name, int age, String course, int semister) {
		super(name, age);
		setCourse(course);
		setSemister(semister);
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getSemister() {
		return semister;
	}

	public void setSemister(int semister) {
		this.semister = semister;
	}
}
