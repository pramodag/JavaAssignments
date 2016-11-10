package com.hagenberg.ENI515.exercise8.test;

import com.hagenberg.ENI515.exercise8.TowerOfHanoi;

public class TestTowerOfHanoi {
	public static void main(String args[]) {
		TowerOfHanoi toh=new TowerOfHanoi(2);
		System.out.println(toh.solve());
		toh=new TowerOfHanoi(-1);
		toh.solve();
		

	}

}
