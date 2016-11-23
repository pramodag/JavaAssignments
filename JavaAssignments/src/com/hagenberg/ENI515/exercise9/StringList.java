package com.hagenberg.ENI515.exercise9;
/**
 * Creates a List of strings.
 * 
 * @author Pramod Guruvareddy
 *
 */
public class StringList {
	private Node head;
	public StringList() {
		this.head = null;
	}
	/**
	 * Inserts passed value to the String list
	 * 
	 * @param s
	 *            Value to be inserted.
	 */
	public void insert(String s) {
		if (s == null)
			s = "";
		Node node = new Node();
		Node temp = head;
		Node prev = null;
		node.setValue(s);
		if (head == null)
			head = node;
		else {
			while (temp != null && temp.getValue().compareToIgnoreCase(s) < 0) {
				prev = temp;
				temp = temp.getNext();
			}
			// Insertion at the beginning
			if (temp == head) {
				node.setNext(head);
				head = node;
			}
			// Insertion at the middle
			else if (temp != null) {
				prev.setNext(node);
				node.setNext(temp);
			}
			// insertion at the end
			/*
			 * else if(temp.getValue().compareToIgnoreCase(s) < 0){
			 * prev.setNext(node); node.setNext(temp); }
			 */else
				prev.setNext(node);
		}
	}
	/**
	 * Deletes the passed string if found and returns true else false.
	 * 
	 * @param s
	 *            String to be deleted.
	 * @return true if the string found else false.
	 */
	public boolean delete(String s, boolean isIgnoreCase) {
		Node temp = head;
		Node prev = null;
		if (head == null)
			throw new IllegalStateException("Can not delete from empty list");
		if (isIgnoreCase) {
			if (head.getValue().equalsIgnoreCase(s)) {
				head = head.getNext();
				return true;
			}
		} else {
			if (head.getValue().equals(s)) {
				head = head.getNext();
				return true;
			}
		}
		while (temp != null && temp.getValue().compareToIgnoreCase(s) >= 0) {
			if (isIgnoreCase) {
				if (temp.getValue().equalsIgnoreCase(s)) {
					prev.setNext(temp.getNext());
					return true;
				}
			} else {
				if (temp.getValue().equals(s)) {
					prev.setNext(temp.getNext());
					return true;
				}
			}
			prev = temp;
			temp = temp.getNext();
		}
		return false;
	}
	/**
	 * This method will search for the passed string, will return true if found
	 * else false.
	 * 
	 * @param s
	 *            String value to be searched.
	 * @param isIgnoreCase
	 *            set this to true if you want to ignore case while searching.
	 * @return returns true if passed string found else false.
	 */
	public boolean search(String s, boolean isIgnoreCase) {
		Node temp = head;
		while (temp != null && temp.getValue().compareToIgnoreCase(s) <= 0) {
			if (isIgnoreCase) {
				if (temp.getValue().equalsIgnoreCase(s))
					return true;
			} else {
				if (temp.getValue().equals(s))
					return true;
			}
			temp = temp.getNext();
		}
		return false;
	}
	/**
	 * 
	 * @return Returns the average length of all strings in the list.
	 */
	public double getAvgLength() {
		Node temp = head;
		double sum = 0, count = 0;
		if (head == null)
			return 0;
		while (temp != null) {
			sum += temp.getValue().length();
			count++;
			temp = temp.getNext();
		}
		return sum / count;
	}
	/**
	 * Returns string representation of the object.
	 */
	public String toString() {
		if (head == null) {
			return null;
		}
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		Node temp = head;
		while (temp != null) {
			sb.append(temp.getValue());
			if (temp.getNext() != null)
				sb.append(",");
			temp = temp.getNext();
		}
		sb.append("]");
		return sb.toString();
	}
}
