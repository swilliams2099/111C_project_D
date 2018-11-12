
// Node class at bottom

public class LinkedHeadTailList<T> implements HeadTailListInterface<T> {

	private Node head,tail;
	private int numberOfEntries = 0;

	// WY
	/**
	 * @param head
	 * @param tail
	 */
	public LinkedHeadTailList(){
        	numberOfEntries = 0;
        	head = null;
        	tail = null;
    	}
  
	public LinkedHeadTailList(LinkedHeadTailList<T>.Node head, LinkedHeadTailList<T>.Node tail) {
		super();
		this.head = head;
		this.tail = tail;
		
		// tail = head? head = tail?
	}

	// WM
	@Override
	public void addFront(T newEntry) {
		// TODO Auto-generated method stub
//		Node newFront = Node<T>(newEntry); // revised -SW
		Node newFront = new Node(newEntry);
		newFront.next = this.head;
		head = newFront;
		// added -SW
		numberOfEntries++;
		
	}

	// SW
	@Override
	public void addBack(T newEntry) {
		
		// need to test!
		
		// create "old tail" node and assign tail node to it
		Node oldTail = tail;
		
		// create new tail node with new entry
		Node newTail = new Node(newEntry, null);
		
		// iterate through nodes to find the node before the (old) tail
		// which was linked to "tail"
		// and link it to the newly created old tail
		Node currentNode = head;
		while (currentNode.next != tail) {
			currentNode = currentNode.next;
		}
		currentNode.next = oldTail;
	
		// link old tail to new tail
		oldTail.next = newTail;
		
		// assign new tail to "tail" instance variable
		tail = newTail;
		
		numberOfEntries++;
	}

	// WY
	@Override
    	public T removeFront() {
        	T entryRemoved = null;
        	if(numberOfEntries >= 1){
            		entryRemoved = head.data;
            		head = head.next;
            		numberOfEntries--;
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
		Node currentNode = head;
		while(currentNode.next != tail) {
			currentNode = currentNode.next;
		}
		currentNode.next = null;
		tail = currentNode;
		numberOfEntries--;
		return tail.data;
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
        	if(givenPosition >= 0 && givenPosition < numberOfEntries) {
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
		System.out.print("[");
		Node currentNode = head;
		while (currentNode.next != null) {
			System.out.print(currentNode.data + ", ");
			currentNode = currentNode.next;
		} 
		System.out.print(currentNode.next.data); // print tail without comma
		System.out.print("]\t head=" + this.head.data + "\ttail=" + this.tail.data);
		
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
		return numberOfEntries;
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
			this(dataPortion, null);
		}
//			data = dataPortion;
//			next = null;
//		} // end constructor

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
