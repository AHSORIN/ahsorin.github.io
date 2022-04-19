package com.trello.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.trello.TestBase.TestBase;

public class SigninPage extends TestBase{
	
	@FindBy(xpath="//input[@id='user']")
	WebElement emailId;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='login']")
	WebElement loginbtn;
	
	@FindBy(xpath="//button[@id='login-submit']")
	WebElement submit;
	
	public SigninPage() {
		PageFactory.initElements(driver, this);
	}
	
	public HomePage clickLoginIn() throws InterruptedException {
		
		emailId.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		loginbtn.click();
		Thread.sleep(2000);
		password.sendKeys(prop.getProperty("password"));
		submit.click();
		return new HomePage();
		
	}

}
