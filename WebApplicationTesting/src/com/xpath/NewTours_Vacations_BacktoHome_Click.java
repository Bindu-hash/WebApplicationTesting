package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours_Vacations_BacktoHome_Click {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url = "http://newtours.demoaut.com/";
		
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		
		//<a href="mercuryunderconst.php?osCsid=4fa1fef7d4871726577a51ebde5cbdf9">Vacations</a>		
		WebElement vacations=driver.findElement(By.linkText("Vacations"));
		vacations.click();
		
		/*
		 <img src="/images/forms/home.gif" width="118" height="23" border="0">
		 
		 Xpath :
		 1. Relative - //
		 2.Absolute - html tag
		 
		 Syntax:
		 locator - Xpath
		 Selector - expression of the Xpath created based on the available properties
		 
		 //tagName[@attribute='value'] - considering Single property
		  
		   //img[@src='/images/forms/home.gif'] - Selector
		  		 
		  Copy Xpath - Automatically creates Xpath for an element
		  /html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img
		 
		 
		 */
		 
		//WebElement backToHome=driver.findElement(By.xpath("//img[@src='/images/forms/home.gif']"));
		//backToHome.click();
		
		WebElement backToHome=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img"));
		backToHome.click();
		
		
		
	}

}
