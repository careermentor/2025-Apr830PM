package org.xyz.automation.proj;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshot
{


	public static void testresults(WebDriver driver, String Name) throws Exception
	{
		TakesScreenshot ts = (TakesScreenshot) driver;  //launch the new browdswe
		
		File f = ts.getScreenshotAs(OutputType.FILE);
		
		File fd = new File("./Screenshots/" + Name + ".png");
		
		
		
		FileUtils.copyFile(f, fd);
		
	}
	
}
