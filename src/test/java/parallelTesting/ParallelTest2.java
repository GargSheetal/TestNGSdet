package parallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest2 {

	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	
	@Test
	void loginTest() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver.set(new ChromeDriver());
		driver.get().get("https://www.dollardays.com/");
		
		driver.get().findElement(By.xpath("//*[@id=\"aspnetForm\"]/header/div/div/div/div[3]/div/ul/li[1]/a/span")).click();
		driver.get().findElement(By.xpath("//*[@id=\"aspnetForm\"]/header/div/div/div/div[3]/div/ul/li[1]/ul/li[2]/a")).click();
		
		Thread.sleep(3000);
		
		driver.get().findElement(By.name("username")).sendKeys("kanhakuapoojan@gmail.com");
		driver.get().findElement(By.name("password")).sendKeys("laddoosingh");
		driver.get().findElement(By.xpath("//*[@id=\"aspnetForm\"]/div[5]/div/div/div/div[2]/div/div[1]/div/div/div[4]/button")).click();
		
		Boolean alertMsg = driver.get().findElements(By.xpath("//*[@id=\"aspnetForm\"]/div[5]/div/div/div/div[1]/div/div/div/div/div[2]")).size() > 0;
		  
		if(alertMsg==false)
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false, "TC_loginTest_001 Fails ");
		}		
		
	}
	
	@AfterMethod
	void tearDown()
	{
		driver.get().close();
	}
	
}
