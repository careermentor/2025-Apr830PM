package org.wipro.automation.saucedemo.testcases;

import org.testng.annotations.Test;
import org.wipro.automation.saucedemo.baseClass.InitaiteBrowser;
import org.wipro.automation.saucedemo.pages.LoginPage;

public class SignupScenario extends InitaiteBrowser
{
	

	@Test
	public void tc01_validate_valid_login_func() throws Exception
	{
		LoginPage login = new LoginPage(driver);
		
		login.enter_username("standard_user");
		login.enter_password("secret_sauce");
		login.click_loginbtnn();
	}
	
}
