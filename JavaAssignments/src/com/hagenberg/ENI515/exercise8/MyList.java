package com.hagenberg.ENI515.exercise8;
public class MyList {
	private Node head, tail;
	public void append(int val) {
		Node node = new Node();
		node.setVal(val);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.setNext(node);
			tail = node;
		}
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		Node node = head;
		while (node != null) {
			if (node != head)
				sb.append(",");
			sb.append(node.getVal());
			node = node.getNext();
		}
		sb.append("]");
		return sb.toString();
	}
	public boolean contains(int val) {
		Node n = head;
		while (n != null) {
			if (n.getVal() == val) {
				return true;
			}
			n = n.getNext();
		}
		return false;
	}
	public boolean contains2(int val) {
		return contains2(head, val);
	}
	private boolean contains2(Node node, int val) {
		if (node == null)
			return false;
		if (val == node.getVal())
			return true;
		return contains2(node.getNext(), val);
	}
	public int getIndexof(int val) {
		Node n = head;
		int pos = -1;
		while (n != null) {
			pos++;
			if (n.getVal() == val) {
				return pos;
			}
			n = n.getNext();
		}
		return -1;
	}
	public int getNoOccurences(int val) {
		Node n = head;
		int count = 0;
		while (n != null) {
			if (n.getVal() == val)
				count++;
			n = n.getNext();
		}
		return count;
	}
}
