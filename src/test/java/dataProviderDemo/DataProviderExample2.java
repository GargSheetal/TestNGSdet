package dataProviderDemo;

import org.testng.annotations.Test;

//Example of DataProvider with DataProvider in another class. Here just add the additional tag - dataProviderClass = CustomDataProvider.class


public class DataProviderExample2 {
	
	@Test(dataProvider = "LoginDataProvider", dataProviderClass = CustomDataProvider.class)
	public void login(String email, String pwd)
	{
		System.out.println(email + "  " + pwd);
	}

}
