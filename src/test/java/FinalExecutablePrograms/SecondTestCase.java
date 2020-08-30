package FinalExecutablePrograms;

import org.openqa.selenium.JavascriptExecutor;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.Assertion;

public class SecondTestCase 
{

	public static void main(String[] args) throws InterruptedException

	{

		WebDriver driver=new ChromeDriver();

		// Access http://www.msn.com/en-in/weather/today/New-Delhi,Delhi,India/we-city-28.608,77.201?iso=IN
		driver.get("http://www.msn.com/en-in/weather/today/New-Delhi,Delhi,India/we-city-28.608,77.201?iso=IN");
		driver.manage().deleteAllCookies();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		       // Click on facebook like in the footer.

		     /*  Thread.sleep(40000);
		       Actions Ac = new Actions(driver);
		       Thread.sleep(10000);
		       driver.switchTo().defaultContent();
		       driver.switchTo().frame(3);
		       WebDriverWait wait = new WebDriverWait(driver,30);
		       WebElement facebook =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@title,'Like MSN India')]")));
		       facebook.click();
		       facebook.click();
		       System.out.println("Element is clicked");      
		       driver.switchTo().frame(3);
		           driver.findElement(By.xpath("/html/body/div/div/div/table/tbody/tr/td/div/div/button/span")).click();
		       driver.findElement(By.xpath("//*[@id=\"u_0_0\"]/div/button/span")).click();
		       System.out.println("Element is clicked");
		       Set<String> set = driver.getWindowHandles();
		       Iterator<String> I1= set.iterator();
		                while(I1.hasNext())
		       {
		                String child_window=I1.next();
		                driver.switchTo().window(child_window);
		                System.out.println(driver.switchTo().window(child_window).getTitle());
		                driver.close();
		       }
		     
		   //Twitter
		      driver.get("http://www.msn.com/en-in/weather/today/New-Delhi,Delhi,India/we-city-28.608,77.201?iso=IN");
		      Thread.sleep(40000);
		          Actions Ac1 = new Actions(driver);
		          Thread.sleep(10000);
		          driver.switchTo().defaultContent();
		         
		          //Switch to frame
		          driver.switchTo().frame(4);
		          //Explicite wait
		          WebDriverWait wait1 = new WebDriverWait(driver,30);
		          WebElement Twitter =wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@title,'Follow @msnindia')]")));
		          Twitter.click();
		          Twitter.click();
		          System.out.println("Element is clicked");
		          driver.switchTo().frame(3);
		               driver.findElement(By.xpath("/html/body/div/div/div/table/tbody/tr/td/div/div/button/span")).click();
		          driver.findElement(By.xpath("//*[@id=\"u_0_0\"]/div/button/span")).click();
		          System.out.println("Element is clicked");
		          Set<String> set1 = driver.getWindowHandles();
		       Iterator<String> I2= set1.iterator();

		       while(I2.hasNext())
		       {
		        String child_window=I2.next();
		                driver.switchTo().window(child_window);
		                System.out.println(driver.switchTo().window(child_window).getTitle());
		                driver.close();
		       }
		       */
		          // Capture the Delhi temp in a variable.        

		      String Delhitemp = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[1]/div[1]/section[1]/div[1]/span")).getText();
		      System.out.println(Delhitemp);
		      Thread.sleep(300);
		       
		  //   Search for Bengaluru weather.
		  //   Validate ‘Bengaluru' is shown in dropdown field.
		       driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[1]/div[1]/div[2]/div[1]/a")).click();
		       WebElement dropDown = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[1]/div[1]/div[2]/div[2]/div[1]/form/div[1]/input"));
		       dropDown.sendKeys("Bengaluru");
		       dropDown.sendKeys(Keys.ENTER);
		       Thread.sleep(200);
		       dropDown.sendKeys(Keys.ENTER);
		  //   Capture the Bengaluru temp in a variable.
		       String Bengwheather = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[1]/div[1]/section[1]/div[1]/span")).getText();
		       System.out.println(Bengwheather);
		       String title = driver.getTitle();
		       System.out.println(title);
		       
		       if(title.contains("Bengaluru"))
		       {
		        Assert.assertTrue(true);
		        System.out.println("Bengaluru' is shown in dropdown field");
		       }
		       
		       else
		       {
		        System.out.println("Bengaluru' is not shown in dropdown field");
		       }
		     
		   //  Compare the both Delhi and Bengaluru temp’s, print message with city which is having higher temp.
		       int i=Integer.parseInt(Delhitemp);  
		       int j=Integer.parseInt(Bengwheather);
		       
		       if (i>j)  
		       {
		     System.out.println("Delhi Temprature is High as compare to Benguluru");
		       }
		       else
		       {
		     System.out.println("Bengaluru Temprature is High as compare to Delhi");  
		       }
		   //  12. Close browser.
		       driver.close();
	}
}