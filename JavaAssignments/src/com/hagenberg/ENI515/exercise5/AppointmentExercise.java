package com.hagenberg.ENI515.exercise5;
public class AppointmentExercise {

	public static void main(String[] args) {
		Time t=new Time(10,0,0);
		Date d=new Date(29, 10, 2016);
		Appointment app=new Appointment("Java Class", d, t);
		System.out.println(app);

	}

}
