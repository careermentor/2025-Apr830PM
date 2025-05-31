package org.wipro.automation.saucedemo.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.wipro.automation.saucedemo.baseClass.InitaiteBrowser;
import org.wipro.automation.saucedemo.datagenerator.TestDataGenerator;
import org.wipro.automation.saucedemo.pages.LoginPage;

public class LoginScenario_DDF extends InitaiteBrowser
{
	

	@Test(dataProvider="ddf1",dataProviderClass=TestDataGenerator.class)
	public void tc01_validate_valid_login_func(String username, String password) throws Exception
	{
		LoginPage login = new LoginPage(driver);
		
		login.enter_username(username);
		login.enter_password(password);
		login.click_loginbtnn();
	}
	
	
	
	
}
