package testNG.annotations.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestCase {
	
	
	@Test(priority=1)
	public void setup()
	{
		System.out.println("Opening Browser");
	}
	
	@Test(priority=3)
	public void searchCustomer()
	{
		System.out.println("this is my search customer test");
		Assert.assertTrue(true);
	}
	
	@Test(priority=3)
	public void addCustomer()
	{
		System.out.println("this is my add customer test");
		
	}

	@Test(priority=4, enabled=false)
	public void tearDown()
	{
		System.out.println("Closing browser");
		
	}
	

}
