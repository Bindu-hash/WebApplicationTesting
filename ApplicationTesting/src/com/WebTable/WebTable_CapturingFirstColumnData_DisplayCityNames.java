package com.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTable_CapturingFirstColumnData_DisplayCityNames extends BaseTest{
	
	public void capturingFirstColumnData()
	{
		// /html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a
		// /html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[2]/td[1]/a
		// /html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[3]/td[1]/a
		
		// Last element
		// /html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]/a
		
		for(int i=1;i<=36;i++)
		{
			WebElement cityNameElement=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr["+i+"]/td[1]"));
			String cityName=cityNameElement.getText();
			
			System.out.println(cityName);
			
								
		}
		
	}
		
		public static void main(String []args)
		{
			
			WebTable_CapturingFirstColumnData_DisplayCityNames webTable=new WebTable_CapturingFirstColumnData_DisplayCityNames();
			webTable.setUp();
			
			webTable.capturingFirstColumnData();
			
			webTable.tearDown();
			
		}
	}


