package common;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;
	
	@BeforeClass
	public void setUp()
	{
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("");
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}	
	
	
	public String randomString()	// this method generates string of random alphabets
	{
		String generatedString = RandomStringUtils.randomAlphabetic(8);
		return generatedString;
	}
	
	public String randomNumber()	// this method generates string of random numbers
	{
		String generatedString2 = RandomStringUtils.randomNumeric(10);
		return generatedString2;
	}
	
	public void captureScreenshot(WebDriver driver, String testname) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		String datename = new SimpleDateFormat("yyyy.MM.dd.hh.mm.ss.SSSS").format(new Date());
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + testname + datename + ".png");
		
		FileUtils.copyFile(source, target);
		
		System.out.println("Screenshot Taken");
		
	}
	
	
	
}
