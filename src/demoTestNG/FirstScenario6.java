package demoTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstScenario6 
{

	@Test
	public void first_testcase()
	{
		System.out.println("first_testcase");
		Assert.assertEquals("Hello","HelloWorld");
	}
	
	
	@Test
	public void second_testcase()
	{
		System.out.println("second_testcase");
	}
	
	@Test
	public void third_testcase()
	{
		System.out.println("third_testcase");
		Assert.assertEquals(false, true);
	}
	
	@Test(dependsOnMethods="third_testcase")
	public void forth_testcase()
	{
		System.out.println("forth_testcase");
	}
	
	
	@Test
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
