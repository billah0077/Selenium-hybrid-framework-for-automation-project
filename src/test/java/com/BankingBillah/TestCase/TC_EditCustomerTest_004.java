package com.BankingBillah.TestCase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.BankingBillah.PageObject.EditCustomerPage;
import com.BankingBillah.PageObject.LoginPage;

public class TC_EditCustomerTest_004 extends BaseClass
{
	@Test
	public void editCustomer() throws InterruptedException, IOException
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User Name is Provided");
		lp.setPassword(password);
		logger.info("Password is provided");
		lp.clickSubmit();
		logger.info("Submitted");
		Thread.sleep(5000);
		
		EditCustomerPage editCust = new EditCustomerPage(driver);
		editCust.EditCustomer();
		editCust.CustomerID(37605);
		logger.info("Customer ID is provided");
		editCust.EditSubmit();
		logger.info("Submitted");
		Thread.sleep(5000);
		
		editCust.CustomerAddress("Arambag");
		logger.info("Address Edited");
		editCust.CustomerState("Dhaka");
		editCust.CustomerPinno(3201);
		editCust.CustomerTelephoneno(0167167);
		
		String email = randomString()+"gmail.com";
		editCust.CustomerEmail(email);
		editCust.CustomerSubmit();
		
		Thread.sleep(3000);
		logger.info("Validation started...");
		
		boolean res = driver.getPageSource().contains("Customer details updated Successfully!!!");
	    
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("Test case pased");
		}
		else
		{
			captureScreen(driver, "editNewCustomer");
			Assert.assertTrue(false);
		}
		
		
	}
}
