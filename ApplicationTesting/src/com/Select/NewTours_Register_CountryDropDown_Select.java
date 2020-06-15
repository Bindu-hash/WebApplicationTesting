package com.Select;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewTours_Register_CountryDropDown_Select {

	public static void main(String[] args) {
		
		
		WebDriver driver = null;
		String url = "http://newtours.demoaut.com/";
		
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		
		// Global Wait - Implicit wait 
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	    WebElement register=driver.findElement(By.linkText("REGISTER"));
	    register.click();
	    
	    //Country DropDrown
	    WebElement countryDropDown=driver.findElement(By.name("country"));
	    
	    Select selection = new Select(countryDropDown);
	    // selection.selectByIndex(6);
	    //selection.selectByValue("8");
	    selection.selectByVisibleText("INDIA");
	    
	    
	    
	    
	    
	
	
	}

}
