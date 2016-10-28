package com.hagenberg.ENI515.exercise5;
public class Date {

	int date, month, year;

	public Date(int date, int month, int year) {

		setMonth(month);
		setDate(date);
		setYear(year);
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {

		if (date < 1 || date > getNoOfDays(month))
			throw new IllegalArgumentException("Invalid date.");
		this.date = date;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month < 1 || month > 12)
			throw new IllegalArgumentException("Invalid month");
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year < 1900 || year > 2100)
			throw new IllegalArgumentException("Invalid year. Please enter from 1900 to 2100");
		this.year = year;
	}

	public static int getNoOfDays(int m) {
		switch (m) {
		case 2:
			return 28;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		default:
			return 0;
		}
	}

	public String toString() {
		return date + ":" + month + ":" + year;
	}
}