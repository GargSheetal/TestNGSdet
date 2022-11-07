package parallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest1 {


	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	
	@BeforeMethod
	void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver.set(new ChromeDriver());
		driver.get().get("https://www.dollardays.com/");
	}
	
	
	@Test
	public void logoTest() throws InterruptedException
	{
		WebElement logo = driver.get().findElement(By.xpath("//*[@id=\"aspnetForm\"]/header/div/div/div/div[1]/div/div[4]/figure/div/a/img"));
		Assert.assertTrue(logo.isDisplayed(), "Logo is not displayed on the page");
		Thread.sleep(3000);
	}
	
	@Test
	public void titleTest() throws InterruptedException
	{
		String title = driver.get().getTitle();
		Assert.assertEquals(title, "DollarDays | Bulk Goods for Nonprofits, Businesses & Schools | Wholesale Products", "Title match failed");
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.get().close();
	}

	
	
}
