package com.MouseOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_HelloSignIn_MouseHover {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="http://amazon.com";
		
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		//id="nav-link-accountList" -property of Hello SignIn Element
		
		WebElement hellosignIn=driver.findElement(By.id("nav-link-accountList"));
		
		//Actions class - is used to work with Mouse Operations and Keyboard related Key Operations
				
		//Actions action = new Actions(driver);
		//action.moveToElement(hellosignIn).perform();
		
		//Automating "Your Orders" element
		//<a id="nav_prefetch_yourorders" href="/gp/css/order-history?ref_=nav_AccountFlyout_orders" class="nav-link nav-item"><span class="nav-text">Your Orders</span></a>		
		
		WebElement yourOrders=driver.findElement(By.linkText("Your Orders"));
		yourOrders.click();
		
		

	}

}
