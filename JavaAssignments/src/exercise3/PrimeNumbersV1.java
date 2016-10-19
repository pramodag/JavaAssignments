package exercise3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class PrimeNumbersV1 {

	public static void main(String[] args) {

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
		//
		// Initializing all array elements to true
		for (int i = 2; i <= max; i++)
			a[i] = true;
		// Calculating prime numbers

		System.out.println("Prime numbers from 0 to " + max);
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
		// Printing prime numbers to file.

		File primeNumbersFile = new File(primeFileName);
		BufferedWriter writer=null;
		try {
			if (!primeNumbersFile.exists())
				primeNumbersFile.createNewFile();
			 writer= new BufferedWriter(new FileWriter(primeNumbersFile));
			for (int i = 0; i < a.length; i++) {
				if (a[i] == true) {
					writer.write(i + " ");
				}
			}
			writer.close();
		} catch (Exception e) {
			System.out.println("Unable to write to file: " + e.getMessage());
			
		}
		

	}

}
