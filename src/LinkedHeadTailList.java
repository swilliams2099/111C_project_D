
// Node class at bottom

public class LinkedHeadTailList<T> implements HeadTailListInterface<T> {

	private Node head,tail;
	int numbElements;

	// WY
	/**
	 * @param head
	 * @param tail
	 */
	public LinkedHeadTailList(){
        	numbElements = 0;
        	head = null;
        	tail = null;
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
        	T entryRemoved = null;
        	if(numbElements >= 1){
            		entryRemoved = head.data;
            		head = head.next;
            		numbElements--;
            		return entryRemoved;
        	}
        	else{
            		return entryRemoved;
        	}
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
		head = null;
		tail = null;
	}

	// WY
	@Override
    	public T getEntry(int givenPosition) {
        	T result = null;
        	if(givenPosition >= 0 && givenPosition < numbElements) {
            		Node currentNode = head;
            		int currentPosition = 0;
            		while (currentNode != null && currentPosition <= givenPosition){
                		if(currentPosition == givenPosition){
                    		result = currentNode.data;
                    		currentPosition++; //stops the loop
                		}
                		else{
                    			currentNode = currentNode.next;
                    			currentPosition++;
                		}
            		}
            		return result;
        	}
        	else {
            		return result;
        	}
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
