package com.hagenberg.ENI515.exercise8;
public class DList {
	DNode head, tail;
	public void insert(int value) {
		DNode p = head;
		if (head == null)
			head = tail = new DNode(value);
		else {
			while (p != null && value > p.getValue())
				p = p.getNext();
			// p == null || value <= p.value
			if (p == null) {
				p = new DNode(value);
				tail.setNext(p);
				p.setPrev(tail);
				tail = p;
			} else { // insert value before p
				DNode q = new DNode(value);
				q.setNext(p);
				q.setPrev(p.getPrev());
				if (p == head)
					head = q;
				else
					p.getPrev().setNext(q);
				p.setPrev(q);
			}
		}
	}
	public void delete(int value) {
		DNode p = head;
		while (p != null && value > p.getValue())
			p = p.getNext();
		// p == null || value <= value
		if (p != null && value == p.getValue()) {
			if (p == head) {
				head = p.getNext();
				if (head == null)
					tail = null;
				else
					head.setPrev(null);
			} else if (p.getNext() == null) {
				tail = p.getPrev();
				tail.setNext(null);
			} else {
				p.getPrev().setNext(p.getNext());
				p.getNext().setPrev(p.getPrev());
			}
		}
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		DNode node = head;
		sb.append("[");
		while (node != null) {
			sb.append(node.getValue());
			node = node.getNext();
			if (node != null)
				sb.append(",");
		}
		sb.append("]");
		return sb.toString();
	}
}
