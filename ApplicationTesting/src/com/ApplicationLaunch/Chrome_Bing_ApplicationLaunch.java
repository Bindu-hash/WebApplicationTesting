package com.ApplicationLaunch;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Bing_ApplicationLaunch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//navigating to Bing Application
		driver.get("http://bing.com");
		
	    driver.navigate().to("http://google.com");
		
		//driver.close();
	    driver.quit();

	}

}
