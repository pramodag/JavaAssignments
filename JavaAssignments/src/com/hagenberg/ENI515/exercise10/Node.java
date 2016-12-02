package com.hagenberg.ENI515.exercise10;
class Node {
	private Item item;
	private Node next;

	Node(Item val, Node next) {
		this.item = val;
		this.next = next;
	}

	Node() {
		this(null, null);
	}

	Node(Item val) {
		this(val, null);
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}
