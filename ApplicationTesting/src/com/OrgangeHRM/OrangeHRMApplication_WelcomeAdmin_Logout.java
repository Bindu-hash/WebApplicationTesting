package com.OrgangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMApplication_WelcomeAdmin_Logout {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = null;
		String url = "http://opensource-demo.orangehrmlive.com/";
		
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		
		// Global Wait - Implicit wait 
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//<input name="txtUsername" id="txtUsername" type="text">
		
		WebElement username=driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		
			
		//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");
		
		
		//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		
		WebElement login=driver.findElement(By.id("btnLogin"));
		login.click();
		
		//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
		
		WebElement welcomeAdmin=driver.findElement(By.id("welcome"));
		welcomeAdmin.click();
		
		//sychronization
		//Thread.sleep(10000); //Explicit Wait
				
		
		//<a href="/index.php/auth/logout">Logout</a>
		WebElement logout=driver.findElement(By.linkText("Logout"));
		logout.click();
		

	}

}
