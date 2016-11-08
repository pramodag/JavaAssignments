package com.hagenberg.ENI515.exercise7.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.hagenberg.ENI515.exercise7.MyBinaryNumber;

public class TestMyBinaryNumber {

	@Test
	public void test() {
		MyBinaryNumber n = new MyBinaryNumber(4);
		assertTrue("success", "100".equals(n.toString()));
		n.set(8);
		assertTrue("success", "1000".equals(n.toString()));
		n.set(7);
		assertTrue("success", "111".equals(n.toString()));
		n.set(-3);
		assertTrue("success", "-11".equals(n.toString()));
		n.set(0);
		assertTrue("success", "0".equals(n.toString()));
	}
	/*public void check(int i, String s){
		MyBinaryNumber n = new MyBinaryNumber(4);
		assertTrue(s.equals(n.toString()));
	}*/

}
