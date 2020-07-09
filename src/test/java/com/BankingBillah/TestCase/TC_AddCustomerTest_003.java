package com.BankingBillah.TestCase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.BankingBillah.PageObject.AddCustomerPage;
import com.BankingBillah.PageObject.LoginPage;

public class TC_AddCustomerTest_003 extends BaseClass
{
	@Test
	public void addNewCustomer() throws InterruptedException, IOException
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User Name is provided");
		lp.setPassword(password);
		logger.info("Password is provided");
		lp.clickSubmit();
		
		Thread.sleep(5000);
		
		AddCustomerPage addcust = new AddCustomerPage(driver);
		addcust.AddNewCustomer();
		addcust.CustName("Billah");
		addcust.CustGender();
		addcust.DateofBirth("11", "23", "1996");
		addcust.CustAddress("Motijheel");
		addcust.CustCity("Dhaka");
		addcust.CustState("Dhaka City");
		addcust.CustPin(123456);
		addcust.CustTelephone("016379834432");
		
		String email = randomString()+"@gmail.com";
		addcust.CustEmail(email);
		addcust.CustPassword("abc12345");
		addcust.Submit();
		
		Thread.sleep(3000);
		logger.info("Validation started...");
		
		boolean res = driver.getPageSource().contains("Customer Registered Successfully!!!");
	    
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("Test case pased");
		}
		else
		{
			captureScreen(driver, "addNewCustomer");
			Assert.assertTrue(false);
		}
	}
	
	
}
