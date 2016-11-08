package com.hagenberg.ENI515.exercise6;

public class SimpleDate {
	private int day, month, year;

	public SimpleDate() {
		init(0, 0, 0);
	}

	public SimpleDate(int date, int month, int year) {
		init(date, month, year);

	}

	private void init(int date, int month, int year) {
		if (year < 0)
			throw new IllegalArgumentException("Invalid year " + year);
		this.year = year;
		if (month > 12 || month < 1)
			throw new IllegalArgumentException("Invalid month: " + month);
		this.month = month;
		if (date > getNoOfDays() || date < 1)
			throw new IllegalArgumentException("Invalid Date: " + date);
		this.day = date;

	}

	private int getNoOfDays() {
		switch (month) {
		case 2:
			if (isLeapYear()) {
				return 29;
			}
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
			throw new RuntimeException();
		}
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public String toString() {
		return day + "." + month + "." + year;
	}

	public boolean isLeapYear() {
		if (year % 400 == 0)
			return true;
		if (year % 100 == 0)
			return false;
		if (year % 4 == 0)
			return true;
		return false;
	}

	public void set(int day, int month, int year) {
		init(day, month, year);

	}

	public void add(int days) {
		if ((day + days) > getNoOfDays()) {
			int d = day + days;
			while (d > getNoOfDays()) {
				d -= getNoOfDays();
				month++;
				if (month % 12 == 0) {
					year++;
					month = 1;
				}

			}
			day = d;

		} else {
			this.day += days;
		}

	}

	public void addMonth(int month) {
		year += (this.month + month) / 12;
		this.month = (this.month + month) % 12;
	}

	public void addYear(int year) {
		this.year += year;
	}

	public boolean equals(SimpleDate date) {
		return this.year == date.year && this.month == date.month && this.day == date.day;
	}
}

/*
 * Output: Date initialized: 28:2:2015 Date after adding 33 days: 2:4:2015
 * Date2: 10:3:2014 Date aftre adding 314 days: 18:2:2015 18:2:2015 and
 * 18:2:2015 are same. Is 2014 a leap year?: false Date after adding 14 months:
 * 18:4:2016
 */