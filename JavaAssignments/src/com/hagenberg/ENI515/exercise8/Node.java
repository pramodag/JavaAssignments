package com.hagenberg.ENI515.exercise8;

class Node {
	private int val;
	private Node next;

	Node(int val, Node next) {
		this.val = val;
		this.next = next;
	}

	Node() {
		this(0, null);
	}

	Node(int val) {
		this(val, null);
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}
