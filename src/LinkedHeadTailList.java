
// Node class at bottom

public class LinkedHeadTailList<T> implements HeadTailListInterface<T> {

	private Node head,tail;

	// WY
	/**
	 * @param head
	 * @param tail
	 */
	public LinkedHeadTailList(LinkedHeadTailList<T>.Node head, LinkedHeadTailList<T>.Node tail) {
		super();
		this.head = head;
		this.tail = tail;
	}

	// WM
	@Override
	public void addFront(T newEntry) {
		// TODO Auto-generated method stub
		
	}

	// SW
	@Override
	public void addBack(T newEntry) {
		// TODO Auto-generated method stub
		
	}

	// WY
	@Override
	public T removeFront() {
		// TODO Auto-generated method stub
		return null;
	}

	// SW
	@Override
	public T removeBack() {
		// TODO Auto-generated method stub
		return null;
	}

	// WY
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	// WY
	@Override
	public T getEntry(int givenPosition) {
		// TODO Auto-generated method stub
		return null;
	}

	// SW
	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	// WM
	@Override
	public int contains(T anEntry) {
		// TODO Auto-generated method stub
		return 0;
	}

	// SW
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	// WM
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	
	private class Node {
		private T data; // Entry in list
		private Node next; // Link to next node

		private Node(T dataPortion) {
			data = dataPortion;
			next = null;
		} // end constructor

		private Node(T dataPortion, Node nextNode) {
			data = dataPortion;
			next = nextNode;
		} // end constructor

		private T getData() {
			return data;
		} // end getData

		private void setData(T newData) {
			data = newData;
		} // end setData

		private Node getNextNode() {
			return next;
		} // end getNextNode

		private void setNextNode(Node nextNode) {
			next = nextNode;
		} // end setNextNode
	} // end Node

}
