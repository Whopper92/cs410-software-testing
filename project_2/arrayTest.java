package stacks;
import java.util.*;

import org.junit.*;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class arrayTest extends baseTest {

	private array arrayStack;
	
	@Before
	public void setUpBeforeClass() throws Exception {
		arrayStack = null;
		arrayStack = new array(3);
		super.myStack = arrayStack;
		super.testAPIStack = new Stack();
		super.testAPIStack = super.getNewAPIStack();
	}

	@Test(timeout = TIMEOUT, expected = IndexOutOfBoundsException.class)
	public void testPushOntoFullBoundedStack() {
		for(int i=0; i<4; ++i)
			arrayStack.push("element");
	}
}
