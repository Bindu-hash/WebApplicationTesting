package com.BaseTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.Utility.Log;

public class BaseTest {
	
	public static WebDriver driver;
	public static String applicationUrl = "http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login"; 

	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");
	    driver = new FirefoxDriver();
	    
	    Log.info(" Successfully Launched Firefox Browser");
	    
	    driver.get(applicationUrl);
	    
	    Log.info(" Successfully Navigated to OHRM LogIn Page ");
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
		
		Log.info(" Successfully Closed the Application ");
		
	}
}
