package org.wipro.automation.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.automation.saucedemo.utilities.ReadPropFile;

public class LoginPage 
{

	WebDriver driver;
	
	public LoginPage(WebDriver driver) 
	{
	
		this.driver=driver;
	}


	public void enter_username(String uname) throws Exception
	{
		driver.findElement(By.id(ReadPropFile.readelement("username_id"))).sendKeys(uname);
	}
	
	
	public void enter_password(String pass) throws Exception
	{
		driver.findElement(By.name(ReadPropFile.readelement("password_name"))).sendKeys(pass);
	}
	
	
	public void click_loginbtnn() throws Exception
	{
		driver.findElement(By.cssSelector(ReadPropFile.readelement("loginbttn_css"))).click();
	}
	
	
}
