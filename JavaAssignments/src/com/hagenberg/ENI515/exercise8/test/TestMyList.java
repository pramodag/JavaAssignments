package com.hagenberg.ENI515.exercise8.test;

import com.hagenberg.ENI515.exercise8.DList;
import com.hagenberg.ENI515.exercise8.MyList;

public class TestMyList {

	public static void main(String[] args) {
		testDList();
		
	}
	static void testDList(){
		DList list = new DList();
		list.insert(2);
		list.insert(3);
		list.insert(8);
		list.insert(6);
		list.insert(0);
		System.out.println(list);
		list.delete(8);
		System.out.println(list);
		list.delete(0);
		System.out.println(list);
		list.delete(3);
		System.out.println(list);
		
	}

	public static void testList(){
		MyList list = new MyList();
		list.append(1);
		list.append(2);
		list.append(3);
		list.append(2);
		System.out.println(list);
		System.out.println(list.getIndexof(6));
		System.out.println(list.getNoOccurences(2));
		System.out.println(list.getNoOccurences(7));
		System.out.println(list.contains2(1));
		System.out.println(list.contains2(6));
		
	}
}
