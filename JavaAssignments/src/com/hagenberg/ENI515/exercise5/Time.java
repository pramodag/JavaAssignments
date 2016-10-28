package com.hagenberg.ENI515.exercise5;
public class Time {
	private int h, m, s;

	public Time(int h, int m, int s) {
		setH(h);
		setM(m);
		setS(s);
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		if (h < 0 || h > 23)
			throw new IllegalArgumentException("Invalid hours");
		this.h = h;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		if (m < 0 || m > 59)
			throw new IllegalArgumentException("Invalid mins");
		this.m = m;
	}

	public int getS() {
		return s;
	}

	public void setS(int s) {
		if (s < 0 || s > 59)
			throw new IllegalArgumentException("Invalid seconds");
		this.s = s;
	}

	public String toString() {
		return h + ":" + m + ":" + s;
	}
}
