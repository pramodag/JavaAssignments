package com.hagenberg.ENI515.exercise10;
public class ItemList implements Collection {
	protected Node head;
	private int max, size;

	public ItemList(int max) {
		this.max = max;
	}

	public void resize(int max) {
		if (max > size) {
			this.max = max;
		}
	}

	
	@Override
	public void add(Item item) throws ListException {
		Node node = new Node();
		Node tempNode = head;
		Node pre = null;
		node.setItem(item);
		if (head == null) {
			head = node;
			size++;
		} else {
			if (size < max) {
				while (tempNode.getNext() != null
						&& tempNode.getItem().compareTo(item) < 0) {
					pre = tempNode;
					tempNode = tempNode.getNext();
				}
				pre.setNext(node);
				node.setNext(tempNode);
				size++;
			} else {
				throw new ListException("ItemList full");
			}
		}
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		Node node = head;
		while (node != null) {
			if (node != head)
				sb.append(",");
			sb.append(node.getItem());
			node = node.getNext();
		}
		sb.append("]");
		return sb.toString();
	}

	@Override
	public boolean contains(Item val) {
		Node n = head;
		while (n != null) {
			if (n.getItem().compareTo(val) == 0) {
				return true;
			}
			n = n.getNext();
		}
		return false;
	}

	@Override
	public int size() {
		int size = 0;
		Node node = head;
		while (node != null) {
			size++;
			node = node.getNext();
		}
		return size;
	}

	@Override
	public boolean remove(Item item) throws ListException {
		Node temp = head;
		Node prev = null;
		if (head == null)
			throw new ListException("Item list epty.");
		if (head.getItem().compareTo(item) == 0) {
			head = head.getNext();
			size--;
			return true;
		}
		while (temp != null) {
			if (temp.getItem().compareTo(item) == 0) {
				prev.setNext(temp.getNext());
				size--;
				return true;
			}
			prev = temp;
			temp = temp.getNext();
		}
		return false;
	}

	@Override
	public boolean isEmpty() {
		if (head == null)
			return true;
		return false;
	}

	@Override
	public boolean isFull() {
		if (size == max)
			return true;
		return false;
	}
}
