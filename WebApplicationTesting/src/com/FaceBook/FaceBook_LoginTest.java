package com.FaceBook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook_LoginTest {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="http://facebook.com";
		
		System.setProperty("webdriver.driver.chromedriver","./DriverFiles/chromdriver.exe");
		driver =new ChromeDriver();
		
		driver.get(url);
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		/*
		 <input type="email" class="inputtext login_form_input_box" name="email" id="email" data-testid="royal_email">
		 
		Locator - id
		Selector - email
		
		*/
		
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("himaqa12@gmail.com");
		
		/*
		 <input type="password" class="inputtext login_form_input_box" name="pass" id="pass" data-testid="royal_pass">
		 
		 Locator - id
		 Selector - pass
		 
		 */
		
		WebElement password=driver.findElement(By.id("pass"));
		email.sendKeys("tutorial");
		
		//<label class="login_form_login_button uiButton uiButtonConfirm" id="loginbutton" for="u_0_b"><input value="Log In" aria-label="Log In" data-testid="royal_login_button" type="submit" id="u_0_b"></label><input value="Log In" aria-label="Log In" data-testid="royal_login_button" type="submit" id="u_0_b">
		//WebElement LogIn=driver.findElement(By.className(""login_form_login_button uiButton uiButtonConfirm"loginbutton"));
		//logIn.click();
		
		
		WebElement logIn=driver.findElement(By.id("loginbutton"));
		logIn.click();
		
	}

}
