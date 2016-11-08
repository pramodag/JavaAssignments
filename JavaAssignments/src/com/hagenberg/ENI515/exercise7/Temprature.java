package com.hagenberg.ENI515.exercise7;

/**
 * some document
 * @author pramod_local
 *
 */
public class Temprature {
	private int degree;
	Mode mode;

	enum Mode {
		Celsius, Fahrenheite, Kelvin
	}

	public Temprature(int d) {
		degree = d;
	}

	public Temprature(int d, Mode m) {
		degree = d;
		mode = m;
	}

	public void set(int d) {
		degree = d;
	}

	public void setMode(Mode m){
		mode=m;
	}
	
	public String toString() {
		if (mode == Mode.Celsius)
			return degree + "C";
		if (mode == Mode.Fahrenheite)
			return degree + "F";
		return degree + "K";

	}

}
