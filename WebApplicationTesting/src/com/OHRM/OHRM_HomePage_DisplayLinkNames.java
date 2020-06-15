package com.OHRM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OHRM_HomePage_DisplayLinkNames {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = null;
		String url = "http://opensource-demo.orangehrmlive.com/";
		
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		
		// Global Wait - Implicit wait 
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebElement userName=driver.findElement(By.id("txtUsername"));
		userName.sendKeys("admin");
		
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");
		
		WebElement logInButton=driver.findElement(By.id("btnLogin"));
		logInButton.click();
		
		List<WebElement>homePageLinks=driver.findElements(By.tagName("a"));
		
		System.out.println("The number of links on the OHRM Application HomePage are:" + homePageLinks.size());
		
		for(int i=0;i<homePageLinks.size();i++)
		{	
		 
		  if(homePageLinks.get(i).isDisplayed())	
		  {  
			
		     String homePageLinkName=homePageLinks.get(i).getText();
		     System.out.println(homePageLinkName);
		 
		  }
		}
		
		WebElement welcomeAdmin=driver.findElement(By.id("welcome"));
		welcomeAdmin.click();
		
		//Thread.sleep(10000); //Explicit wait
		
		WebElement logout=driver.findElement(By.linkText("Logout"));
        logout.click(); 
		
		
		driver.quit();
	}

}
