package com.ignite.test.PageObjects;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass 
{
	public static WebDriver driver;
	@Parameters("browser")
	@BeforeClass
	public void setUp(String br)
	{
		
		if(br.equals("chrome"))
		{
			//System.setProperty("Webdriver.chrome.driver", readconfig.getChromePath());
			System.setProperty("Webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://www.msn.com/en-in/weather/today/New-Delhi,Delhi,India/we-city-28.608,77.201?iso=IN");
		}
		else if(br.equals("firefox"))
		{
			System.setProperty("Webdriver.gecko.driver",System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");;
			driver=new FirefoxDriver();
			
		}
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.msn.com/en-in/weather/today/New-Delhi,Delhi,India/we-city-28.608,77.201?iso=IN");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("arguments[0].scrollIntoView();", Element);
		js.executeScript("window.scrollBy(0,40000)");
		
	}
		
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		
		System.out.println("Screenshot taken");
		
	}

	
}
