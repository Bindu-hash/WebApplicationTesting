package com.Google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Images_Click {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="http://google.com";
		
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();
		//<a class="gb_g" data-pid="2" href="https://www.google.co.in/imghp?hl=en&amp;tab=wi&amp;ogbl" target="_top">Images</a>
	
		// a - anchor tag
		// attribute - href 
		//link
	
	    WebElement images=driver.findElement(By.linkText("Images"));
	    images.click();
	    
	    System.out.println(driver.getTitle());
	    
	
	}

}
