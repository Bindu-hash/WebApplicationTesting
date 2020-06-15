package com.OrgangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMApplication_Validating_HomePage {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url = "http://opensource-demo.orangehrmlive.com/";
		
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		
		//driver.wait(100000);
		
		//<input name="txtUsername" id="txtUsername" type="text">
		
		WebElement username=driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		
			
		//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");
		
		
		//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		
		WebElement login=driver.findElement(By.id("btnLogin"));
		login.click();
		
				
		//Validating the OrangeHRM Application Home Page - Expected Text - "Admin"
		String expected_HomePageText="Admin";
		System.out.println("The expected text in HomePage of OrangeHRM Application is : " + expected_HomePageText);
						
		//<a href="/index.php/admin/viewAdminModule" id="menu_admin_viewAdminModule" class="firstLevelMenu"><b>Admin</b></a>
		WebElement Text=driver.findElement(By.id("menu_admin_viewAdminModule"));
		String actual_HomePageText = Text.getText();
						
										
		System.out.println("The actual text of the HomePage is : " + actual_HomePageText);
						
		if(actual_HomePageText.contains(expected_HomePageText))
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


