package com.hagenberg.ENI515.exercise7;

public class MyBinaryNumber {
	int x;

	public MyBinaryNumber(int x) {
		this.x = x;
	}

	public String toString() {
		if (x < 0) {
			return "-" + convertToBinary(-x);
		}
		return convertToBinary(x);
	}

	public String convertToBinary(int n) {
		if (n < 2)
			return n % 2 + "";
		return convertToBinary(n / 2) + "" + n % 2;
	}

	public void set(int x) {
		this.x = x;
	}

}
