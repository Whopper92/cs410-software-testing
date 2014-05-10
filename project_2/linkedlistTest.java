package stacks;
import java.util.*;

import org.junit.*;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class linkedlistTest extends baseTest {

	private linkedlist llStack;
	
	@Before
	public void setUpBeforeClass() throws Exception {
		llStack = null;
		llStack = new linkedlist();
		super.myStack = llStack;
		super.testAPIStack = new Stack();
		super.testAPIStack = super.getNewAPIStack();
	}
}
