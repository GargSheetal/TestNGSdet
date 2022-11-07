package dataProviderDemo;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {

	@DataProvider(name = "LoginDataProvider")
	public Object[][] getData()
	{
		Object [][] data = {{"abd@gmail.com", "abc"}, {"xyz@gamil.com", "xyz"}, {"mno@gmail.com", "mno"}};
		return data;
	}
	
	
}
