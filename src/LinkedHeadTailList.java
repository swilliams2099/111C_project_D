
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
		Node newFront = Node<T>(newEntry);
		newFront.next = this.head;
		head = newFront;
		
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
		int containsIndex = -1;	//index of the instance of the entry we are seeking
		int currPos = 1;	//current position in the chain
		boolean found = false;	//lets us break out of the loop earlier
		Node currentNode = head;
		while(currentNode != null && !found) {
			if(currentNode.data.equals(anEntry)) {
				containsIndex = currPos;
				found = true;
			} else {
				currPos++;
				currentNode = currentNode.next;
			}
		}
		return containsIndex;
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
		boolean flag = false;
		if(this.head.data == null && this.head.next == null) {
			flag = true;
		}
		return flag;
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
