package exercise4;

import java.util.Scanner;

public class Power {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int base = 0, exp = 0;
		System.out.println("Please enter the base.");
		base = readInput();
		System.out.println("Please enter the exponent.");
		exp = readInput();
		scan.close();
		
		//Displaying power and time taken to calculate using normal method.
		long time1=System.currentTimeMillis();
		double power = pow(base, exp);
		long time2=System.currentTimeMillis();
		System.out.println("Power of ("+base+","+exp+") calculated using normal method is :"+power);
		System.out.println("Time taken to calculate using normal method: "+(time2-time1));

		//Displaying power and time taken to calculate using efficient method.
		time1=System.currentTimeMillis();
		power = powEficient(base, exp);
		time2=System.currentTimeMillis();
		System.out.println("Power of ("+base+","+exp+") calculated using efficient method is :"+power);
		System.out.println("Time taken to calculate using efficient method: "+(time2-time1));
		
		//Displaying power and time taken to calculate using Math.pow function.
		time1=System.currentTimeMillis();
		System.out.println(time1);
		power = Math.pow(base, exp);
		time2=System.currentTimeMillis();
		System.out.println(time2);
		System.out.println("Power of ("+base+","+exp+") calculated using Math.pow is :"+power);
		System.out.println("Time taken to calculate using Math.pow : "+(time2-time1));
	}

	public static int readInput() {
		int n = 0;
		while (true) {
			try {
				n = scan.nextInt();
				scan.nextLine();
				return n;
			} catch (Exception e) {
				System.out.println("Oh Oh looks like it is not a valid integer please try again.");
				scan.nextLine();
			}

		}
	}

	public static double pow(int base, int exponent) {
		double result = 1;
		if (base == 0) {
			return 0;
		}
		if (exponent == 0) {
			return 1;
		}
		if (exponent < 0) {
			return pow(base, -exponent);
		}
		while (exponent > 0) {
			result *= base;
			exponent--;
		}
		return result;
	}

	public static double powEficient(int base, int exponent) {
		double result = 1;
		if (base == 0) {
			return 0;
		}
		if (exponent == 0) {
			return 1;
		}
		if (exponent < 0) {
			return pow(base, -exponent);
		}
		while (exponent > 0) {
			if (exponent % 2 == 0) {
				base = base * base;
				exponent = exponent / 2;
				result *= base;
				exponent--;
			} else {
				result *= base;
				exponent--;
			}
		}
		return result;
	}

}
