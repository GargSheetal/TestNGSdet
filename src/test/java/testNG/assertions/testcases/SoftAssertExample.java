package testNG.assertions.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertExample {
	
	WebDriver driver;
	SoftAssert softassert = new SoftAssert();
	
	@BeforeMethod
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
	}
	
	@Test
	public void verifyTitle()
	{
		String expTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		String actTitle = driver.getTitle();
		softassert.assertEquals(actTitle, expTitle, "Title verification Failed");
		softassert.assertAll();
		
	}

	@Test
	public void verifyText()
	{
		String expText = "Search";
		String actText = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");
		softassert.assertEquals(actText, expText, "Search Text Verfication Failed");
		softassert.assertAll();
		
	}

	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	
}
