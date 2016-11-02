package com.hagenberg.ENI515.exercise6;

public class SimpleDate {
	private int date, month, year;

	public SimpleDate() {
		init(0, 0, 0);
	}

	public SimpleDate(int date, int month, int year) {
		init(date, month, year);

	}

	private void init(int date, int month, int year) {
		this.year = year;
		if (month > 12 || month < 1)
			throw new IllegalArgumentException("Invalid month: " + month);
		this.month = month;
		if (date > getNoOfDays(month) || date < 1)
			throw new IllegalArgumentException("Invalid Date: " + date);
		this.date = date;

	}

	private int getNoOfDays(int month) {
		switch (month) {
		case 2:
			if (isLeapYear(year)) {
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
			return 0;
		}
	}

	public String toString() {
		return date + ":" + month + ":" + year;
	}

	public static boolean isLeapYear(int year) {
		if (year % 400 == 0)
			return true;
		if (year % 100 == 0)
			return false;
		if (year % 4 == 0)
			return true;
		return false;
	}

	public void set(int date, int month, int year) {
		init(date, month, year);

	}

	public void add(int days) {
		if ((date + days) > getNoOfDays(month)) {
			int d=date+days;
			while (d> getNoOfDays(month)) {
				d-= getNoOfDays(month);
				month++;
				if (month % 12 == 0) {
					year++;
					month = 0;
				}

			}
			date=d;

		}else{
			this.date+=days;
		}

	}

	public void addMonth(int month){
		if((this.month+month)>12){
			year+=(this.month+month)/12;
			this.month=(this.month+month)%12;
		}
	}

	public void addYear(int year) {
		this.year += year;
	}

	public boolean equals(SimpleDate date) {
		if (this.year == date.year && this.month == date.month && this.date == date.date)
			return true;
		return false;
	}
	public static void main(String a[]){
		SimpleDate date=new SimpleDate(28,2,2015);
		System.out.println("Date initialized: "+date);
		date.add(33);
		System.out.println("Date after adding 33 days: "+date);
		date.set(10, 3, 2014);
		System.out.println("Date2: "+date);
		date.add(314);
		System.out.println("Date aftre adding 314 days: "+date);
		SimpleDate date2=new SimpleDate(18,2,2015);
		if(date.equals(date2)){
			System.out.println(date +" and "+date2+" are same.");
		}
		int y=2014;
		System.out.println("Is "+y+" a leap year?: "+SimpleDate.isLeapYear(y));
		date.addMonth(14);
		System.out.println("Date after adding 14 months: "+date);
	}
}

/*Output:
Date initialized: 28:2:2015
Date after adding 33 days: 2:4:2015
Date2: 10:3:2014
Date aftre adding 314 days: 18:2:2015
18:2:2015 and 18:2:2015 are same.
Is 2014 a leap year?: false
Date after adding 14 months: 18:4:2016
*/