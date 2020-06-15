package com.linksTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class NewTours_SignOn_Click {
	
			public static void main(String[] args) {
			
			WebDriver driver = null;
			String url="http://newtours.demoaut.com";
			
			System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
			driver = new ChromeDriver();
			
			driver.get(url);
			
			driver.manage().window().maximize();
			
			// <a href="mercurysignon.php?osCsid=d01267192b135305b0982efdfca03a1f">SIGN-ON</a>
			/*
			 a - anchor Tag
			 href - attribute
			 Type of Element - link
			 
			  locator - linkText
			  Selector - SIGN-ON
			  
			 */
			WebElement SignOn=driver.findElement(By.linkText("SIGN-ON"));
			SignOn.click();
			
			System.out.println(driver.getTitle());
			
			
			}
}
