import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

import org.junit.*;

public abstract class baseTest {
	
	private Stack testAPIStack;
	
	public abstract void testStackEmptyUponCreation();
	public abstract void testStackIsSizeZeroUponCreation();
	public abstract void testStackIsSizeNAfterNPushed();
	public abstract void testPushOnNonFullStack();
	public abstract void testPushThenPopReturnsPushedValue();
	public abstract void testPopOnNonEmptyStack();
	public abstract void testPopOnEmptyStack();
	public abstract void testStackIsSizeZeroAfterNPopsWithNSize();
	public abstract void testPeekOnNonEmptyStack();
	public abstract void testPeekOnEmptyStack();
	public abstract void testPeekDoesNotChangeSize();
	public abstract void testSizeOnNonEmptyStack();
	public abstract void testIsEmptyOnNonEmptyStack();
	
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
