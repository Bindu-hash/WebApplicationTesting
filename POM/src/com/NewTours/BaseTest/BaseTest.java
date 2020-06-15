package com.NewTours.BaseTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	
	public static Properties prop; // Global variable
	public static WebDriver driver;
	public static FileInputStream file;
	
	public BaseTest()

	{
		
		try
		{
			file = new FileInputStream("./src/com/Config/config.properties");
		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		prop = new Properties();
		try
		{
			prop.load(file);
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	
		
	public void intilization()
	{
		String browserName=prop.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
			driver = new ChromeDriver();					
		}
		else
			if(browserName.equals("firefox"))
		{
				System.setProperty("webdriver.gecko.driver", "./DriverFiles/geckodriver.exe");  	
				driver = new FirefoxDriver();   
		}
		
		 String applicationURLAddress=prop.getProperty("url");
		 
		 driver.get(applicationURLAddress);
		 
		
		
	}
	

}
