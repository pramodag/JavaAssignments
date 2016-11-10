package com.hagenberg.ENI515.exercise8.test;

import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.hagenberg.ENI515.exercise8.SimpleMath;

public class TestSimpleMath {
	@Rule
	public ExpectedException exception = ExpectedException.none();

	@Test
	public void testGCDRecursive() {
		SimpleMath math = new SimpleMath();
		assertTrue(10 == math.gcdRecursive(10, 0));
		assertTrue(1 == math.gcdRecursive(10, 3));
		assertTrue(4 == math.gcdRecursive(4, 12));
		assertTrue(1 == math.gcdRecursive(21, 4));
		assertTrue(2 == math.gcdRecursive(-10, 4));
		assertTrue(0 == math.gcdRecursive(0,0));
	}

	@Test
	public void testGCDIterative() {
		SimpleMath math = new SimpleMath();
		assertTrue(10 == math.gcdIterative(10, 0));
		assertTrue(1 == math.gcdIterative(10, 3));
		assertTrue(4 == math.gcdIterative(4, 12));
		assertTrue(1 == math.gcdIterative(21, 4));
		assertTrue(2 == math.gcdIterative(-10, 4));
		assertTrue(0 == math.gcdIterative(0,0));
	}

	@Test
	public void testFibonacciRecursive() {
		SimpleMath math = new SimpleMath();
		assertTrue(2 == math.fibonacciRecursive(3));
		assertTrue(3 == math.fibonacciRecursive(4));
		assertTrue(13 == math.fibonacciRecursive(7));
		assertTrue(0 == math.fibonacciRecursive(0));
		exception.expect(IllegalArgumentException.class);
		assertTrue(2 == math.fibonacciRecursive(-4));
	}
	@Test
	public void testFibonacciIterative() {
		SimpleMath math = new SimpleMath();
		assertTrue(2 == math.fibonacciIterative(3));
		assertTrue(3 == math.fibonacciIterative(4));
		assertTrue(13 == math.fibonacciIterative(7));
		assertTrue(0 == math.fibonacciIterative(0));
		exception.expect(IllegalArgumentException.class);
		assertTrue(2 == math.fibonacciIterative(-4));
	}
}
