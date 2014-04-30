import java.util.*;

import org.junit.*;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class arrayTest extends baseTest {

	private array arrayStack;
	private Stack st;
	private static final int TIMEOUT = 2000;
	
	@Before
	public void setUpBeforeClass() throws Exception {
		arrayStack = null;
		arrayStack = new array(3);
		st = new Stack();
		st = super.getNewAPIStack();
	}

	@Test(timeout = TIMEOUT)
	public void testStackEmptyUponCreation() {
		assertEquals("Stack should be empty upon creation", arrayStack.isEmpty(), st.isEmpty());
	}
	
	@Test(timeout = TIMEOUT)
	public void testStackIsSizeZeroUponCreation() {
		assertEquals("Stack should be size 0 upon creation", arrayStack.size(), 0);
	}
	
	@Test(timeout = TIMEOUT)
	public void testStackIsSizeNAfterNPushed() {
		super.pushElementsOntoAPIStack(st, 3);
		for(int i=0;i<2;++i)
			arrayStack.push("element");
		assertEquals("Stack should be of size N after N pushes", arrayStack.size(), st.size());
	}
	
	@Test(timeout = TIMEOUT)
	public void testPushOnNonFullStack() {
		assertEquals("Pushing onto a non-full stack should return the pushed element", arrayStack.push("hello"), st.push("hello"));
	}
	
	@Test(timeout = TIMEOUT, expected = IndexOutOfBoundsException.class)
	public void testPushOntoFullBoundedStack() {
		for(int i=0; i<4; ++i)
			arrayStack.push("element");
	}
	
	@Test(timeout = TIMEOUT)
	public void testPushThenPopReturnsPushedValue() {
		arrayStack.push("hello");
		assertEquals("Pushing and then popping should return the same value that was pushed", arrayStack.pop(), "hello");
	}

	@Test(timeout = TIMEOUT)
	public void testPopOnNonEmptyStack() {
		st.push("hello");
		arrayStack.push("hello");
		assertEquals("Popping from a non-empty stack should return the head of the stack", arrayStack.pop(), st.pop());
	}
	
	@Test(timeout = TIMEOUT, expected = IndexOutOfBoundsException.class)
	public void testPopOnEmptyStack(){
		arrayStack.pop();
	}
	
	@Test(timeout = TIMEOUT)
	public void testStackIsSizeZeroAfterNPopsWithNSize() {
		for(int i=0;i<2;++i)
			arrayStack.push("element");
		for(int i=0;i<2;++i)
			arrayStack.pop();
		assertEquals("Popping N times on a stack with size N should cause the size to be 0", arrayStack.size(), 0);
	}
	
	@Test(timeout = TIMEOUT)
	public void testPeekOnNonEmptyStack() {
		st.push("hello");
		arrayStack.push("hello");
		assertEquals("Peeking on a non-empty stack should return the head of the stack", arrayStack.peek(), st.peek());
	}
	
	@Test(timeout = TIMEOUT, expected =  NoSuchElementException.class)
	public void testPeekOnEmptyStack() {
		arrayStack.peek();
	}
	
	@Test(timeout = TIMEOUT)
	public void testPeekDoesNotChangeSize() {
		arrayStack.push("hello");
		arrayStack.peek();
		assertEquals("Peeking from the stack should not change the stack's size", arrayStack.size(), 1);
	}
	
	@Test(timeout = TIMEOUT)
	public void testSizeOnNonEmptyStack() {
		st.push("hello");
		arrayStack.push("hello");
		assertEquals("Size should return the number of elements in the stack", arrayStack.size(), st.size());
	}
	
	@Test(timeout = TIMEOUT)
	public void testIsEmptyOnNonEmptyStack() {
		arrayStack.push("hello");
		assertFalse("This non-empty stack should have returned False for isEmpty", arrayStack.isEmpty());
	}
}
