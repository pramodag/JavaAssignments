package com.hagenberg.ENI515.exercise7;

public class TowerOfHanoi {
	int n;

	public TowerOfHanoi(int n) {
		this.n = n;
	}

	public void solve() {
		solve(n,1,2,3);

	}
	public void solve(int n, int from, int to, int aux){
		if(n==1) move(1, from,to);
		else{
			solve(n-1, from, aux, to);
			move(n,from,to);
			solve(n-1, aux,to,from);
		}
	}

	private void move(int disk, int from, int to){
		System.out.println(from+"->("+disk+")->"+to);
	}
}
