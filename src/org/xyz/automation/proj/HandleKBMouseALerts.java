package org.xyz.automation.proj;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandleKBMouseALerts 
{
	WebDriver driver;

	@Test
	public void handleFrames() throws Exception
	{
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		System.out.println(driver.findElement(By.xpath("//h1[text()='Frames']")).getText());
		
	driver.switchTo().frame("frame1");
		
		System.out.println(driver.findElement(By.xpath("//h1[text()='This is a sample page']")).getText());
		
		CaptureScreenshot.testresults(driver,"handleFrames");
		
	}
	
	
	@Test(enabled=true)
	public void handleAlerts() throws Exception
	{
		driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.className("signin-btn")).click();
		
		driver.switchTo().alert().accept();
		
		CaptureScreenshot.testresults(driver,"handleAlerts");
	
		
	}
	

	@Test(enabled=false)
	public void handleMouse() throws Exception
	{
		driver = new ChromeDriver();
		
		driver.get("https://www.intellectdesign.com/");
		
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
	//	act.click(driver.findElement(By.cssSelector("[aria-controls='offcanvasWithBothOptions']"))).perform();
		
		//act.doubleClick(driver.findElement(By.cssSelector("[aria-controls='offcanvasWithBothOptions']"))).perform();
		
		//act.contextClick(driver.findElement(By.cssSelector("[aria-controls='offcanvasWithBothOptions']"))).perform();
		
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Our Partners']"))).perform();
		
		//simple click
		//act.click(driver.findElement(By.xpath("//a[text()='Partner Ecosystem']"))).perform();
		
		
		//control+click
		
		act.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("//a[text()='Partner Ecosystem']"))).keyUp(Keys.CONTROL).perform();
		
		Set<String> windsID = driver.getWindowHandles();
		System.out.println(windsID);
		
		Iterator<String> itr = windsID.iterator();
		
		String win1 = itr.next();  //windows1
		
		String win2 = itr.next();   //Windows2
		
		
		driver.switchTo().window(win2);
		Thread.sleep(5000);
		
		driver.switchTo().window(win1);
		
		
		
		
		//Drag and Drop using Actions Class
		//WebElement point1 = driver.findElement(By.id(""));
		
		//WebElement point2 = driver.findElement(By.id(""));
		
		//act.dragAndDrop(point1, point2).perform();
		
				
	}
		
	
	@Test(enabled=false)
	public void handleKeyboard()
	{
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		
		Actions act = new Actions(driver);
		
		act.sendKeys("user1").perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
		
		act.sendKeys(Keys.PAGE_DOWN).perform();
		
		act.sendKeys("user2").perform();
		
		//act.sendKeys(Keys.TAB).perform();
		//act.sendKeys("pass1233").perform();
		//act.sendKeys(Keys.ENTER).perform();
		
		
		
		
		
		
	}
	
}
