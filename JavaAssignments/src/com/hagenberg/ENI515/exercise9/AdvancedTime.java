package com.hagenberg.ENI515.exercise9;
import com.hagenberg.ENI515.exercise6.SimpleTime;;
public class AdvancedTime extends SimpleTime {
	public AdvancedTime() {
		this(0, 0, 0);
	}

	public AdvancedTime(int h, int m, int s) {
		super(h, m, s);
		setMillis(0);
	}

	public void set(int h, int m, int s) {
		set(h, m, s, 0);
	}

	public void set(int h, int m, int s, int ms) {
		super.set(h, m, s);
		setMillis(ms);
	}

	public void setMillis(int ms) {
		if (ms < 0 || ms > 999)
			throw new IllegalArgumentException();
		millis = ms;
	}

	public String toString() {
		String s = super.toString();
		s += ":" + millis ;
		return s;
	}
	private int millis;
}
