import javax.sound.midi.SysexMessage;
import java.util.List;
import java.util.ArrayList;

public class ListHeadTailList<T> implements HeadTailListInterface<T> {

	List<T> list;
	private int head, tail;
	private static final int DEFAULT_SIZE = 50;

	public ListHeadTailList(int size){
		list = new ArrayList<>(size);
		head = 0;
		tail = 0;
	}

	public ListHeadTailList(){
		this(DEFAULT_SIZE);
	}

	@Override
	public void addFront(T newEntry) {
		if(!list.isEmpty()) {
			list.add(list.get(tail));
			for (int i = tail; i >= 0; i--) {
				list.set(i + 1, list.get(i));
			}
			tail++;
			list.set(0, newEntry);
		}
		else{
			list.add(newEntry);
		}
	}

	@Override
	public void addBack(T newEntry) {
		if(!list.isEmpty()) {
			list.add(newEntry);
			tail++;
		}
		else{
			list.add(newEntry);
		}

	}

	@Override
	public T removeFront() {
		T returned = null;
		if(!list.isEmpty()) {
			returned = list.get(0);
			for (int i = 1; i < list.size(); i++) {
				list.set(i - 1, list.get(i));
			}
			list.remove(tail);
			if(tail > head) {
				tail--;
			}
		}
		return returned;
	}

	@Override
	public T removeBack() {
		T returned = null;
		if(!list.isEmpty()) {
			returned = list.get(list.size() - 1);
			list.remove(tail);
			if (tail > head) {
				tail--;
			}
		}
		return returned;
	}

	@Override
	public void clear() {
		list = new ArrayList<>();
		head = 0;
		tail = 0;

	}

	@Override
	public T getEntry(int givenPosition) {
		T returned = null;
		if(givenPosition <= tail && givenPosition >= head) {
			returned = list.get(givenPosition);
		}
		return returned;
	}

	@Override
	public void display() {
		System.out.print(list.toString());
		if(!list.isEmpty()) {
			System.out.print("\t head=" + list.get(head) + "\t tail=" + list.get(tail));
		}
		System.out.println();
	}

	@Override
	public int contains(T anEntry) {
		boolean found = false;
		int index = -1;
		boolean loopDone = false;
		while (!found && !loopDone) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).equals(anEntry)) {
					index = i;
					found = true;
				}
				if (i == list.size() - 1) {
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
