package com.hagenberg.ENI515.exercise10;
public interface Collection {
	/**
	 * returns the number of elements in the collection
	 * 
	 * @return
	 */
	public int size();

	/**
	 * Add's item to the collection based on the rank. This does not consider
	 * time and will not reorder of the ranking is changed.
	 * 
	 * @param item
	 * @throws ListException
	 *             if the list is full
	 */
	public void add(Item item) throws ListException;

	/**
	 * Returns true of the itel is present in the collection.
	 * 
	 * @param item
	 * @return
	 */
	public boolean contains(Item item);

	/**
	 * Removes the passed item.
	 * 
	 * @param item
	 * @return true if the itel is removed else false.
	 * @throws ListException
	 *             if the list is empty
	 */
	public boolean remove(Item item) throws ListException;

	/**
	 * returns true if the list is empty.
	 * 
	 * @return
	 */
	public boolean isEmpty();

	/**
	 * returns true if the list is full.
	 * 
	 * @return
	 */
	public boolean isFull();
}
