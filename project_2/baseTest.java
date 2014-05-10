package stacks;
import java.util.*;

import org.junit.*;

import static org.junit.Assert.*;

import org.junit.*;

public abstract class baseTest {
	
	protected Stack testAPIStack;
	protected aStack myStack;
	protected static final int TIMEOUT = 2000;
	
	@Test(timeout = TIMEOUT)
	public void testStackEmptyUponCreation() {
		assertEquals("Stack should be empty upon creation", myStack.isEmpty(), testAPIStack.isEmpty());
	}
	
	@Test(timeout = TIMEOUT)
	public void testStackIsSizeZeroUponCreation() {
		assertEquals("Stack should be size 0 upon creation", myStack.size(), 0);
	}
	
	@Test(timeout = TIMEOUT)
	public void testStackIsSizeNAfterNPushed() {
		pushElementsOntoAPIStack(testAPIStack, 3);
		for(int i=0;i<2;++i)
			myStack.push("element");
		assertEquals("Stack should be of size N after N pushes", myStack.size(), testAPIStack.size());
	}
	
	@Test(timeout = TIMEOUT)
	public void testPushOnNonFullStack() {
		assertEquals("Pushing onto a non-full stack should return the pushed element", myStack.push("hello"), testAPIStack.push("hello"));
	}
	
	@Test(timeout = TIMEOUT)
	public void testPushThenPopReturnsPushedValue() {
		myStack.push("hello");
		assertEquals("Pushing and then popping should return the same value that was pushed", myStack.pop(), "hello");
	}

	@Test(timeout = TIMEOUT)
	public void testPopOnNonEmptyStack() {
		testAPIStack.push("hello");
		myStack.push("hello");
		assertEquals("Popping from a non-empty stack should return the head of the stack", myStack.pop(), testAPIStack.pop());
	}
	
	@Test(timeout = TIMEOUT, expected = NoSuchElementException.class)
	public void testPopOnEmptyStack(){
		myStack.pop();
	}
	
	@Test(timeout = TIMEOUT)
	public void testStackIsSizeZeroAfterNPopsWithNSize() {
		for(int i=0;i<2;++i)
			myStack.push("element");
		for(int i=0;i<2;++i)
			myStack.pop();
		assertEquals("Popping N times on a stack with size N should cause the size to be 0", myStack.size(), 0);
	}
	
	@Test(timeout = TIMEOUT)
	public void testPeekOnNonEmptyStack() {
		testAPIStack.push("hello");
		myStack.push("hello");
		assertEquals("Peeking on a non-empty stack should return the head of the stack", myStack.peek(), testAPIStack.peek());
	}
	
	@Test(timeout = TIMEOUT, expected =  NoSuchElementException.class)
	public void testPeekOnEmptyStack() {
		myStack.peek();
	}
	
	@Test(timeout = TIMEOUT)
	public void testPeekDoesNotChangeSize() {
		myStack.push("hello");
		myStack.peek();
		assertEquals("Peeking from the stack should not change the stack's size", myStack.size(), 1);
	}
	
	@Test(timeout = TIMEOUT)
	public void testSizeOnNonEmptyStack() {
		testAPIStack.push("hello");
		myStack.push("hello");
		assertEquals("Size should return the number of elements in the stack", myStack.size(), testAPIStack.size());
	}
	
	@Test(timeout = TIMEOUT)
	public void testIsEmptyOnNonEmptyStack() {
		myStack.push("hello");
		assertFalse("This non-empty stack should have returned False for isEmpty", myStack.isEmpty());
	}	
	
	public Stack getNewAPIStack() {
		testAPIStack = null;
		testAPIStack = new Stack();
		return testAPIStack;
	}
	
	public void pushElementsOntoAPIStack(Stack st, int numEleToPush) {
		for(int i=0; i<numEleToPush-1; ++i)
			st.push("element");
	}
}
