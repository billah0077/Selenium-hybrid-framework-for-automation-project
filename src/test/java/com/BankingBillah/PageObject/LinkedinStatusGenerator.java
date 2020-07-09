package com.BankingBillah.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LinkedinStatusGenerator {
	WebDriver Idriver;
	
	public LinkedinStatusGenerator(WebDriver rdriver)
	{
		Idriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.ID, using = "username")
	@CacheLookup
	WebElement textUserName;
	
	@FindBy(how = How.ID, using = "password")
	@CacheLookup
	WebElement textPassword;
	
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/main[1]/div[2]/form[1]/div[3]/button[1]")
	@CacheLookup
	WebElement btnSubmit;
	
	@FindBy(how = How.XPATH, using = "//button[text()='Start a post']")
	@CacheLookup
	WebElement btnStartaPost;
	
	@FindBy(how = How.CSS, using = "body.render-mode-BIGPIPE.nav-v2.theme.theme--classic.ember-application.boot-complete.icons-loaded.artdeco-modal-is-open:nth-child(2) div.artdeco-modal-overlay.artdeco-modal-overlay--layer-default.artdeco-modal-overlay--is-top-layer.ember-view div.artdeco-modal.artdeco-modal--layer-default.share-box-v2__modal div.artdeco-modal__content.share-box-v2__modal-content.ember-view:nth-child(4) div.share-box div.share-box-v2__creation--in-modal-with-drawer div.share-box__content-v2--scrollable div.share-box-v2__text-editor-container div.share-box-v2__text-editor.ember-view div.ember-view div.editor-container.ember-view div.editor-content.ql-container div.ql-editor.ql-blank > p:nth-child(1)")
	@CacheLookup
	WebElement txtWriteStatus;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Post']")
	@CacheLookup
	WebElement btnPostStatus;
	
	public void setUserName(String uname)
	{
		textUserName.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		textPassword.sendKeys(pwd);
	}
	
	public void clickSubmit()
	{
		btnSubmit.click();
	}
	
	public void StartaPost()
	{
		btnStartaPost.click();
	}
	
	public void WriteStatus(String status)
	{
		txtWriteStatus.sendKeys(status);
	}
	
	public void PostStatus()
	{
		btnPostStatus.click();
	}
}
