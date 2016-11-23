package com.hagenberg.ENI515.exercise9;

/**
 * This Class is used to create a node for List of strings.
 * @author Pramod Guruvareddy
 *
 */
public class Node {
	/**
	 * Value of type String to hold the value
	 */
	private String value;
	/**
	 * Node to hold the reference of next object.
	 */
	private Node next;
	/**
	 * Empty constructor
	 */
	public Node(){
		this(null,null);
	}
	/**
	 * Constructor to initialize node and value.
	 * @param value value of type String
	 * @param node Node to hold reference of next node.
	 */
	public Node(String value, Node node){
		this.value=value;
		this.next=node;
	}
	/**
	 * 
	 * @return value of type String
	 */
	public String getValue() {
		return value;
	}
	/**
	 * Sets the passed string to value.
	 * @param value 
	 */
	public void setValue(String value) {
		this.value = value;
	}
	/**
	 * 
	 * @return Reference of the next node
	 */
	public Node getNext() {
		return next;
	}
	/**
	 * 
	 * @param node Reference of the next node.
	 */
	public void setNext(Node node) {
		this.next = node;
	}
	
}
