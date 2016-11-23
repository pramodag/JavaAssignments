package com.hagenberg.ENI515.exercise6;
public class SimpleTime {
	private int h, m, s;
	private static Mode mode;
	public static enum Mode {
		AM_PM, H24;
	}

	public SimpleTime() {
		init(0, 0, 0);
	}

	public SimpleTime(int h, int m, int s) {
		init(h, m, s);
	}

	private void init(int h, int m, int s) {
		if (h < 0 || h > 23)
			throw new IllegalArgumentException("Invalid hours");
		this.h = h;
		if (m < 0 || m > 59)
			throw new IllegalArgumentException("Invalid minutes");
		this.m = m;
		if (s < 0 || s > 59)
			throw new IllegalArgumentException("Invalid seconds");
		this.s = s;
	}

	public String toString() {
		if (Mode.H24 == mode)
			return h + ":" + m + ":" + s;
		if (h > 12)
			return h % 12 + ":" + m + ":" + s + ":" + "PM";
		return h + ":" + m + ":" + s + ":" + "AM";
	}

	public void add(int sec) {
		h += (s + sec) / 3600;
		m += ((s + sec) % 3600) / 60;
		s = (s + sec) % 60;
		if (m > 59) {
			h += m / 60;
			m = m % 60;
		}
		if (h > 23)
			h = h % 24;
	}

	public void set(int sec) {
		init(0, 0, 0);
		add(sec);
	}

	public void set(int h, int m, int s) {
		init(h, m, s);
	}

	public void addHour(int hour) {
		h = (h + hour) % 24;
	}

	public void addMin(int min) {
		if (m + min > 60) {
			h += (m + min) / 60;
			m = (m + min) % 60;
		}
		if (h > 23)
			h = h % 24;
	}

	public static void setMode(Mode m) {
		mode = m;
	}

	public boolean equals(SimpleTime t) {
		return h == t.h && m == t.m && s == t.s;
	}
}
/*
 * Output: Printing time in default mode: 1:23:20:AM Printing time in 24 Hour
 * formate:1:23:20 T2: 10:25:32:PM T2 after adding 500 seconds: 10:33:52:PM
 */