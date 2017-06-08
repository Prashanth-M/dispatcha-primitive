package cadelac.lib.primitive.adt;

import java.util.ArrayList;


public class CircularQueue<T> {
	


	/**
	 * Constructs the queue with a size
	 */
	public CircularQueue(int size_) {
		
	 	_front = 0;
		_back = size_-1;
		_count = 0;
		_queue = new ArrayList<T>(size_);
		_size = size_;
	}

	/**
	 * Pushes an element onto the back of the queue.
	 *
	 * @param newElement the new element to add
	 */
	public void enque(T newElement) throws Exception {
		if (full()) {
			throw new Exception("queue is full!");
		}

		_back = (_back + 1) % _size;
		_queue.add(_back, newElement);
		_count++;
	}

	/**
	 * Pops an element off the front of the queue.
	 *
	 * @return the front element
	 */
	public T deque() throws Exception {
	 	if (empty()) {
			throw new Exception("queue is empty!");
		}

		T val = _queue.get(_front);
		_front = (_front + 1) %  _size;
		_count--;

		return val;
	}

	/**
	 * Peeks at the front element of the queue.
	 *
	 * @return the front element
	 */
	public T front() throws Exception {
	 	if (empty()) {
			throw new Exception("queue is empty!");
		}

		return _queue.get(_front);
	}

	/**
	 * Peeks at the back element of the queue.
	 *
	 * @return the back element
	 */
	public T back() throws Exception {
	 	if (empty()) {
			throw new Exception("queue is empty!");
		}

		return _queue.get(_back);
	}

	/**
	 * Is the queue empty?
	 *
	 * @return empty status
	 */
	public boolean empty() {
	    	return _count == 0;
	}

	/**
	 * Is the queue full?
	 *
	 * @return full status
	 */
	public boolean full() {
		return _count == _size;
	}

	public int getCount() {
		return _count;
	}
	
	public int getSize() {
		return _size;
	}
	
	public T getElementAt(int index_) throws Exception {
		if (empty()) {
			throw new Exception("queue is empty!");
		}
		if (index_ > _count-1) {
			throw new Exception("subscript out of bounds");
		}
		return _queue.get((_front+index_) % _size);
	}

	    
	private ArrayList<T> _queue; // the physical queue
	private int _front;          // the front index of the queue
	private int _back;           // the back index of the queue
	private int _count;    // the num elements in the queue
	private int _size;	    // the size of the array

}