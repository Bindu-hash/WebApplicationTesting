package com.DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours_Register_CountryDropDown {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url = "http://newtours.demoaut.com/";
		
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		
		// Global Wait - Implicit wait 
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//<a href="mercuryregister.php?osCsid=23141f08290ceb1ef8051defc2aa9999">REGISTER</a>
		WebElement register=driver.findElement(By.linkText("REGISTER"));
		register.click();
		
		//name="country"
		//Country DropDown
		WebElement countryDropDown=driver.findElement(By.name("country"));
		
		List<WebElement>countries=driver.findElements(By.tagName("option"));
		
		int countriesCount=countries.size();
		
		System.out.println("The number of Countries in CountryDropDown are:" + countriesCount);
		
		for(int i=0;i<countriesCount;i++)
		{
				String countryName=countries.get(i).getText();
		        System.out.println(i+" "+countryName);
		}
		
		driver.quit();
		

	}

}
