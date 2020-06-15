package com.Google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_SignIn_Click {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="http://google.com";
		
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		//<a class="gb_je gb_4 gb_3c" id="gb_70" href="https://accounts.google.com/ServiceLogin?hl=en&amp;passive=true&amp;continue=https://www.google.com/" target="_top">Sign in</a>

	  // WebElement signIn=driver.findElement(By.id("gb_70"));
	   //signIn.click(); 
		
		WebElement signIn=driver.findElement(By.linkText("Sign in"));
		signIn.click();
	
	}

}
