package miscellaneousTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

// run this class through testngParameters.xml

public class ParametersExample {
	
	WebDriver driver;
	
	@Parameters({"browser", "url"})
	@BeforeClass
	void setup(String browser, String appURL)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("egde"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("ie"))
		{
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		
		driver.get(appURL);
	}
	
	@Test(priority = 1)
	public void logoTest()
	{
		WebElement logo = driver.findElement(By.xpath("//*[@id=\"aspnetForm\"]/header/div/div/div/div[1]/div/div[4]/figure/div/a/img"));
		Assert.assertTrue(logo.isDisplayed(), "Lofo is not displayed on the page");
	}
	
	@Test(priority = 2)
	public void titleTest()
	{
		String title = driver.getTitle();
		Assert.assertEquals(title, "DollarDays | Bulk Goods for Nonprofits, Businesses & Schools | Wholesale Products", "Title match failed");
	}
	
	@AfterClass
	void tearDown()
	{
		driver.close();
	}
	
}
