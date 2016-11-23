package com.hagenberg.ENI515.exercise9.test;

import com.hagenberg.ENI515.exercise6.SimpleTime.Mode;
import com.hagenberg.ENI515.exercise9.AdvancedTime;

public class TetsAdvancedTime {
	public static void main(String args[]){
		AdvancedTime time=new AdvancedTime();
		time.set(3, 4, 5, 32);
		AdvancedTime.setMode(Mode.H24);
		System.out.println(time);
	}
}
