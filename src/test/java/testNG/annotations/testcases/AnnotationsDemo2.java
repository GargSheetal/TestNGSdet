package testNG.annotations.testcases;


import org.testng.annotations.*;

public class AnnotationsDemo2 {

	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class Method");
		
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class Method");
		
	}
	
	@BeforeMethod
	public void setUp()
	{
		System.out.println("Execute before every method");
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		System.out.println("Execute after every method");
		
	}
	
	@Test(priority=1)
	public void addCust()
	{
		System.out.println("This is my add customer test - TC_003");
		
	}
	
	@Test(priority=2)
	public void SearchCust()
	{
		System.out.println("This is search customer test - TC-004");
		
	}
	
	@BeforeSuite
	public void beforeSuire()
	{
		System.out.println("Execute Before Suite");
		
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("Execute After Suite");
		
	}
	
	
}
