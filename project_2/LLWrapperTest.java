import java.util.*;

import org.junit.*;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class LLWrapperTest extends baseTest {

	private LLWrapper llWrapperStack;
	private Stack st;
	private static final int TIMEOUT = 2000;
	
	@Before
	public void setUpBeforeClass() throws Exception {
		llWrapperStack = null;
		llWrapperStack = new LLWrapper();
		st = new Stack();
		st = super.getNewAPIStack();
	}

	@Test(timeout = TIMEOUT)
	public void testStackEmptyUponCreation() {
		assertEquals("Stack should be empty upon creation", llWrapperStack.isEmpty(), st.isEmpty());
	}
	
	@Test(timeout = TIMEOUT)
	public void testStackIsSizeZeroUponCreation() {
		assertEquals("Stack should be size 0 upon creation", llWrapperStack.size(), 0);
	}
	
	@Test(timeout = TIMEOUT)
	public void testStackIsSizeNAfterNPushed() {
		super.pushElementsOntoAPIStack(st, 3);
		for(int i=0;i<2;++i)
			llWrapperStack.push("element");
		assertEquals("Stack should be of size N after N pushes", llWrapperStack.size(), st.size());
	}
	
	@Test(timeout = TIMEOUT)
	public void testPushOnNonFullStack() {
		assertEquals("Pushing onto a non-full stack should return the pushed element", llWrapperStack.push("hello"), st.push("hello"));
	}
	
	@Test(timeout = TIMEOUT)
	public void testPushThenPopReturnsPushedValue() {
		llWrapperStack.push("hello");
		assertEquals("Pushing and then popping should return the same value that was pushed", llWrapperStack.pop(), "hello");
	}

	@Test(timeout = TIMEOUT)
	public void testPopOnNonEmptyStack() {
		st.push("hello");
		llWrapperStack.push("hello");
		assertEquals("Popping from a non-empty stack should return the head of the stack", llWrapperStack.pop(), st.pop());
	}
	
	@Test(timeout = TIMEOUT, expected = NoSuchElementException.class)
	public void testPopOnEmptyStack(){
		llWrapperStack.pop();
	}
	
	@Test(timeout = TIMEOUT)
	public void testStackIsSizeZeroAfterNPopsWithNSize() {
		for(int i=0;i<2;++i)
			llWrapperStack.push("element");
		for(int i=0;i<2;++i)
			llWrapperStack.pop();
		assertEquals("Popping N times on a stack with size N should cause the size to be 0", llWrapperStack.size(), 0);
	}
	
	@Test(timeout = TIMEOUT)
	public void testPeekOnNonEmptyStack() {
		st.push("hello");
		llWrapperStack.push("hello");
		assertEquals("Peeking on a non-empty stack should return the head of the stack", llWrapperStack.peek(), st.peek());
	}
	
	@Test(timeout = TIMEOUT, expected =  NoSuchElementException.class)
	public void testPeekOnEmptyStack() {
		llWrapperStack.peek();
	}
	
	@Test(timeout = TIMEOUT)
	public void testPeekDoesNotChangeSize() {
		llWrapperStack.push("hello");
		llWrapperStack.peek();
		assertEquals("Peeking from the stack should not change the stack's size", llWrapperStack.size(), 1);
	}
	
	@Test(timeout = TIMEOUT)
	public void testSizeOnNonEmptyStack() {
		st.push("hello");
		llWrapperStack.push("hello");
		assertEquals("Size should return the number of elements in the stack", llWrapperStack.size(), st.size());
	}
	
	@Test(timeout = TIMEOUT)
	public void testIsEmptyOnNonEmptyStack() {
		llWrapperStack.push("hello");
		assertFalse("This non-empty stack should have returned False for isEmpty", llWrapperStack.isEmpty());
	}	
}
