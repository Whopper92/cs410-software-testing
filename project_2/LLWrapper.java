import java.util.*;

public class LLWrapper implements aStack {

	private LinkedList list;
	
	public LLWrapper() {
		list = new LinkedList();
	}
	
	@Override
	public Object push(Object anObj) {
		list.addFirst(anObj);
		return anObj;
	}

	@Override
	public Object pop() {
		if(list.size() != 0) {
			return list.removeFirst();
		} else {
			throw new NoSuchElementException("Stack is empty");
		}
	}

	@Override
	public Object peek() {
		if(list.size() != 0) {
			return list.getFirst();
		} else {
			throw new NoSuchElementException("Stack is empty");
	 	}
	}

	@Override
	public int size() {
		return list.size();
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}
}
