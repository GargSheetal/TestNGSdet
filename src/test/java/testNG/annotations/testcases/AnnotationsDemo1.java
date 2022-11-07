package testNG.annotations.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsDemo1 {

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
	public void login()
	{
		System.out.println("This is my login test - TC_001");
		
	}
	
	@Test(priority=2)
	public void createAccount()
	{
		System.out.println("This is create account test - TC-002");
		
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Execute Before Test");
		
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("Execute After Test");
		
	}
	
	
	
}
