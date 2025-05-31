package org.xyz.automation.proj;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FetchData 
{
	WebDriver driver;

	@Test
	public void calendarfun()
	{
		driver = new ChromeDriver();
		
		String expURL = "https://www.facebook.com";
		
		driver.get(expURL);
		
		String actURL = driver.getCurrentUrl();
		System.out.println(actURL);
		//Step1
		//Assert.assertEquals(actURL, expURL);  //Hard assertion
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actURL, expURL);  //soft assertion
		
		
		String expPageTitle = "Facebook – log in or sign up";
		
		String actPageTitle = driver.getTitle();  
		System.out.println(actPageTitle);
		//Step2
		sa.assertEquals(actPageTitle, expPageTitle);
		
		String exp_username_textbox = "Email address or phone number";
		
		String act_username_textbox  = driver.findElement(By.id("email")).getDomAttribute("placeholder");
		
		System.out.println(act_username_textbox);
		//Step3
		sa.assertEquals(act_username_textbox, exp_username_textbox);
		
		String exp_login_bttn = "Log in";
		
		String actual_login_bttn = driver.findElement(By.name("login")).getText();
		System.out.println(actual_login_bttn);
		//Step4
		sa.assertEquals(actual_login_bttn, exp_login_bttn);
		
		Point login_loc = driver.findElement(By.name("login")).getLocation();
		System.out.println(login_loc);
		
		//System.out.println(driver.getPageSource());
		
		System.out.println(driver.findElement(By.name("login")).isEnabled());
		
		sa.assertAll();
		
	}
	
}
