package stacks;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	arrayTest.class,
	linkedlistTest.class,
	LLWrapperTest.class,
	queuesTest.class 
})
public class AllTests {

}
