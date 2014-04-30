import java.util.*;

import org.junit.*;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class linkedlistTest extends baseTest {

	private linkedlist llStack;
	private Stack st;
	private static final int TIMEOUT = 2000;
	
	@Before
	public void setUpBeforeClass() throws Exception {
		llStack = null;
		llStack = new linkedlist();
		st = new Stack();
		st = super.getNewAPIStack();
	}

	@Test(timeout = TIMEOUT)
	public void testStackEmptyUponCreation() {
		assertEquals("Stack should be empty upon creation", llStack.isEmpty(), st.isEmpty());
	}
	
	@Test(timeout = TIMEOUT)
	public void testStackIsSizeZeroUponCreation() {
		assertEquals("Stack should be size 0 upon creation", llStack.size(), 0);
	}
	
	@Test(timeout = TIMEOUT)
	public void testStackIsSizeNAfterNPushed() {
		super.pushElementsOntoAPIStack(st, 3);
		for(int i=0;i<2;++i)
			llStack.push("element");
		assertEquals("Stack should be of size N after N pushes", llStack.size(), st.size());
	}
	
	@Test(timeout = TIMEOUT)
	public void testPushOnNonFullStack() {
		assertEquals("Pushing onto a non-full stack should return the pushed element", llStack.push("hello"), st.push("hello"));
	}
	
	@Test(timeout = TIMEOUT)
	public void testPushThenPopReturnsPushedValue() {
		llStack.push("hello");
		assertEquals("Pushing and then popping should return the same value that was pushed", llStack.pop(), "hello");
	}

	@Test(timeout = TIMEOUT)
	public void testPopOnNonEmptyStack() {
		st.push("hello");
		llStack.push("hello");
		assertEquals("Popping from a non-empty stack should return the head of the stack", llStack.pop(), st.pop());
	}
	
	@Test(timeout = TIMEOUT, expected = NoSuchElementException.class)
	public void testPopOnEmptyStack(){
		llStack.pop();
	}
	
	@Test(timeout = TIMEOUT)
	public void testStackIsSizeZeroAfterNPopsWithNSize() {
		for(int i=0;i<2;++i)
			llStack.push("element");
		for(int i=0;i<2;++i)
			llStack.pop();
		assertEquals("Popping N times on a stack with size N should cause the size to be 0", llStack.size(), 0);
	}
	
	@Test(timeout = TIMEOUT)
	public void testPeekOnNonEmptyStack() {
		st.push("hello");
		llStack.push("hello");
		assertEquals("Peeking on a non-empty stack should return the head of the stack", llStack.peek(), st.peek());
	}
	
	@Test(timeout = TIMEOUT, expected =  NoSuchElementException.class)
	public void testPeekOnEmptyStack() {
		llStack.peek();
	}
	
	@Test(timeout = TIMEOUT)
	public void testPeekDoesNotChangeSize() {
		llStack.push("hello");
		llStack.peek();
		assertEquals("Peeking from the stack should not change the stack's size", llStack.size(), 1);
	}
	
	@Test(timeout = TIMEOUT)
	public void testSizeOnNonEmptyStack() {
		st.push("hello");
		llStack.push("hello");
		assertEquals("Size should return the number of elements in the stack", llStack.size(), st.size());
	}
	
	@Test(timeout = TIMEOUT)
	public void testIsEmptyOnNonEmptyStack() {
		llStack.push("hello");
		assertFalse("This non-empty stack should have returned False for isEmpty", llStack.isEmpty());
	}
}
