package com.hagenberg.ENI515.exercise8.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.hagenberg.ENI515.exercise7.MyBinaryNumber;

public class TestBinaryNumber {
	@Test
	public void test() {
		MyBinaryNumber n = new MyBinaryNumber(4);
		assertTrue("100".equals(n.toString()));
		n.set(8);
		assertTrue("1000".equals(n.toString()));
		n.set(7);
		assertTrue("111".equals(n.toString()));
		n.set(-3);
		assertTrue("-11".equals(n.toString()));
		n.set(0);
		assertTrue("0".equals(n.toString()));
	}

}
