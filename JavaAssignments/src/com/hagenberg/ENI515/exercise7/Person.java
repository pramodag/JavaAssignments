package com.hagenberg.ENI515.exercise7;

public class Person {

	String name,address;
	
	public Person(String name, String address){
		this.name=name;
		this.address=address;
	}
	@Override
	public String toString(){
		return name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
