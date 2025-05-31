package org.xyz.automation.proj;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TheTestingWorld 
{
	WebDriver driver;

	@Test
	public void calendarfun() throws Exception
	{
		driver = new ChromeDriver();
		driver.get("https://www.thetestingworld.com/testings/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
			
		
		driver.findElement(By.name("fld_username")).sendKeys("John");
		
		driver.findElement(By.id("datepicker")).sendKeys("05/22/2020");
		
		driver.findElement(By.xpath("//a[text()='22']")).click();
		
		Select con = new Select(driver.findElement(By.name("country")));
		con.selectByVisibleText("United States");
		
		Select st = new Select(driver.findElement(By.name("state")));
		
	//	Thread.sleep(5000);
		
		
		//WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("stateId")), "Florida"));
		
				
		st.selectByVisibleText("Hawaii");
		
	}
	
}
