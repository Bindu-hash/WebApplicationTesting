package com.OHRM;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.BaseTest.BaseTest;
import com.Utility.Log;

import junit.framework.Assert;

public class OHRM_AddEmployee extends BaseTest {

	@Test(priority=1)
	public void logIn()
	{
		WebElement userName=driver.findElement(By.id("txtUsername"));
		userName.sendKeys("Admin");
		
		Log.info(" Sccessfully entered UserName ");
		
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.sendKeys("Num4er$12");
		
		Log.info(" Sccessfully entered Password ");
		
		WebElement logInButton=driver.findElement(By.id("btnLogin"));
	    logInButton.click();
	    
	    Log.info(" Successfully clicked on LogIn button");
	   	    
	    String expected_UserName ="Admin";
		// System.out.println(" The expected UserName is : "+expected_UserName);
	    Log.info(" The expected UserName is : "+expected_UserName);
	    
		String actual_UserName=driver.findElement(By.id("welcome")).getText();
		// System.out.println(" The actual UserName is : "+actual_UserName);
		Log.info(" The actual UserName is : "+actual_UserName);
		
		/*
		if(actual_UserName.contains(expected_UserName))
		{
			System.out.println(" Successfully reached HomePage - PASS");
		}
		else
		{
			System.out.println(" LogIn Failed - FAIL ");
		}
		*/
		
		Assert.assertEquals(actual_UserName, expected_UserName, "Failed to LogIn");
	
	    Log.info(" Successfully logged into the application ");
	}
	
	
		@Test(priority=2)
		public void pim()
		{
			WebElement pim=driver.findElement(By.id("menu_pim_viewPimModule"));
			
			Actions action = new Actions(driver);
			action.moveToElement(pim).perform();
			
		    Log.info(" Navigated to PIM ");
		}
	
		@Test(priority=3)
		public void addEmployee() throws IOException, InterruptedException
		{
			
			WebElement addEmployee=driver.findElement(By.id("menu_pim_addEmployee"));
			addEmployee.click();
			
			Log.info(" Successfully performed Operation on AddEmployee ");
			
			WebElement firstName=driver.findElement(By.id("firstName"));
			firstName.sendKeys("Sruti");
			
			Log.info(" Successfully entered FirstName");
			
			WebElement middleName=driver.findElement(By.id("middleName"));
			middleName.sendKeys("Hello");
			
			Log.info(" Successfully entered MiddleName");
			
			WebElement lastName=driver.findElement(By.id("lastName"));
			lastName.sendKeys("hiii");
			
			Log.info(" Successfully entered LastName");
			
            
            Actions action = new Actions(driver);
            action.sendKeys(Keys.TAB).perform();
            action.sendKeys(Keys.TAB).perform();
            
            action.sendKeys(Keys.ENTER).perform();
			
            //Thread.sleep(10000);
            
            // WebElement browse=driver.findElement(By.id("photofile"));
            //WebElement browse=driver.findElement(By.xpath("//*[@id='photofile' and @class='duplexBox']"));
                
            //browse.click();
            
            Thread.sleep(10000);
            
           java.lang.Runtime.getRuntime().exec("./DriverFiles/Photograph.exe");
           
           Log.info(" Successfully Uploaded the Photograph ");
           
            Thread.sleep(10000);
            
            WebElement employeeId=driver.findElement(By.id("employeeId"));
			String EmpId=employeeId.getAttribute("value");
            // System.out.println("The Employee id is : "+ EmpId);
            
			Log.info(" The Employee id is : "+ EmpId);
            
            WebElement saveButton=driver.findElement(By.id("btnSave"));
            saveButton.click();
            
            Log.info(" Clicked on Save Button ");
            
                      
            driver.findElement(By.id("welcome")).click();
            
            driver.findElement(By.linkText("Logout")).click();
            
            Log.info(" Successfully LoggedOut ");
			
		}
	}
	
	

