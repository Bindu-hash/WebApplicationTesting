package com.NewTours.TestCase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.NewTours.BaseTest.BaseTest;
import com.NewTours.Pages.LogInPage;

public class LogInPageTest extends BaseTest
{
	LogInPage logInPage;
	
	LogInPageTest()
   {
	   super(); // this method should be written which is a super method and called as super constructor
	   // Super Constructor or Super Method is used to access the Constructor into another class
       // Otherwise will not be able to access from the other class into current class
	   
	}
   
    @BeforeMethod
    public void setUp()
    {
    	intilization();
    	
    	logInPage = new LogInPage();
    }
    
    @AfterMethod
    public void tearDown()
    {
    	driver.quit();
    }
	
	@Test(priority=1)
	public void signOnTest()
	{
		logInPage.SignOn();
		System.out.println("The title of the SignOn WebPage is : "+driver.getTitle());
	}
	
	@Test(priority=2)
	public void registerTest()
	{
		logInPage.Register();
		System.out.println("The title of the Register WebPage is : "+driver.getTitle());
	}
	
	@Test(priority=3)
	public void logInTest()
	{
		System.out.println("The UserName is : "+prop.getProperty("userName"));
		System.out.println("The Password is : "+prop.getProperty("password"));
		logInPage.logIn(prop.getProperty("userName"), prop.getProperty("password"));
		
	    System.out.println("The title of the Home Page is : "+driver.getTitle());
	}
}
