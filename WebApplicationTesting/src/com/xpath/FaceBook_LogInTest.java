package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook_LogInTest {

	public static void main(String[] args) {
		
		
		WebDriver driver = null;
		String url = "http://facebook.com/";
		
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		
		//<input type="email" class="inputtext login_form_input_box" name="email" id="email" data-testid="royal_email">

		// - Search on the complete WebPage
		// * - Search for all the tags
		
		//WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		WebElement email=driver.findElement(By.xpath("//*[@id='email']"));
		email.sendKeys("srinu4lr@gmail.com");
		
		//<input type="password" class="inputtext login_form_input_box" name="pass" id="pass" data-testid="royal_pass">
		WebElement password=driver.findElement(By.xpath("//*[@class='inputtext login_form_input_box' and @data-testid='royal_pass']"));
	    password.sendKeys("testing");
	
	    //<input value="Log In" aria-label="Log In" data-testid="royal_login_button" type="submit" id="u_0_b">
	    //WebElement logIn=driver.findElement(By.xpath("//*[@data-testid='royal_login_button']"));
	    WebElement logIn=driver.findElement(By.xpath("//*[@id='u_0_b']"));
	    logIn.click();
	    
	}

}
