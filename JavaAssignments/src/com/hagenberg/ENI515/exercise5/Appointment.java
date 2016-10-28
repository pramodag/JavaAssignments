package com.hagenberg.ENI515.exercise5;
public class Appointment {
	Date date;
	Time time;
	String className;

	public Appointment(String className, Date date, Time time) {
		this.className = className;
		this.date = date;
		this.time = time;
	}

	public String toString() {
		return "Appointment scheduled for \nClass " + className + "\nDate: " + date + "\nTime: "
				+ time;
	}

}
