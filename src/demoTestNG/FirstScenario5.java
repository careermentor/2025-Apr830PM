package demoTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstScenario5 
{

	@Test(groups="Regression")
	public void first_testcase()
	{
		System.out.println("first_testcase");
		
	}
	
	
	@Test
	public void second_testcase()
	{
		System.out.println("second_testcase");
		Assert.assertEquals("Hello", "Hello1");
	}
	
	@Test(groups="Sanity")
	public void third_testcase()
	{
		System.out.println("third_testcase");
	}
	
	@Test
	public void forth_testcase()
	{
		System.out.println("forth_testcase");
	}
	
	
	@Test(groups="Regression")
	public void fifth_testcase()
	{
		System.out.println("fifth_testcase");
	}
	
	@Test
	public void sixth_testcase()
	{
		System.out.println("sixth_testcase");
	}
}
