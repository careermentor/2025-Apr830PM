package org.xyz.automation.proj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FacebookPage {

	WebDriver driver;

	@BeforeMethod
	public void launchBrowser() {
		// WebDriver abc = new ChromeDriver(); //launch your chrome browser

		driver = new EdgeDriver(); // launch your edge browser

		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();

	}

	@AfterMethod
	public void closeBrowser() {
		//driver.close();  //one window only
	//	driver.quit(); //multiple winodws
	}

	@Test(enabled=false)
	public void managebrowser() throws Exception
	{
		driver.navigate().to("https://www.facebook.com/");
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		
		
	}
	
	
	@Test(enabled=true)
	public void signup_func() {

		
		
		WebElement abc = driver.findElement(By.xpath("//a[text()='Create new account']"));
		abc.click();
		
		

		driver.findElement(By.name("firstname")).sendKeys("John");
		
		driver.findElement(By.name("firstname")).clear();
		
		driver.findElement(By.name("firstname")).sendKeys("David");
		
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		WebElement dob_day_field = driver.findElement(By.name("birthday_day"));
		Select dob_day = new Select(dob_day_field);
		
		dob_day.selectByVisibleText("5");
		
		Select dob_month = new Select(driver.findElement(By.name("birthday_month")));
		
		//dob_month.selectByIndex(2); //March
		//dob_month.selectByValue("4"); //April
		dob_month.selectByVisibleText("Sep");
		
		//dob_month.deselectByVisibleText("Sep");
		
		
		int a=20;
		System.out.println(a);
		
		System.out.println(20);
		
		

	}

	@Test(enabled=false)
	public void login_func() {
		driver.findElement(By.id("email")).sendKeys("user1");

		driver.findElement(By.name("pass")).sendKeys("pass1234455");

		driver.findElement(By.cssSelector("[type='submit']")).click();

	}

}
