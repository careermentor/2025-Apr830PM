package org.wipro.automation.saucedemo.baseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.wipro.automation.saucedemo.utilities.ReadPropFile;

public class InitaiteBrowser
{

	public WebDriver driver;
	
	
	@BeforeMethod
	public void launchBrowser() throws Exception
	{
		
		if(ReadPropFile.readconfig("BrowsureName").equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		
		
		else if(ReadPropFile.readconfig("BrowsureName").equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		
		else if(ReadPropFile.readconfig("BrowsureName").equalsIgnoreCase("safari"))
		{
			driver = new SafariDriver();
		}
		
		
		else
		{
			driver = new ChromeDriver();
		}
		
		driver.get(ReadPropFile.readconfig("ApplicationURL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	
	
	@AfterMethod
	public void closerBroser()
	{
		//driver.quit();
	}
	
	
}
