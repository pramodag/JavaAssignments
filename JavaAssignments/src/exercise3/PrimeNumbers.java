package exercise3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {

		// Version1
		// Initialization
		int max = 0;
		Scanner in = new Scanner(System.in);
		boolean[] a;
		int n = 1;
		String primeFileName = "primeNumbers.txt";

		// Reading user input for max value
		System.out.println("Please enter number up to which prime numbers needs to be calculated.");
		try {
			max = in.nextInt();
		} catch (NumberFormatException e) {
			System.out.println("Unable to read user input. Please try again");
		}
		in.close();
		a = new boolean[max + 1];

		// Initializing all array elements to true
		for (int i = 2; i <= max; i++)
			a[i] = true;

		// Calculating prime numbers
		System.out.println("Prime numbers from 0 to " + max + " :");
		for (int i = 2; i <= max;) {
			// Adding counter for a new line after 10 numbers.
			if (n % 10 == 0)
				System.out.println("");
			n++;
			System.out.print(i + " ");
			// Setting all deviser of i to false.
			for (int j = i + i; j <= max; j = j + i)
				a[j] = false;
			// ignoring non prime numbers
			i++;
			while (i <= max && !a[i])
				i++;
		}
		System.out.println();
		// Printing prime numbers to file.
		File primeNumbersFile = new File(primeFileName);
		BufferedWriter writer = null;
		try {
			if (!primeNumbersFile.exists())
				primeNumbersFile.createNewFile();
			writer = new BufferedWriter(new FileWriter(primeNumbersFile));
			for (int i = 0; i < a.length; i++) {
				if (a[i] == true) {
					writer.write(i + " ");
				}
			}
			writer.close();
		} catch (Exception e) {
			System.out.println("Unable to write to file: " + e.getMessage());
		}

		// Version2 implementation
		// copying all prime numbers to new array.
		StringBuffer sb = new StringBuffer();
		int sum = 0;
		int[] primeNumbers = new int[n - 1];
		for (int i = 2, j = 0; i < a.length; i++) {
			if (a[i] == true) {
				primeNumbers[j] = i;
				j++;
			}

		}

		// Printing prime numbers array and adding the prime number to string
		// buffer and sum
		System.out.println("Printing prime numbers array(Version 2) :");
		n = 1;
		for (int i : primeNumbers) {
			if (n % 10 == 0)
				System.out.println();
			n++;
			sb.append(i + " ");
			sum += i;
			System.out.print(i + " ");
		}
		System.out.println();

		System.out.println("Number of prime numbers from 0 to " + (a.length - 1) + ": " + primeNumbers.length);
		System.out.println("Min :" + primeNumbers[0]);
		System.out.println("Max :" + primeNumbers[primeNumbers.length - 1]);
		System.out.println("Avg :" + String.format("%.3f", (float) sum / primeNumbers.length));

	}

}
