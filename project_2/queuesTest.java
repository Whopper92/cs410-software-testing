package stacks;
import java.util.*;

import org.junit.*;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class queuesTest extends baseTest {

	private queues queueStack;
	
	@Before
	public void setUpBeforeClass() throws Exception {
		queueStack = null;
		queueStack = new queues();
		super.myStack = queueStack;
		super.testAPIStack = new Stack();
		super.testAPIStack = super.getNewAPIStack();
	}
}
