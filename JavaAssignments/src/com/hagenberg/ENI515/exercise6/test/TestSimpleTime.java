package com.hagenberg.ENI515.exercise6.test;

import com.hagenberg.ENI515.exercise6.SimpleTime;

public class TestSimpleTime {
	public static void main(String[] args) {

		SimpleTime t1 = new SimpleTime();
		t1.set(5000);
		System.out.println("Printing time in default mode: " + t1);
		SimpleTime.setMode(SimpleTime.Mode.H24);
		System.out.println("Printing time in 24 Hour formate:" + t1);
		SimpleTime t2 = new SimpleTime(22, 25, 32);
		System.out.println("T2: " + t2);
		t2.add(500);
		System.out.println("T2 after adding 500 seconds: " + t2);
		t2.addHour(-60);
		System.out.println(t2);
	}

}
