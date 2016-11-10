package com.hagenberg.ENI515.exercise8;

import java.util.Stack;

public class TowerOfHanoi {
	int n;
	Stack<Integer> a = new Stack<Integer>();
	Stack<Integer> b = new Stack<Integer>();
	Stack<Integer> c = new Stack<Integer>();
	StringBuilder sb = new StringBuilder();

	public TowerOfHanoi(int n) {
		if (n < 1)
			throw new IllegalArgumentException("N can not be less than 1");
		this.n = n;
		for (int i = n; i > 0; i--) {
			a.push(i);
		}
	}

	public String solve() {
		if (n == 0)
			throw new IllegalArgumentException("Value of n is not set");
		sb.append("A: " + a.toString() + "\n");
		sb.append("B: " + b.toString() + "\n");
		sb.append("C: " + c.toString() + "\n");
		sb.append("----------" + "\n");
		solve(n, a, b, c);
		return sb.toString();

	}

	public void solve(int n, Stack<Integer> from, Stack<Integer> to, Stack<Integer> aux) {
		if (n == 1)
			move(1, from, to);
		else {
			solve(n - 1, from, aux, to);
			move(n, from, to);
			solve(n - 1, aux, to, from);
		}
	}

	private void move(int disk, Stack<Integer> from, Stack<Integer> to) {
		from.pop();
		to.push(disk);
		sb.append("A: " + a.toString() + "\n");
		sb.append("B: " + b.toString() + "\n");
		sb.append("C: " + c.toString() + "\n");
		sb.append("----------\n");
	}
}
