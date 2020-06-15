package com.BrowserLaunch;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeBrowserLaunch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\Bindu Reddy\\Desktop\\SeleniumTesting\\WebApplicationTesting\\DriverFiles\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        
        System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
        FirefoxDriver driver1 = new FirefoxDriver();
        
	}

}
