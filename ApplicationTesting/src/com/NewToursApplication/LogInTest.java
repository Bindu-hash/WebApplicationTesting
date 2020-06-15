package com.NewToursApplication;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;



public class LogInTest extends BaseTest{

	@Test
	public void logIn() throws IOException
		{
		   	FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/config.properties");
		    System.out.println(System.getProperty("user.dir"));
		   	
		   	Properties prop = new Properties();
		   	
		   	// It access the properties file
		   	prop.load(fis);
		    
		    FileInputStream file=new FileInputStream("./src/com/ApplicationTestDataFiles/NewTours_LoginTest_TestData.xlsx");
		   	//FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"/src/com/ApplicationTestDataFiles/NewTours_LoginTest_TestData.xlsx"); 
		   	XSSFWorkbook workBook=new XSSFWorkbook(file);
		    XSSFSheet sheet=workBook.getSheet("Sheet1");
		    
		    int rowCount=sheet.getLastRowNum();
		    
		    for(int i=1;i<=rowCount;i++)
		    {
		    
		     Row row=sheet.getRow(i);
		     
		    WebElement userName=driver.findElement(By.name(prop.getProperty("uname")));
		    userName.clear();
		   	userName.sendKeys(row.getCell(0).getStringCellValue());

			WebElement password=driver.findElement(By.name(prop.getProperty("pwd")));
			password.clear();
			password.sendKeys(row.getCell(1).getStringCellValue()); //performing operation on the element

			/*<input type="image" name="login" value="Login" src="/images/btn_signin.gif" width="58" height="17" alt="Sign-In" border="0">

			locator - name
			selector - login */
			
			WebElement signIn=driver.findElement(By.name(prop.getProperty("signIn")));
			signIn.click();
			
			String expected_HomePageTitle="Find";
			System.out.println("The HomePage title of NewTours Application is : "+expected_HomePageTitle);
			
			String actual_WebPageTitle=driver.getTitle();
			System.out.println("The title of the WebPage is : "+actual_WebPageTitle);
			
			if(actual_WebPageTitle.contains(expected_HomePageTitle))
			{
			   System.out.println("LogIn Successful - PASS");
			   row.createCell(2).setCellValue("LogIn Successful - PASS");
			   
			}
			else
			{	
				System.out.println("LogIn Failed - FAIL");
				row.createCell(2).setCellValue("LogIn Failed - FAIL");
			}
	    
		        FileOutputStream file1=new FileOutputStream("./src/com/ApplicationTestResultFiles/NewTours_LogInTestResult.xlsx");
		        workBook.write(file1);
		        
		        driver.navigate().back();
		    
		    }
	}		
	
}
	
