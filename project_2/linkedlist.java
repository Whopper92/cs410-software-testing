package stacks;
import java.util.*;

public class linkedlist implements aStack {

	listNode head;
	
	public linkedlist() {		
		head = null;
	}
	 
	@Override
	public Object push(Object anObj) {
		if(head != null) {
			listNode oldHead = new listNode(head.element, head.next);	
			head = new listNode(anObj, oldHead);
			//System.out.println(head.element);
			//System.out.println(head.next.element);
		} else {
			head = new listNode(anObj, null);
		}

		return head.element;
	}

	@Override
	public Object pop() {
		if(head != null) {
			Object oldHead = head.element;
			head = head.next;
			return oldHead;
		} else {
			throw new NoSuchElementException("Stack is empty");
		}
	}

	@Override
	public Object peek() {
		if(head != null) {
			return head.element;
		} else {
			throw new NoSuchElementException("Stack is empty");
		}
	}

	@Override
	public int size() {
		int stackSize = 0;
		listNode curEle = head;
		while(curEle != null) {
			stackSize += 1;
			curEle = curEle.next;
		}
		return stackSize;
	}

	@Override
	public boolean isEmpty() {
		if(head == null) {
			return true;
		} else {
			return false;
		}
	}
}
