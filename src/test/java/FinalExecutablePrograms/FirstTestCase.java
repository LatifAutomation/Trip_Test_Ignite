package FinalExecutablePrograms;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FirstTestCase
{
	public static void main(String[] args) throws InterruptedException {
		
		        //System.setProperty("webdriver.chrome.driver","C://tripti//demo//chromedriver.exe");
		        WebDriver driver=new ChromeDriver();
		        driver.get("http://www.msn.com/en-in/weather/today/New-Delhi,Delhi,India/we-city-28.608,77.201?iso=IN");
		        driver.manage().window().maximize();
		        driver.manage().deleteAllCookies();
		        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		        driver.findElement(By.xpath("//*[@id=\"header-common\"]/div[1]/a[2]")).click();
		        driver.findElement(By.xpath("/html/body/nav/div[1]/ul[2]/li[4]/a")).click();
		        driver.findElement(By.xpath("//*[@id=\"header-common\"]/div[1]/a[2]")).click();
		        Thread.sleep(200);
		        driver.findElement(By.xpath("/html/body/nav/div[2]/div[2]/ul/li[1]/a")).click();
		        Thread.sleep(200);
		        driver.findElement(By.xpath("//*[@id=\"header-common\"]/div[1]/a[2]")).click();
		        Thread.sleep(200);
                driver.findElement(By.xpath("/html/body/nav/div[2]/div[2]/ul/li[3]/a")).click();
		       


		// {
		//
		// WebDriver driver=new ChromeDriver();
		// driver.manage().deleteAllCookies();
		// driver.get("https://flights.msn.com/en-in/flight-search/#");
		// driver.manage().window().maximize();


		// For From City to To City
		//WebElement NewDelhi= driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[3]/div/div/a"));
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		  // jse.executeScript("arguments[0].value='New Delhi';", NewDelhi);

		// WebElement NewDelhi= driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[3]/div/div/a/span"));
		// NewDelhi.click();
		// Thread.sleep(30000);
		// NewDelhi.sendKeys(Keys.CONTROL + "a");
		// NewDelhi.sendKeys(Keys.DELETE);

		     Thread.sleep(10000);
		      WebElement NewDelhi1= driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[3]/div/div/a"));
		      NewDelhi1.click();
		       Actions SelectTo = new Actions(driver);        
		       SelectTo.sendKeys(Keys.CONTROL + "New Delhi").perform();
		       Thread.sleep(5000);
		       
		       //SelectTo.sendKeys(Keys.ENTER);
		       driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[4]/div/div/a")).click();
		       Actions SelectFrom = new Actions(driver);
		       SelectFrom.sendKeys(Keys.CONTROL + "Chennai").perform();
		       SelectTo.sendKeys(Keys.ENTER);

		       //Select Depart date as 10 days ahead from current date
		       // Add return and select date as 5 days ahead from Depart date

		        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		       
		            Date date = new Date();  
		           
		            System.out.println(formatter.format(date));
		           
		            Calendar calendar = Calendar.getInstance();
		            calendar.add(Calendar.DAY_OF_MONTH, 10);
		            Date futureDateTime = calendar.getTime();
		           
		         
		            String toDate = futureDateTime.toString().substring(8, 10);
		            String toMonth = futureDateTime.toString().substring(4, 7);
		           
		            System.out.println(futureDateTime);
		            System.out.println("To Date is "+toDate);
		            Thread.sleep(5000);
		           
		            Calendar calendar1 = Calendar.getInstance();
		            calendar1.add(Calendar.DAY_OF_MONTH, 15);
		            Date futureDateTime1 = calendar1.getTime();
		           
		         
		            String toDate1 = futureDateTime1.toString().substring(8, 10);
		            String toMonth1 = futureDateTime.toString().substring(4, 7);
		            System.out.println(futureDateTime1);
		            System.out.println("To Date is One  "+toDate1);
		           
		           // driver.findElement(By.xpath("//*[@id=\"search-date-depart\"]/div/button/div[1]/span[2]")).click();
		           
		            Thread.sleep(5000);
		            Actions SelectToDat2 = new Actions(driver);
		            SelectToDat2.sendKeys(Keys.CONTROL + toMonth).perform();

		           
		                   
		                     // driver.findElement(By.xpath("//*[@id=\"search-date-depart\"]/div[1]/button/div[1]")).click();
		                        driver.findElement(By.xpath("//*[@id=\"search-date-depart\"]/div[1]/button/div[2]")).click();
		                        driver.findElement(By.xpath("//*[@id=\"date-depart_table\"]/tbody/tr[3]/td[1]/div")).click();
		                        Thread.sleep(5000);
		                        Actions SelectToDat = new Actions(driver);
		                        SelectToDat.sendKeys(Keys.CONTROL + toDate).perform();
		                       
		                       // driver.findElement(By.xpath("//*[@id=\"search-date-return\"]/div/button[1]/span[2]")).click();
		                       // driver.findElement(By.xpath("//*[@id=\"search-date-return\"]/div/button[1]/div[1]/span[2]")).click();
		                     
		                        Thread.sleep(5000);
		                        Actions SelectToDat3 = new Actions(driver);
		                         SelectToDat3.sendKeys(Keys.CONTROL + toMonth1).perform();

		                        driver.findElement(By.xpath("//*[@id=\"search-date-return\"]/div[1]/button[1]/span[2]")).click();
		                        driver.findElement(By.xpath("//*[@id=\"date-return_table\"]/tbody/tr[5]/td[7]/div")).click();
		                        Actions SelectforDate = new Actions(driver);
		                        SelectforDate.sendKeys(Keys.CONTROL + toDate1).perform();
		                       
		                                // 9. Select men 1, women 1 and child 1 and click on Search button
		                    driver.findElement(By.xpath("//*[@id=\"people-and-class\"]/div[2]/div[1]/div/button/div/b[1]")).click();
		                    driver.findElement(By.xpath("//*[@id=\"people-and-class\"]/div[2]/div[1]/div/div/ul/li[1]/a")).click();
		                   
		                   
		                    driver.findElement(By.xpath("//*[@id=\"people-and-class\"]/div[2]/div[2]/div/button/div/b[1]")).click();
		                    driver.findElement(By.xpath("//*[@id=\"people-and-class\"]/div[2]/div[2]/div/div/ul/li[2]/a")).click();
		                   
		                    driver.findElement(By.xpath("//*[@id=\"people-and-class\"]/div[2]/div[4]/div/button/div/b[1]")).click();
		                    driver.findElement(By.xpath("//*[@id=\"people-and-class\"]/div[2]/div[4]/div/div/ul/li[2]/a")).click();

		                    driver.findElement(By.xpath("//*[@id=\"search\"]/a")).click();
		                   
		                    //Capture price from the first listed flight in to variable and print the price
		                       List<WebElement> elements= new ArrayList<WebElement>();
		                       Thread.sleep(10000);
		                   
		                       elements = driver.findElements(By.xpath("//div[@class='price-and-agent']/div[1]"));
		                       WebElement ele=elements.get(0);
		                       String text = ele.getText();
		                        System.out.println(text);
		               
		                //Back To Life style Link
		                 
		                  driver.findElement(By.xpath("//*[@id=\"header-common\"]/div[1]/a[2]")).click();
		                    
		                    //Close Browser
		                    driver.close();
		                   
		}
	
}
