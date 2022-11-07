package listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

//@Listeners(listeners.CustomListener.class)
public class ListenerTest{
	
	@Test
	void test1()
	{
		System.out.println("This is Test1");
		Assert.assertTrue(true);
	}
	
	@Test
	void test2()
	{
		System.out.println("This is Test2");
		Assert.assertEquals("a", "b");
	}
	
	@Test
	void test3()
	{
		System.out.println("This is Test3");
		throw new SkipException("This is Skip Exception"); // it will skip this test 
	}
	
	

}
