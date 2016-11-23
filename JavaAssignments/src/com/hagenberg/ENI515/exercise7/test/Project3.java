package com.hagenberg.ENI515.exercise7.test;
public class Project3 {
	static double[] data;
	public static void main(String[] args) {
		data = new double[6];
		data[0] = -3;
		data[1] = 5;
		data[2] = 10;
		data[3] = 10.5;
		data[4] = 24;
		data[5] = 44.5;
		System.out.println(binarySearch(data[4]));
		System.out.println(binarySearch(90));
	}
	public static boolean binarySearch(double key) {
		int size = data.length;
		int low = 0;
		int high = size - 1;
		while (high >= low) {
			int middle = (low + high) / 2;
			if (data[middle] == key)
				return true;
			if (data[middle] < key)
				low = middle + 1;
			if (data[middle] > key)
				high = middle - 1;
		}
		return false;
	}
}