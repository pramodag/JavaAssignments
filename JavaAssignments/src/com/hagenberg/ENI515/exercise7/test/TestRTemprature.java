package com.hagenberg.ENI515.exercise7.test;

import com.hagenberg.ENI515.exercise7.TowerOfHanoi;

public class TestRTemprature {

	public static void main(String[] args) {

		/*MyBinaryNumber num = new MyBinaryNumber(89);
		for (int i = 2; i < 10; i++) {

			num.set(i);
			System.out.println(i + "==" + num);
		}*/
		TowerOfHanoi t=new TowerOfHanoi(5);
		t.solve();
	}

}
