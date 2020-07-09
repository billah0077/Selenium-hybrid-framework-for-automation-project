package com.BankingBillah.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	WebDriver Idriver;
	public AddCustomerPage(WebDriver rdriver)
	{
		Idriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.LINK_TEXT, using = "New Customer")
	@CacheLookup
	WebElement lnkAddCustomer;
	
	@FindBy(how = How.NAME, using = "name")
	@CacheLookup
	WebElement txtCustomerName;
	
	@FindBy(how = How.NAME, using = "rad1")
	@CacheLookup
	WebElement rdGender;
	
	@FindBy(how = How.ID, using = "dob")
	@CacheLookup
	WebElement txtdob;
	
	@FindBy(how = How.NAME, using = "addr")
	@CacheLookup
	WebElement txtAddress;
	
	@FindBy(how = How.NAME, using = "city")
	@CacheLookup
	WebElement txtCity;
	
	@FindBy(how = How.NAME, using = "state")
	@CacheLookup
	WebElement txtState;
	
	@FindBy(how = How.NAME, using = "pinno")
	@CacheLookup
	WebElement txtPin;
	
	@FindBy(how = How.NAME, using = "telephoneno")
	@CacheLookup
	WebElement txtPhone;
	
	@FindBy(how = How.NAME, using = "emailid")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(how = How.NAME, using = "password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(how = How.NAME, using = "sub")
	@CacheLookup
	WebElement btnSubmit;
	
	public void AddNewCustomer()
	{
		lnkAddCustomer.click();
	}
	
	public void CustName(String cname)
	{
		txtCustomerName.sendKeys(cname);
	}
	
	public void CustGender()
	{
		rdGender.click();
	}
	
	public void DateofBirth(String mm, String dd, String yyyy)
	{
		txtdob.sendKeys(mm);
		txtdob.sendKeys(dd);
		txtdob.sendKeys(yyyy);
	}
	
	public void CustAddress(String caddress)
	{
		txtAddress.sendKeys(caddress);
	}
	
	public void CustCity(String city)
	{
		txtCity.sendKeys(city);;
	}
	
	public void CustState(String state)
	{
		txtState.sendKeys(state);
	}
	
	public void CustPin(int pinno)
	{
		txtPin.sendKeys(String.valueOf(pinno));
	}
	
	public void CustTelephone(String ctelephone)
	{
		txtPhone.sendKeys(ctelephone);
	}
	
	public void CustEmail(String cemail)
	{
		txtEmail.sendKeys(cemail);
	}
	
	public void CustPassword(String cpass)
	{
		txtPassword.sendKeys(cpass);
	}
	
	public void Submit()
	{
		btnSubmit.click();
	}
}
