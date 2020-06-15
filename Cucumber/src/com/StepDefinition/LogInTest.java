package com.StepDefinition;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogInTest {
	
	/*
	public WebDriver driver;
	public String applicationURL="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";
	
	@Given("^User should open the Chrome Browser and navigate to LogIn WebPage of the OrangeHRM Application$")
	public void user_should_open_the_Chrome_Browser_and_navigate_to_LogIn_WebPage_of_the_OrangeHRM_Application() throws Throwable {
	    
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(applicationURL);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		
		
	}
	
	*/
	/*
	@Given("^User should Open the Chrome Browser and navigate to LogIn WebPage of OrangeHRM Application$")
	public void user_should_Open_the_Chrome_Browser_and_navigate_to_LogIn_WebPage_of_OrangeHRM_Application()  {
	    
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(applicationURL);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		
	}
	*/

/*	@When("^User enters UserName$")
	public void user_enters_UserName() {
	    
		WebElement userName=driver.findElement(By.id("txtUsername"));
		userName.sendKeys("admin");
		
	}

	@Then("^User enters Password$")
	public void user_enters_Password()  {
	    
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.sendKeys("password");
		
	}
*/
	/*
	@When("^User enters \"([^\"]*)\" UserName$")
	public void user_enters_UserName(String UserName)  {
	    
		WebElement userName=driver.findElement(By.id("txtUsername"));
		userName.sendKeys(UserName);
	}
	
	@Then("^User enters \"([^\"]*)\" Password$")
	public void user_enters_Password(String Password)  {
	

		WebElement password=driver.findElement(By.id("txtPassword"));
		password.sendKeys(Password);
	}

	
	@Then("^User clicks on LogIn button$")
	public void user_clicks_on_LogIn_button()  {
		
		WebElement logInButton=driver.findElement(By.id("btnLogin"));
		logInButton.click();
	    
	}

/*
	@Then("^User shouldbe able to LogIn Successfully and close the Application$")
	public void user_shouldbe_able_to_LogIn_Successfully_and_close_the_Application()  {
	    
		// Validating related to Successfully LogIn -- should reach to HomePage with a valid test data

		String expected_UserName ="Admin";
		System.out.println(" The expected UserName is : "+expected_UserName);
		
		String actual_UserName=driver.findElement(By.id("welcome")).getText();
		System.out.println(" The actual UserName is : "+actual_UserName);
		
		if(actual_UserName.contains(expected_UserName))
		{
			System.out.println(" Successfully reached HomePage - PASS");
		}
		else
		{
			System.out.println(" LogIn Failed - FAIL ");
		}

				
		driver.quit();
	}

  */
	/*

@Then("^User \"([^\"]*)\" able to LogIn Successfully and close the Application$")
public void user_able_to_LogIn_Successfully_and_close_the_Application(String Type) throws IOException 
{

	try{
			String expected_text="Welcome Admin";
			System.out.println("The expected text is :"+expected_text);

			// <a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
			WebElement welcomeAdmin=driver.findElement(By.id("welcome"));
			String actual_Text=welcomeAdmin.getText();
			System.out.println("The actual text is : "+actual_Text);
			
			if(actual_Text.contains(expected_text))
			{
				System.out.println("Successfully logIn - PASS");
				welcomeAdmin.click();
				Thread.sleep(5000);
				driver.findElement(By.linkText("Logout")).click();
	
		}

}
catch(Exception e)
{
	String expected_LogInPageErrorText="Invalid credentials";
	System.out.println(" Expected LogIn Page Error Text Message : "+expected_LogInPageErrorText);
	
	String actual_LogInPageErrorText = driver.findElement(By.id("spanMessage")).getText();
	System.out.println(" Actual LogIn Page Error Text : "+actual_LogInPageErrorText);
	
	if(actual_LogInPageErrorText.equals(expected_LogInPageErrorText))
	{
		File screenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenShot, new File("./ScreenShots/Error_ScreenShot.png"));
		
		System.out.println("LogIn Failed - FAIL");
		driver.quit();
	}
	
	
}
		
	
	}
*/	
	

	WebDriver driver;
	String url="https://opensource-demo.orangehrmlive.com/";
	
	@Given("^User should open the Chrome Browser and navigate to LogIn WebPage of the OrangeHRM Application$")
	public void user_should_open_the_Chrome_Browser_and_navigate_to_LogIn_WebPage_of_the_OrangeHRM_Application() throws Throwable {
	    
		System.setProperty("webdriver.chrome.driver", "DriverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@When("^User enters \"([^\"]*)\" UserName$")
	public void user_enters_UserName(String UserName) throws Throwable {
	    
		WebElement userName=driver.findElement(By.id("txtUsername"));
		userName.sendKeys(UserName);
		
	}

	@Then("^User enters \"([^\"]*)\" Password$")
	public void user_enters_Password(String Password) throws Throwable {
	    

		WebElement password=driver.findElement(By.id("txtPassword"));
		password.sendKeys(Password);
	}

	@Then("^User clicks on LogIn button$")
	public void user_clicks_on_LogIn_button() throws Throwable {
	   
		WebElement logInButton=driver.findElement(By.id("btnLogin"));
		logInButton.click();
	    
		
	}

	@Then("^User \"([^\"]*)\" able to LogIn Successfully and close the Application$")
	public void user_able_to_LogIn_Successfully_and_close_the_Application(String arg1) throws Throwable {
	    
		System.out.println(" HomePage");
		
		driver.quit();
	}


	
	
	
	
	
	
	
	
}
	