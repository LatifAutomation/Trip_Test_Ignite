package com.ignite.test.PageObjects;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class MSN_HomePage 

{
	/*public static void main(String[] args) throws InterruptedException 
	{
	*/
WebDriver driver;
	
	
	
		
		
		
	
		/*//WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("http://www.msn.com/en-in/weather/today/New-Delhi,Delhi,India/we-city-28.608,77.201?iso=IN");
      //  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        */
	
       WebElement header = driver.findElement(By.xpath("//*[@id=\"header-common\"]/div[1]/a[2]"));
       
         WebElement travelLink = driver.findElement(By.xpath("/html/body/nav/div[1]/ul[2]/li[4]/a"));
       
      WebElement lifelink = driver.findElement(By.xpath("//*[@id=\"header-common\"]/div[1]/a[2]"));
      // Thread.sleep(200);
       WebElement tool = driver.findElement(By.xpath("/html/body/nav/div[2]/div[2]/ul/li[1]/a"));
      // Thread.sleep(200);
       WebElement flight = driver.findElement(By.xpath("//*[@id=\"header-common\"]/div[1]/a[2]"));
       //Thread.sleep(200);

      WebElement search = driver.findElement(By.xpath("/html/body/nav/div[2]/div[2]/ul/li[3]/a"));
       ////////////////////////////////////////////////////////////////
       //System.out.println("Coming to flight search page");
       
       WebElement flight2 = driver.findElement(By.xpath("//*[@id=\"search-wrapper\"]/div[2]/div/ul/li/a/span"));
     //  System.out.println("Flight Link is clicked");
      // Thread.sleep(200);
       
      public void headerClick()
      {
    	 header.click();
      }
      
      public void travelLink()
      {
    	  travelLink.click();
      }
      
      
      public void lifelink()
      {
    	  lifelink.click();
      }
      
      public void toolclick()
      {
    	  tool.click();
      }
      
      public void flightclick()
      {
    	  flight.click();
      }
      
      public void searchClick()
      {
    	  search.click();
      }
      public void flight2Click()
      {
    	  flight2.click();
      }
      
      /*  driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[3]/div/div/a")).click();
       Actions action=new Actions(driver);
       //Select select=new Select(from);
      // select.selectByVisibleText(" New Delhi");
       
      //action.moveToElement(from).perform();
     // action.click()
   // action.sendKeys("Delhi");
     // from.sendKeys("Delhi");
       action.sendKeys(Keys.CONTROL+ "New Delhi (DEL)").perform();
       
      driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[4]/div/div/a")).sendKeys("Chennai");
      
      
      
      SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
      Calendar Depart_Date=Calendar.getInstance();
      Depart_Date.setTime(new Date());
      Depart_Date.add(Calendar.DATE, 10);
      String output = sdf.format(Depart_Date.getTime());
      System.out.println(output);
      
      Calendar Return_Date = Calendar.getInstance();
      Return_Date.setTime(new Date());
      Return_Date.add(Calendar.DATE, 15);
      
       
      //  String url = driver.getCurrentUrl();
       // System.out.println(url);
      driver.close();
        
        
	*/
	
}
	

