package com.hagenberg.ENI515.exercise9.test;
import static org.junit.Assert.*;

import org.junit.Test;

import com.hagenberg.ENI515.exercise9.StringList;
public class TestStringList {
	@Test
	public void testInsert() {
		StringList list = new StringList();
		list.insert("First");
		//assertTrue("[First]".equals(list.toString()));
		list.insert("Second");
		//assertTrue("[Second,First]".equals(list.toString()));
		list.insert("Third");
		//assertTrue("[Third,Second,First]".equals(list.toString()));
		list.insert("Fourth");
		list.insert("1");
		list.insert("Fifth");
		System.out.println(list);
		assertTrue(
				"[1,Fifth,First,Fourth,Second,Third]".equals(list.toString()));
	}
	@Test
	public void testDelete() {
		StringList list = new StringList();
		list.insert("First");
		list.insert("Second");
		list.insert("Third");
		/*list.insert("Tenth");
		list.insert("Eight");*/
		System.out.println(list);
		assertTrue(false == list.delete("first", false));
		assertTrue(true == list.delete("first", true));
		assertTrue(false == list.delete("second", false));
		assertTrue(true == list.delete("second", true));
		assertTrue(false == list.delete("third", false));
		assertTrue(false == list.delete("thirs", true));
		assertTrue(true == list.delete("third", true));
		boolean exceptionThrown = false;
		try {
			list.delete("sample", true);
		} catch (IllegalStateException e) {
			exceptionThrown = true;
		}
		assertTrue(exceptionThrown);
	}
	@Test
	public void testSearch() {
		StringList list = new StringList();
		assertTrue(false == list.search("test", false));
		list.insert("First");
		list.insert("Second");
		list.insert("Third");
		assertTrue(false == list.search("first", false));
		assertTrue(true == list.search("first", true));
		assertTrue(false == list.search("second", false));
		assertTrue(true == list.search("second", true));
		assertTrue(false == list.search("third", false));
		assertTrue(false == list.search("thirs", true));
		assertTrue(true == list.search("third", true));
	}
	@Test
	public void testGetAvgLength() {
		StringList list = new StringList();
		list.insert("First");
		assertTrue(5.0 == list.getAvgLength());
		list.insert("Second");
		assertTrue(5.5 == list.getAvgLength());
		list.insert("Third");
		double delta = 0.0001;
		assertTrue(5.33333 + delta > list.getAvgLength()
				&& 5.33333 - delta < list.getAvgLength());
	}
}