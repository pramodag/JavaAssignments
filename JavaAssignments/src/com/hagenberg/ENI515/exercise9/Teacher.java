package com.hagenberg.ENI515.exercise9;

public class Teacher extends Person {
	private String subject;
	public Teacher(){
		this(null,0,null);
	}
	public Teacher(String name,int age, String subject){
		super(name,age);
		setSubject(subject);
	}

	public  String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
}
