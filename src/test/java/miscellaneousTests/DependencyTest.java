package miscellaneousTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTest {
	
	public class DependencyTestsDemo{
		
	@Test
	public void UserRegistration()
	{
		System.out.println("This is test1");
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods = "UserRegistration", alwaysRun = true) // this test will always run even if the test it depends on fails
	public void UserSearch()
	{
		System.out.println("This is test2");
		
	}
	
	@Test
	public void reporterTest3()
	{
		System.out.println("This is test3");
		
	}
	
	@Test
	public void reporterTest4()
	{
		System.out.println("This is test4");
		
	}
}

}
