package com.hagenberg.ENI515.exercise6;

public class SimpleTime {

	private int h, m, s;
	private String mode;

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
			throw new IllegalArgumentException("Invalid mins");
		this.m = m;
		if (s < 0 || s > 59)
			throw new IllegalArgumentException("Invalid seconds");
		this.s = s;
	}

	public String toString() {
		if (Mode.H24.toString().equals(mode))
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

	public void addHour(int hour) {
		if (h + hour > 23)
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

	public void setMode(Mode m) {
		mode=m.toString();
	}

	public boolean equals(SimpleTime t) {
		if (h == t.h && m == t.m && s == t.s)
			return true;
		return false;
	}

	public static void main(String[] args) {

		SimpleTime t1=new SimpleTime();
		t1.set(5000);
		System.out.println("Printing time in default mode: "+t1);
		t1.setMode(Mode.H24);
		System.out.println("Printing time in 24 Hour formate:"+t1);
		SimpleTime t2=new SimpleTime(22, 25, 32);
		System.out.println("T2: "+t2);
		t2.add(500);
		System.out.println("T2 after adding 500 seconds: "+t2);
	}

}

/*Output:
	Printing time in default mode: 1:23:20:AM
	Printing time in 24 Hour formate:1:23:20
	T2: 10:25:32:PM
	T2 after adding 500 seconds: 10:33:52:PM
*/