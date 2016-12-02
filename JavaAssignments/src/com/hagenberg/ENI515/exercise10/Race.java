package com.hagenberg.ENI515.exercise10;
public class Race implements Collection {
	private String raceName;
	protected Node head;
	private int max, size;
	public static final String NEWLINECHAR = System
			.getProperty("line.separator");

	public Race(int maxParticipents) {
		if (maxParticipents > 1)
			this.max = maxParticipents;
	}
	public String getRaceName() {
		return raceName;
	}

	public void setRaceName(String raceName) {
		this.raceName = raceName;
	}

	

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Race name: " + raceName + NEWLINECHAR);
		sb.append("Participents" + NEWLINECHAR);
		Node n = head;
		Ranking r = null;
		while (n != null) {
			r = (Ranking) n.getItem();
			sb.append("Rank: " + r.getRank() + " Name: " + r.getName()
					+ " Time:" + r.getTime().toString() + NEWLINECHAR);
			n = n.getNext();
		}
		return sb.toString();
	}

	public void resize(int max) {
		if (max > size) {
			this.max = max;
		}
	}

	public void add(Item item) throws ListException {
		Node node = new Node();
		Node tempNode = head;
		Node pre = head;
		Ranking rs = null;
		Ranking r = (Ranking) item;
		node.setItem(item);
		if (head == null) {
			head = node;
			size++;
		} else {
			if (size < max) {
				while (tempNode != null) {
					rs = (Ranking) tempNode.getItem();
					if (r.getRank() > rs.getRank()) {
						pre = tempNode;
						tempNode = tempNode.getNext();
					} else
						break;
				}
				if (tempNode == null) {
					pre.setNext(node);
					size++;
				} else if (tempNode == head) {
					node.setNext(head);
					head = node;
				} else {
					pre.setNext(node);
					node.setNext(tempNode);
					size++;
				}
			} else {
				throw new ListException("ItemList full");
			}
		}
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
