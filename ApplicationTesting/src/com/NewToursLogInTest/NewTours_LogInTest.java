package com.NewToursLogInTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTours_LogInTest {
	
	//Global Variable
	WebDriver driver = null;
	String url="http://newtours.demoaut.com";
	
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
    @Test
    public void logInTest()
    {
    	driver.findElement(By.name("userName")).sendKeys("tutorial");

		/*<input type="password" name="password" size="10">

		locator -  name
		selector - password */
		
		WebElement password=driver.findElement(By.name("password")); //identifying the element
		password.sendKeys("tutorial"); //performing operation on the element

		/*<input type="image" name="login" value="Login" src="/images/btn_signin.gif" width="58" height="17" alt="Sign-In" border="0">

		locator - name
		selector - login */
		
		WebElement signIn=driver.findElement(By.name("login"));
		signIn.click();
		
		String expected_HomePageTitle="Find";
		System.out.println("The HomePage title of NewTours Application is : "+expected_HomePageTitle);
		
		String actual_WebPageTitle=driver.getTitle();
		System.out.println("The title of the WebPage is : "+actual_WebPageTitle);
		
		if(actual_WebPageTitle.contains(expected_HomePageTitle))
		{
		   System.out.println("LogIn Successful - PASS");
		}
		else
		{	
			System.out.println("LogIn Failed - FAIL");
		}
    }
    
    @AfterTest
    public void tearDown()
    {
    	driver.quit();
    }
	
}
