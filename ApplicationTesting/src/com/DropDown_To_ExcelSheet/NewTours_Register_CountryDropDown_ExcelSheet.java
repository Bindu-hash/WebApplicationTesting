package com.DropDown_To_ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTours_Register_CountryDropDown_ExcelSheet {
	
	WebDriver driver=null;
	String url = "http://newtours.demoaut.com";
	
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test(priority=1)
	public void register()
	{
	  WebElement register=driver.findElement(By.linkText("REGISTER"));
	  register.click();	
	  
	}
	
	@Test(priority=2)
	public void countryDropDown() throws IOException
	{
WebElement countryDropDown=driver.findElement(By.name("country"));
		
		List<WebElement>countries=driver.findElements(By.tagName("option"));
		
		int countriesCount=countries.size();
		
		System.out.println("The number of Countries in CountryDropDown are:" + countriesCount);
		
		FileInputStream file=new FileInputStream("./src/com/ExcelTestDataFiles/SingleTestData.xlsx");
		XSSFWorkbook workBook=new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		
		for(int i=0;i<countriesCount;i++)
		{
				String countryName=countries.get(i).getText();
		        System.out.println(i+" "+countryName);
		        
		     Row row=sheet.createRow(i);
		     Cell cell=row.createCell(0);
		     
		     cell.setCellValue(countryName);
		     
		     FileOutputStream file1=new FileOutputStream("./src/com/ExcelTestDataFiles/SingleTestData.xlsx");
		     workBook.write(file1);
				         
		}
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}
