package stacks;
import java.util.*;

public class array implements aStack {

	private Object[] arrayStack;
	private int stackLength;
	
	public array(int stackSize) {
		arrayStack = new Object[stackSize];
		stackLength = stackSize;
	}
	
	@Override
	public Object push(Object anObj) {
		Object[] newArrayStack = new Object[stackLength];
		int stackElements = getArraySize();
		
		if(stackElements == stackLength) {
			throw new IndexOutOfBoundsException("Stack is full");
		}
		 
		for(int i = stackElements-1;i >= 0; --i) {
			newArrayStack[i+1] = arrayStack[i];
		}
		
		newArrayStack[0] = anObj;
		arrayStack = newArrayStack;
		return arrayStack[0];
	}

	@Override
	public Object pop() {
		Object[] newArrayStack = new Object[stackLength];
		Object poppedObj = new Object();
		int stackElements = getArraySize();
				
		if(stackElements == 0) {
			throw new NoSuchElementException("Stack is empty");
		} else {
			poppedObj = arrayStack[0];
			for(int i = 1; i <= stackElements-1; ++i) {
				newArrayStack[i-1] = arrayStack[i];
			}	

			arrayStack = newArrayStack;
			return poppedObj;
		}		
	}

	@Override
	public Object peek() {
		if(arrayStack[0] == null) {
			 throw new NoSuchElementException("Stack is empty");
		} else {
			return arrayStack[0];
		}

	}

	@Override
	public int size() {
		int stackElements = getArraySize();
		return stackElements;
	}

	@Override
	public boolean isEmpty() {
		int stackElements = getArraySize();
		if(stackElements == 0) {
			return true;
		
		} else {
			return false;
		}
	}
	
	public int getArraySize() {
		int stackElements = 0;
		for(int i=0; i < arrayStack.length; ++i) {
			if(arrayStack[i] != null) {
				stackElements += 1;
			}
		}
		return stackElements;
	}
}
