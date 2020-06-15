package com.OrgangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMApplication_Navigate_LoginPage {

	public static void main(String[] args) {
		
	  WebDriver driver = null;
	  String url="http://opensource-demo.orangehrmlive.com/";
	  
	  System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
	  driver = new ChromeDriver();
	  
	  //Navigate to OrangeHRM Application Login Page
	  //driver.get(url);
	  driver.navigate().to(url);
	  
	  driver.manage().window().maximize();
	 	      
	
	}

}
