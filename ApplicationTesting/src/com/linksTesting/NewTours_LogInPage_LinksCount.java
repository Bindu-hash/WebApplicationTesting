package com.linksTesting;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours_LogInPage_LinksCount {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="http://newtours.demoaut.com";
		
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		//<a href="mercurysignon.php?osCsid=7836cc2f6c57c5d559217a3df73fba9e">SIGN-ON</a>
	    //<a href="mercuryregister.php?osCsid=7836cc2f6c57c5d559217a3df73fba9e">REGISTER</a>
	    //<a href="mercuryunderconst.php?osCsid=7836cc2f6c57c5d559217a3df73fba9e">SUPPORT</a>
	
	    List<WebElement>links=driver.findElements(By.tagName("a"));
	  
	    int linksCount=links.size();
	    System.out.println("The number of links on the NewTours LogIn Page are: "+ linksCount);
	  
	    for(int i=0;i<linksCount;i++)
	    {
	    	String linkName=links.get(i).getText();
	    	
	    	System.out.println(i+" "+linkName);
	    }
	    
	     
	    
	    
	    driver.quit();
	
	}

}
