package com.WebTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_DisplayingCityName_FirstRowOfFirstColumn extends BaseTest {

	public void CapturingData()
	{
		
		WebElement cityName_Element=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a"));
	    String cityName=cityName_Element.getText();
	    
	    System.out.println(cityName);
	    
	    driver.quit();
	    
	    
	}
	
	public static void main(String[] args) {
		
		/*
		WebDriver driver = null;
		String url = "http://www.timeanddate.com/worldclock/";
		
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		*/
		
		// /html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a

		WebTable_DisplayingCityName_FirstRowOfFirstColumn webTable=new WebTable_DisplayingCityName_FirstRowOfFirstColumn();
		webTable.setUp();  // Calling the User defined Method 
		
		webTable.CapturingData();	    
	
	}

}
