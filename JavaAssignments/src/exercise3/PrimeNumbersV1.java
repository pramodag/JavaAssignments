package exercise3;

import java.util.Scanner;

public class PrimeNumbersV1 {

	public static void main(String[] args) {

		// Initialization
		int max = 0;
		Scanner in = new Scanner(System.in);
		boolean[] a;
		//Reading user input for max value
		System.out.println("Please enter number up to which prime numbers needs to be calculated.");
		try {
			max = in.nextInt();
		} catch (NumberFormatException e) {
			System.out.println("Unable to read user input. Please try again");
		}
		in.close();
		a=new boolean[max+1];
		//
		//Initializing all array elements to true
		for(int i=2;i<=max;i++) a[i]=true;
		//Calculating prime numbers
		for(int i=2;i<=max;){
			System.out.println(i+" ");
			for(int j=i;j<=max;j=j+1) a[j]=false;
			while(i<=max &&!a[i]) i++;
		}
		
	}

}
