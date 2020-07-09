package com.BankingBillah.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EditCustomerPage {
	WebDriver Idriver;
	public EditCustomerPage(WebDriver rdriver)
	{
		Idriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.LINK_TEXT, using = "Edit Customer")
	@CacheLookup
	WebElement linkEditCustomer;
	
	@FindBy(how = How.NAME, using = "cusid")
	@CacheLookup
	WebElement txtCustomerID;
	
	@FindBy(how = How.NAME, using = "AccSubmit")
	@CacheLookup
	WebElement btnAccSubmit;
	
	@FindBy(how = How.NAME, using = "addr")
	@CacheLookup
	WebElement txtCustomerAddress;
	
	@FindBy(how = How.NAME, using = "state")
	@CacheLookup
	WebElement txtState;
	
	@FindBy(how = How.NAME, using = "pinno")
	@CacheLookup
	WebElement txtPinno;
	
	@FindBy(how = How.NAME, using = "telephoneno")
	@CacheLookup
	WebElement txtTelephoneno;
	
	@FindBy(how = How.NAME, using = "emailid")
	@CacheLookup
	WebElement txtEmailid;
	
	@FindBy(how = How.NAME, using = "sub")
	@CacheLookup
	WebElement btnSubmit;
	
	public void EditCustomer()
	{
		linkEditCustomer.click();
	}
	
	public void CustomerID(int cid)
	{
		txtCustomerID.sendKeys(String.valueOf(cid));
	}
	
	public void EditSubmit()
	{
		btnAccSubmit.click();
	}
	
	public void CustomerAddress(String caddress)
	{
		txtCustomerAddress.sendKeys(caddress);
	}
	
	public void CustomerState(String cstate)
	{
		txtState.sendKeys(cstate);
	}
	
	public void CustomerPinno(int pinno)
	{
		txtPinno.sendKeys(String.valueOf(pinno));
	}
	
	public void CustomerTelephoneno(int teleno)
	{
		txtTelephoneno.sendKeys(String.valueOf(teleno));
	}
	
	public void CustomerEmail(String cemail)
	{
		txtEmailid.sendKeys(cemail);
	}
	
	public void CustomerSubmit()
	{
		btnSubmit.click();
	}
}
