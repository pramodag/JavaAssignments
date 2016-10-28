package com.hagenberg.ENI515.exercise3;

import java.util.Scanner;

public class PrimeNumbersMethods {

	public static void main(String[] args) {

		int max = getInput();
		int[] primeNumbers = getPrimeNumbers(max);
		print(primeNumbers);
	}

	static int getInput() {
		// Reading user input for max value
		Scanner in = new Scanner(System.in);
		int max = 0;
		System.out.println("Please enter number up to which prime numbers needs to be calculated.");
		try {
			max = in.nextInt();
			in.close();
		} catch (NumberFormatException e) {
			System.out.println("Unable to read user input. Please try again");
			return Integer.MIN_VALUE;
		}
		in.close();
		return max;
	}

	static int[] getPrimeNumbers(int max) {
		if(max<=0)return null;
		boolean[] a = new boolean[max + 1];
		int[] primeNumbersArray = null;
		// Initializing all array elements to true
		for (int i = 2; i <= max; i++)
			a[i] = true;

		// Calculating prime numbers
		int n = 1;
		int k = 2;
		while (k <= max) {
			// Adding counter for a new line after 10 numbers.
			n++;
			// Setting all deviser of i to false.
			for (int j = k + k; j <= max; j = j + k)
				a[j] = false;
			// ignoring non prime numbers
			k++;
			while (k <= max && !a[k])
				k++;
		}
		primeNumbersArray = new int[n];
		primeNumbersArray[0]=1;
		for (int p = 0, q = 1; p < max; p++) {
			if (a[p]) {
				primeNumbersArray[q] = p;
				q++;
			}
		}
		return primeNumbersArray;
	}

	static void print(int[] a) {
		int n = 0;
		for (int i = 0; i < a.length; i++, n++) {
			if (n % 10 == 0) {
				System.out.println();
			}
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

}
