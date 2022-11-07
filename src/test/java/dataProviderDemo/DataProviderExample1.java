package dataProviderDemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

// Example of DataProvider with in the same class

public class DataProviderExample1 {

	@Test(dataProvider = "LoginDataProvider")
	public void login(String email, String pwd)
	{
		System.out.println(email + "  " + pwd);
	}
	
	
	@DataProvider(name = "LoginDataProvider")
	public Object[][] getData()
	{
		Object [][] data = {{"abd@gmail.com", "abc"}, {"xyz@gamil.com", "xyz"}, {"mno@gmail.com", "mno"}};
		return data;
	}
	
	
	
	
}
