package com.hagenberg.ENI515.exercise6.test;

import com.hagenberg.ENI515.exercise6.SimpleDate;

public class TestSimpleDate {
	public static void main(String a[]) {
		SimpleDate date = new SimpleDate(28, 2, 2015);
		System.out.println("Date initialized: " + date);
		date.add(33);
		System.out.println("Date after adding 33 days: " + date);
		date.set(10, 3, 2014);
		System.out.println("Date2: " + date);
		date.add(314);
		System.out.println("Date after adding 314 days: " + date);
		SimpleDate date2 = new SimpleDate(18, 2, 2016);
		System.out.println("is " + date + " and " + date2 + " are same? " + date2.equals(date));
		System.out.println("Is " + date.getYear() + " a leap year?: " + date.isLeapYear());
		date.addMonth(14);
		System.out.println("Date after adding 14 months: " + date);
		SimpleDate d3=new SimpleDate(1, 1, 2016);
		d3.addMonth(12);
		System.out.println("Date3 "+d3);
		d3.add(-365);
		System.out.println("Date3 "+d3);
		
		d3.addMonth(-12);
		
		System.out.println("Date3 "+d3);
		
	}
}
