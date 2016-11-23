package com.hagenberg.ENI515.exercise8;
class DNode {
	public DNode() {
		this(0, null, null);
	}
	public DNode(int value) {
		this(value, null, null);
	}
	public DNode(int value, DNode next, DNode prev) {
		this.value = value;
		this.next = next;
		this.prev = prev;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public DNode getNext() {
		return next;
	}
	public void setNext(DNode next) {
		this.next = next;
	}
	public DNode getPrev() {
		return prev;
	}
	public void setPrev(DNode prev) {
		this.prev = prev;
	}
	private int value;
	private DNode next, prev;
}