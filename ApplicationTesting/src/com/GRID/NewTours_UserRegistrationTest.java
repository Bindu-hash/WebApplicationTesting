package com.GRID;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTours_UserRegistrationTest {
	
	@Parameters("Browser")
	
	@Test
	public void userRegistration(String browser) throws IOException
	{
		System.out.println("The Name of the Browser is : "+browser);
		
		//information related to the Nodes created
		
		// DesiredCapabilities - is used to set the info related to the browser and the platform on which the test should run
		
		DesiredCapabilities cap = null;
		
		if(browser.equalsIgnoreCase("firefox"))
		{
			cap = DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		}
		else
			if(browser.equalsIgnoreCase("chrome"))
			{
				cap = DesiredCapabilities.chrome();
				cap.setBrowserName("chrome");
				cap.setPlatform(Platform.WINDOWS);
			}
		
		// RemoteWebDriver - is should be set with the info of the hub server and should be provided with connecting to nodes
		
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.11:4444/wd/hub"), cap);
	
		// Testing NewUserRegistration functionality
		
		String url="http://newtours.demoaut.com";
	
		driver.navigate().to(url);
		WebElement register=driver.findElement(By.linkText("REGISTER"));
    	register.click();
    	
    	FileInputStream file=new FileInputStream("./src/com/ApplicationTestDataFiles/NewTours_NewUserRegistrationTestData.xlsx");
    	XSSFWorkbook workBook=new XSSFWorkbook(file);
    	XSSFSheet sheet=workBook.getSheet("Sheet1");
    	
    	int rowCount=sheet.getLastRowNum();
    	
    	for(int i=1;i<=rowCount;i++)
    	{
    	
    		Row row=sheet.getRow(i);
    		    		
    	WebElement firstName=driver.findElement(By.name("firstName"));
        firstName.clear();
        firstName.sendKeys(row.getCell(0).getStringCellValue());
        
        WebElement lastName=driver.findElement(By.name("lastName"));
        lastName.clear();
        lastName.sendKeys(row.getCell(1).getStringCellValue());
        
        // Type casting
        double d=row.getCell(2).getNumericCellValue();
        long x=(long)d;
        String phoneNumber=Long.toString(x);
        
        WebElement phone=driver.findElement(By.name("phone"));
        phone.clear();
        phone.sendKeys(phoneNumber);
        
        WebElement email=driver.findElement(By.id("userName"));
        email.clear();
        email.sendKeys(row.getCell(3).getStringCellValue());
        
        WebElement address1=driver.findElement(By.name("address1"));
        address1.clear();
        address1.sendKeys(row.getCell(4).getStringCellValue());
        
        WebElement city=driver.findElement(By.name("city"));
        city.clear();
        city.sendKeys(row.getCell(5).getStringCellValue());
        
        WebElement state=driver.findElement(By.name("state"));
        state.clear();
        state.sendKeys(row.getCell(6).getStringCellValue());
        
        //Type casting
        double p=row.getCell(7).getNumericCellValue();
        long q=(long)p;
        String postalCodeNumber=Long.toString(q);
        
        WebElement postalCode=driver.findElement(By.name("postalCode"));
        postalCode.clear();
        postalCode.sendKeys(postalCodeNumber);
        
        // It's DropDown Menu so we can't clear it
        WebElement country=driver.findElement(By.name("country"));
        country.sendKeys(row.getCell(8).getStringCellValue());
        
        WebElement userName=driver.findElement(By.id("email"));
        userName.clear();
        userName.sendKeys(row.getCell(9).getStringCellValue());
        
        WebElement password=driver.findElement(By.name("password"));
        password.clear();
        password.sendKeys(row.getCell(10).getStringCellValue());
        
        WebElement confirmPassword=driver.findElement(By.name("confirmPassword"));
        confirmPassword.clear();
        confirmPassword.sendKeys(row.getCell(11).getStringCellValue());
        
        // validating the check Password is equal to confirmPassword
        
        WebElement submit=driver.findElement(By.name("register"));
        submit.click();
        
        String expected_UserName=row.getCell(9).getStringCellValue();
        System.out.println("The expected UserName is : "+expected_UserName);
        
        // validating to check the landing page is Register WebPage
        // validate the FirstName
        // validate the lastName
        
        // validate whether User registered with the same name or not
        // /html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b
        
       WebElement registeredText=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b"));
       String actual_registerUserNameText=registeredText.getText(); 
       System.out.println("The actual Registered text is : "+actual_registerUserNameText); 
       
       if(actual_registerUserNameText.contains(expected_UserName))
       {
    	   System.out.println("User Registered Successfully - PASS");
    	   row.createCell(12).setCellValue("User Registered Successfully - PASS");
       }
       else
       {
    	   System.out.println("User Registration Failed - FAIL");
    	   row.createCell(12).setCellValue("User Registration Failed - FAIL");
       }
       
       FileOutputStream file1=new FileOutputStream("./src/com/ApplicationTestResultFiles/NewTours_UserRegistration_TestResult.xlsx");
       workBook.write(file1);
       
       driver.navigate().back();
    	}
    	
    	driver.quit();
    
	}

}
