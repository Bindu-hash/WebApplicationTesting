package com.ValidatingTitle;

import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingTitle_SeleniumHQ_HomePage {

	public static void main(String[] args) {
		
		String url ="http://seleniumhq.org";
		
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get(url);
		
		String expected_SeleniumHQHomePageTitle="SeleniumHQ Browser Automation";
		System.out.println("The expected title of SeleniumHQ Application HomePage Title is : "+expected_SeleniumHQHomePageTitle);
		
		String actual_TitleSeleniumWebSiteHomePage=driver.getTitle();
		
		//print the variable information as an output
		System.out.println("The actual title of the Selenium HomePage is : " + actual_TitleSeleniumWebSiteHomePage);
		
		if(actual_TitleSeleniumWebSiteHomePage.equals(expected_SeleniumHQHomePageTitle))
		{
			System.out.println("Title Matched - PASS");
		}	
		else
			System.out.println("Title not Matched - FAIL");
		
			driver.quit();
		
	}
	}


