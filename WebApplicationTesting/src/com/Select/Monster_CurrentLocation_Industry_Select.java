package com.Select;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Monster_CurrentLocation_Industry_Select {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url = "https://my.monsterindia.com/sponsered_popup.html";
		
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		
		// Global Wait - Implicit wait 
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	    //Current Location Element Property - class="border_grey1"
		WebElement currentLocation=driver.findElement(By.className("border_grey1"));
		
		Select selection = new Select(currentLocation);
		selection.selectByIndex(2);
		selection.selectByValue("3");
		
		//industry Element property - id="id_industry"
		WebElement industry=driver.findElement(By.id("id_industry"));
		
		Select select =new Select(industry);
		select.selectByIndex(1);
		select.selectByValue("4");
		select.selectByVisibleText("Banking/Accounting/Financial Services");
		
		//select.deselectByIndex(2);
		//select.deselectByValue("65");
		//select.deselectByVisibleText("anking/Accounting/Financial Services");

		select.deselectAll();
		
		
		
	
	}

}
