package com.hagenberg.ENI515.exercise11;
public class Main {
	public static void main(String[] args) {
		Box<String> strbox=new Box<>();
		strbox.set("Hello!!");
		Box<Integer> intbox=new Box<>();
		intbox.set(new Integer(100));
		System.out.println(strbox.get()+" "+intbox.get());
	}
}
