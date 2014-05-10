package stacks;
import java.util.*;

import org.junit.*;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class LLWrapperTest extends baseTest {

	private LLWrapper llWrapperStack;
	
	public LLWrapperTest() {
		super.myStack = llWrapperStack;
	}
	
	@Before
	public void setUpBeforeClass() throws Exception {
		llWrapperStack = null;
		llWrapperStack = new LLWrapper();
		super.myStack = llWrapperStack;
		super.testAPIStack = new Stack();
		super.testAPIStack = super.getNewAPIStack();
	}
}
