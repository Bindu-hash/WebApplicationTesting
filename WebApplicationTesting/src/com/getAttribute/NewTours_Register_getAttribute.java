package com.getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours_Register_getAttribute {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url = "http://newtours.demoaut.com";
		
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		
		//<a href="mercuryregister.php">REGISTER</a>
		
		WebElement register=driver.findElement(By.linkText("REGISTER"));
		
		String register_urlAddress=register.getAttribute("href");
		System.out.println("register Element URL address is : "+register_urlAddress);

		register.click();
		
		String actual_RegisterWebPageURLAddress=driver.getCurrentUrl();
		System.out.println("The actual url address of the webPage is : "+actual_RegisterWebPageURLAddress);
		
		if(actual_RegisterWebPageURLAddress.equals(register_urlAddress))
		{
			System.out.println("Successfully navigated to Register WebPage - PASS");
		}
		else
		{
			System.out.println("Failed to navigae to Register WebPage -FAIL");
		}	
			
				
		driver.quit();
	}

}
