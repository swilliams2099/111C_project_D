import java.util.List;

public class ListHeadTailList<T> implements HeadTailListInterface<T> {

	List<T> list = new ArrayList<T>; // initialize to type ArrayList or LinkedList
	int head = 0;
	int tail = list.size() - 1;

	@Override
	public void addFront(T newEntry) {
		for (int i = tail; i > 0; i--) {
			list[i + 1] = list[i];
		}
		tail++;
		list[0] = newEntry;
	}

	@Override
	public void addBack(T newEntry) {
		list[tail + 1] = newEntry;
		tail++;

	}

	@Override
	public T removeFront() {
		T returned = list[0];
		for (int i = 1; i <= list.size(); i++) {
			list[i - 1] = list[i];
		}
		list[tail] = null;
		tail--;
		return returned;
	}

	@Override
	public T removeBack() {
		T returned = list[list.size() - 1];
		list[list.size() - 1] = null;
		return returned;
	}

	@Override
	public void clear() {
		list = new ArrayList<T>;
		head = 0;
		tail = list.size();

	}

	@Override
	public T getEntry(int givenPosition) {
		T returned = list[givenPosition];
		return returned;
	}

	@Override
	public void display() {
		System.out.println(list.toString());

	}

	@Override
	public int contains(T anEntry) {
		boolean found = false
	    int index = -1;
		boolean loopDone = false;
		while(!found && !loopDone) {
			for(int i = 0; i < list.size(); i++) {
				if(list[i].equals(anEntry)) {
					index = i;
					found = true;
				}
				if(i == list.size() - 1) {
					loopDone = true;
				}
			}
		}
		return index;
	}

	@Override
	public int size() {
		return list.size();
	}

	@Override
	public boolean isEmpty() {
		return list.size() == 0;
	}

}
