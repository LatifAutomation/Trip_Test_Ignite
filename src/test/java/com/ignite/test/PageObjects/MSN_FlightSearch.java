package com.ignite.test.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MSN_FlightSearch 
{
	WebDriver ldriver;

	
		
		public MSN_FlightSearch(WebDriver rdriver)
		{
			 ldriver = rdriver;
			PageFactory.initElements(rdriver, this);
			
		}	
		

		@FindBy(xpath="//*[@id=\"u_0_0\"]/div/button/span")
		@CacheLookup
		WebElement facebooklike;
		
     public void faceclick()
     {
    	 facebooklike.click(); 
     }
	

}
