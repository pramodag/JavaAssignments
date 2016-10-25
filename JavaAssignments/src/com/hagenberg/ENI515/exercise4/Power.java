package com.hagenberg.ENI515.exercise4;

import java.util.Scanner;

public class Power {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int  exp = 63;
		double base=4;
		System.out.println("Please enter the base.");
		base = readInput();
		System.out.println("Please enter the exponent.");
		exp = readInput();
		scan.close();
		
		//Displaying power calculated using normal method.
		double power = pow(base, exp);
		System.out.println("Power of ("+base+","+exp+") calculated using normal method is :"+power);

		//Displaying power calculated using efficient method.
		power = powEficient(base, exp);
		System.out.println("Power of ("+base+","+exp+") calculated using efficient method is :"+power);
		
		//Displaying power calculated using Math.pow function.
		power = Math.pow(base, exp);
		System.out.println("Power of ("+base+","+exp+") calculated using Math.pow is :"+power);
		
		checkEfficency(base, exp);
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

	public static double pow(double base, int exponent) {
		double result = 1;
		if (exponent == 0) {
			return 1;
		}
		if (base == 0) {
			return 0;
		}
		
		if (exponent < 0) {
			return 1/pow(base, -exponent);
		}
		while (exponent > 0) {
			result *= base;
			exponent--;
		}
		return result;
	}

	public static double powEficient(double base, int exponent) {
		double result = 1;
		if (exponent == 0) {
			return 1;
		}
		if (base == 0) {
			return 0;
		}
		
		if (exponent < 0) {
			return 1/pow(base, -exponent);
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
	public static void checkEfficency(double base, int exponent){
		int noOfIteration=100000;
		
		//calculating power using normal method for 10000 times
		long timeStart=System.currentTimeMillis();
		for(int i=0;i<noOfIteration;i++){
			pow(base, exponent);
		}
		long timeEnd=System.currentTimeMillis();
		System.out.println("Time taken in normal method for "+noOfIteration+" iterations: "+(timeEnd-timeStart));
		
		//calculating power using efficient method for 10000 times
		timeStart=System.currentTimeMillis();
		for(int i=0;i<noOfIteration;i++){
			powEficient(base, exponent);
		}
		timeEnd=System.currentTimeMillis();
		System.out.println("Time taken in efficient method for "+noOfIteration+" iterations: "+(timeEnd-timeStart));
	}

}

/* Sample op
Please enter the base.
6
Please enter the exponent.
-2
Power of (6.0,-2) calculated using normal method is :0.027777777777777776
Power of (6.0,-2) calculated using efficient method is :0.027777777777777776
Power of (6.0,-2) calculated using Math.pow is :0.027777777777777776
Time taken in normal method for 100000 iterations: 6
Time taken in efficient method for 100000 iterations: 5


Please enter the base.
0
Please enter the exponent.
0
Power of (0.0,0) calculated using normal method is :1.0
Power of (0.0,0) calculated using efficient method is :1.0
Power of (0.0,0) calculated using Math.pow is :1.0
Time taken in normal method for 100000 iterations: 5
Time taken in efficient method for 100000 iterations: 3

Please enter the base.
5
Please enter the exponent.
7
Power of (5.0,7) calculated using normal method is :78125.0
Power of (5.0,7) calculated using efficient method is :78125.0
Power of (5.0,7) calculated using Math.pow is :78125.0
Time taken in normal method for 100000 iterations: 7
Time taken in efficient method for 100000 iterations: 5


*/