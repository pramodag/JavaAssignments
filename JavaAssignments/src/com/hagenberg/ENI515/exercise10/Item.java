package com.hagenberg.ENI515.exercise10;

public interface Item {
	/**
	 * returns the id.
	 * @return
	 */
	public int getId();
	/**
	 * returns name of the item.
	 * @return
	 */
	public String getName();
	/**
	 * Compares the item with passed item. 
	 * @param item to be compared
	 * @return 0 if both items are equal. <0 if the item come before this. else >0
	 */
	public int compareTo(Item item);
}
