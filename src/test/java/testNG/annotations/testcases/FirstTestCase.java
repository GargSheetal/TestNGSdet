package testNG.annotations.testcases;
import org.testng.annotations.Test;

/*
 1. setup - open browser and application
 2. login
 3. close
 */



public class FirstTestCase {

	@Test(priority=1)
	public void setUp()
	{
		System.out.println("Opening Browser");
		
	}
	
	@Test(priority=2)
	public void login()
	{
		System.out.println("This is my login test");
		
	}
	
	@Test(priority=3)
	public void tearDown()
	{
		System.out.println("Closing browser");
		
	}

	
	
	
}
