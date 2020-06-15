package com.ValidatingURLAddress;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingURLAddress_FacebookLoginPage {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="http://facebook.com";
		
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(url);
		
		String expected_FacebookLogInPageURL="facebook.com";
		System.out.println("The expected LogIn Page Url address is: " +expected_FacebookLogInPageURL);
		
		String actual_FacebookLogInPageURL=driver.getCurrentUrl();
		System.out.println("The actual LogIn Page Current Url address is: " +actual_FacebookLogInPageURL);
		
		if(actual_FacebookLogInPageURL.contains(expected_FacebookLogInPageURL))
		{
			System.out.println("URL existing - PASS");
		}
		else
		{	
			System.out.println("Url address not found - FAIL");
		}	
	}

}
