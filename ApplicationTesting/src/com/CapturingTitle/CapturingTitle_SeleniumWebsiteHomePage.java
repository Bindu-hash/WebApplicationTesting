package com.CapturingTitle;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingTitle_SeleniumWebsiteHomePage {
	
	public static void main(String[] args) {
		
		String url="http://seleniumhq.org";
		
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        
        driver.get(url);
        
       String actual_titleSeleniumWebSiteHomePage=driver.getTitle();
       
       System.out.println("The title of the Selenium HomePage is  :" + actual_titleSeleniumWebSiteHomePage);
       
	   driver.quit();
	}
	

}
