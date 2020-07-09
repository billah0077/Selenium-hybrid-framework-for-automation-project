package com.BankingBillah.TestCase;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.BankingBillah.PageObject.LinkedinStatusGenerator;

public class TC_LinkedinStatusTest_001 extends BaseClass
{
	@Test
	public void StatusGeneratorTest() throws InterruptedException
	{
		driver.get(LinkedinURL);
		logger.info("URL is opened");
		
		LinkedinStatusGenerator lsd = new LinkedinStatusGenerator(driver);
		lsd.setUserName(LinkedinUsername);
		logger.info("username is entered");
		lsd.setPassword(LinkedinPassword);
		logger.info("password is provided");
		lsd.clickSubmit();
		
		//Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		lsd.StartaPost();
		Thread.sleep(2000);
		logger.info("clicked on start a post");
		Thread.sleep(2000);
		lsd.WriteStatus("Hi. I am Billah. If you can read this post then my test case is passed successfully."
				+ " I used a Java-based maven project with Selenium, TestNG, Logger, Report etc. to run this "
				+ "test case as well as upload post on LinkedIn. #selenium #softwaretest");
		Thread.sleep(2000);
		lsd.PostStatus();
		Thread.sleep(5000);
	}
}
