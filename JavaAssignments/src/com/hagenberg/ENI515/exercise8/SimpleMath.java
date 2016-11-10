package com.hagenberg.ENI515.exercise8;

public class SimpleMath {
	StringBuilder sb = new StringBuilder();

	public int gcdRecursive(int x, int y) {
		// always assigning the bigger number to a
		int a = Math.abs(x) > Math.abs(y) ? Math.abs(x) : Math.abs(y);
		int b = Math.abs(x) > Math.abs(y) ? Math.abs(y) : Math.abs(x);
		if (0 == a)
			return b;
		if (0 == b)
			return a;
		if (a % b == 0)
			return b;
		return gcdRecursive(b, a % b);

	}

	public int gcdIterative(int x, int y) {
		int a = Math.abs(x) > Math.abs(y) ? Math.abs(x) : Math.abs(y);
		int b = Math.abs(x) > Math.abs(y) ? Math.abs(y) : Math.abs(x);
		int temp = 0;
		if (0 == a)
			return b;
		if (0 == b)
			return a;
		if (a % b == 0)
			return b;
		while (a % b != 0) {
			temp = b;
			b = a % b;
			a = b;
		}
		return b;
	}

	public int fibonacciRecursive(int n) {
		if (n < 0)
			throw new IllegalArgumentException("n can not be less than 0");
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
	}

	public int fibonacciIterative(int n) {
		if (n < 0)
			throw new IllegalArgumentException("n can not be less than 1");
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		int fib = 0;
		int a = 0, b = 1;
		for (int i = 2; i <= n; i++) {
			fib = a + b;
			a = b;
			b = fib;
		}
		return fib;
	}
}
