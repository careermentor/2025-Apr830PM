package org.wipro.automation.saucedemo.datagenerator;

import org.testng.annotations.DataProvider;

public class TestDataGenerator 
{

	@DataProvider(name="ddf1")
	public Object[][] testdata1()
	{
		//String data1 = "standard_user";
		
		//Object[] data2 = {"standard_user", "secret_sauce"};  //1-D Array
		
		Object[][] data3 = {{"standard_user", "secret_sauce"},{"locked_out_user", "secret_sauce"},{"problem_user", "secret_sauce"}};  //1-D Array
		
		return data3;
		
	}
	
	@DataProvider(name="ddf2")
	public Object[][] testdata2()
	{
		//String data1 = "standard_user";
		
		//Object[] data2 = {"standard_user", "secret_sauce"};  //1-D Array
		
		Object[][] data3 = {{"standard_user", "secret_sauce"},{"locked_out_user", "secret_sauce"},{"problem_user", "secret_sauce"}};  //1-D Array
		
		return data3;
		
	}
	
}
