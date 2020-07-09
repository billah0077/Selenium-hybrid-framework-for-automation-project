package com.BankingBillah.TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.BankingBillah.PageObject.LoginPage;


public class TC_LoginTest_001 extends BaseClass
{
	@Test
	public void loginTest()
	{
		driver.get(baseURL);
		logger.info("URL is opened");
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Username is given");
		lp.setPassword(password);
		logger.info("Password is given");
		lp.clickSubmit();
		logger.info("Clicked");
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Testcase is passed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Testcase is failed");
		}
	}
}
