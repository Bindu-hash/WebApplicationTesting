package com.NewTours.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NewTours.BaseTest.BaseTest;

public class LogInPage extends BaseTest
{
	
	public LogInPage()  // Constructor
	{
	   PageFactory.initElements(driver, this);
	   
	}
		
		
	// 1. Identification of the elements in the WebPage
	   
	// <a href="mercurysignon.php?osCsid=9ae4b8d602f64d5c5ff9581ce18af74b">SIGN-ON</a>
	@FindBy(linkText="SIGN-ON")
	WebElement signOn;
		
	   
	// 2. Creating methods to perform operations on the elements
	
	
	public void SignOn()
	{
		signOn.click();
	}
	
	// Object Repository class (Object means element)
	
	// <a href="mercuryregister.php">REGISTER</a>
	@FindBy(linkText="REGISTER")
	WebElement register;
	
	
	public void Register()
	{
		register.click();
	}
	
	@FindBy(name="userName")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="login")
	WebElement signIn;
	
	public void logIn(String UserName, String Password)
	{
		userName.sendKeys(UserName);
		password.sendKeys(Password);
		signIn.click();
	}
	
	
	  
	}
	

	


