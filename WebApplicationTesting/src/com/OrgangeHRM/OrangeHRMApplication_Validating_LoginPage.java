package com.OrgangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMApplication_Validating_LoginPage {

	public static void main(String[] args) {
		
		 WebDriver driver = null;
		 String url="http://opensource-demo.orangehrmlive.com/";
		  
		 System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		 driver = new ChromeDriver();
		 
		 driver.get(url);
		 driver.manage().window().maximize();
		  
		//Validating the OrangeHRM Application Login Page - Expected Text - "LOGIN Panel"
		String expected_LoginPageText="LOGIN Panel";
		System.out.println("The expected text in LoginPage of OrangeHRM Application is : " + expected_LoginPageText);
		
		//<div id="logInPanelHeading">LOGIN Panel</div>
		WebElement Text=driver.findElement(By.id("logInPanelHeading"));
		String actual_WebPageText = Text.getText();
		
						
		System.out.println("The actual text of the WebPage is : " + actual_WebPageText);
		
		if(actual_WebPageText.contains(expected_LoginPageText))
		{
		   System.out.println("Expected Text is found - PASS");
		}
		else
		{	
			System.out.println("Expected Text not found - FAIL");
		}
		
		driver.quit();


	}

}
