package dataProviderDemo;

// maintaining dataProvider in just one class


import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviderFile {

	
	@DataProvider(name="create")
	public Object[][] dataSet1(Method m)
	{
		Object[][] testData = null;
		
		if(m.getName().equals("test"))
		testData = new Object[][]
			{
				{"username1", "password1"},
				{"username2", "password2"},
				{"username3", "password3"},
				{"username4", "password4"}
			};	
			else if(m.getName().equals("test1"))
			{
				testData = new Object[][]
				{
					{"username1", "password1", "test1"},
					{"username2", "password2", "test2"},
					{"username3", "password3", "test3"},
					{"username4", "password4", "test4"}
				};	
			}
			else if(m.getName().equals("test2"))
			{
				testData = new Object[][]
				{
					{"username1", "password1", "test1", "first"},
					{"username2", "password2", "test2", "second"},
					{"username3", "password3", "test3", "third"},
					{"username4", "password4", "test4", "fourth"}
				};	
			}
			return testData;
				
	}
	
	
}
