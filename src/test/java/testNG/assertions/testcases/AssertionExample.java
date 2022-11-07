package testNG.assertions.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionExample {
	
	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.dollardays.com/");
	}
	
	@Test(priority = 1)
	public void logoTest()
	{
		WebElement logo = driver.findElement(By.xpath("//*[@id=\"aspnetForm\"]/header/div/div/div/div[1]/div/div[4]/figure/div/a/img"));
		Assert.assertTrue(logo.isDisplayed(), "Logo is not displayed on the page");
	}
	
	@Test(priority = 2)
	public void titleTest()
	{
		String title = driver.getTitle();
		Assert.assertEquals(title, "DollarDays | 123Bulk Goods for Nonprofits, Businesses & Schools | Wholesale Products", "Title match failed");
	}
	
	@AfterClass
	void tearDown()
	{
		driver.close();
	}
	
}
