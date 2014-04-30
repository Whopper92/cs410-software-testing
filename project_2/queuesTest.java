import java.util.*;

import org.junit.*;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class queuesTest extends baseTest {

	private queues queueStack;
	private Stack st;
	private static final int TIMEOUT = 2000;
	
	@Before
	public void setUpBeforeClass() throws Exception {
		queueStack = null;
		queueStack = new queues();
		st = new Stack();
		st = super.getNewAPIStack();
	}

	@Test(timeout = TIMEOUT)
	public void testStackEmptyUponCreation() {
		assertEquals("Stack should be empty upon creation", queueStack.isEmpty(), st.isEmpty());
	}
	
	@Test(timeout = TIMEOUT)
	public void testStackIsSizeZeroUponCreation() {
		assertEquals("Stack should be size 0 upon creation", queueStack.size(), 0);
	}
	
	@Test(timeout = TIMEOUT)
	public void testStackIsSizeNAfterNPushed() {
		super.pushElementsOntoAPIStack(st, 3);
		for(int i=0;i<2;++i)
			queueStack.push("element");
		assertEquals("Stack should be of size N after N pushes", queueStack.size(), st.size());
	}
	
	
	@Test(timeout = TIMEOUT)
	public void testPushOnNonFullStack() {
		assertEquals("Pushing onto a non-full stack should return the pushed element", queueStack.push("hello"), st.push("hello"));
	}
	
	@Test(timeout = TIMEOUT)
	public void testPushThenPopReturnsPushedValue() {
		queueStack.push("hello");
		assertEquals("Pushing and then popping should return the same value that was pushed", queueStack.pop(), "hello");
	}

	@Test(timeout = TIMEOUT)
	public void testPopOnNonEmptyStack() {
		st.push("hello");
		queueStack.push("hello");
		assertEquals("Popping from a non-empty stack should return the head of the stack", queueStack.pop(), st.pop());
	}
	
	@Test(timeout = TIMEOUT, expected = NoSuchElementException.class)
	public void testPopOnEmptyStack(){
		queueStack.pop();
	}
	
	@Test(timeout = TIMEOUT)
	public void testStackIsSizeZeroAfterNPopsWithNSize() {
		for(int i=0;i<2;++i)
			queueStack.push("element");
		for(int i=0;i<2;++i)
			queueStack.pop();
		assertEquals("Popping N times on a stack with size N should cause the size to be 0", queueStack.size(), 0);
	}
	
	@Test(timeout = TIMEOUT)
	public void testPeekOnNonEmptyStack() {
		st.push("hello");
		queueStack.push("hello");
		assertEquals("Peeking on a non-empty stack should return the head of the stack", queueStack.peek(), st.peek());
	}
	
	@Test(timeout = TIMEOUT, expected =  ArrayIndexOutOfBoundsException.class)
	public void testPeekOnEmptyStack() {
		queueStack.peek();
	}
	
	@Test(timeout = TIMEOUT)
	public void testPeekDoesNotChangeSize() {
		queueStack.push("hello");
		queueStack.peek();
		assertEquals("Peeking from the stack should not change the stack's size", queueStack.size(), 1);
	}
	
	@Test(timeout = TIMEOUT)
	public void testSizeOnNonEmptyStack() {
		st.push("hello");
		queueStack.push("hello");
		assertEquals("Size should return the number of elements in the stack", queueStack.size(), st.size());
	}
	
	@Test(timeout = TIMEOUT)
	public void testIsEmptyOnNonEmptyStack() {
		st.push("hello");
		queueStack.push("hello");
		assertFalse("This non-empty stack should have returned False for isEmpty", queueStack.isEmpty());
	}
}
