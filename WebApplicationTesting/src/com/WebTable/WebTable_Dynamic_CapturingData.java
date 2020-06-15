package com.WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTable_Dynamic_CapturingData extends BaseTest{
	
	
	public void DynamicWebTable()
	{
		//identifying the table 
		// /html/body/div[1]/div[6]/section[1]/div
		
		WebElement table=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div"));
	    
		List<WebElement>rows=table.findElements(By.tagName("tr"));
	
	    for(int i=0;i<rows.size();i++) // will go to all the Rows of the table
	    {
	    	List<WebElement>cols=rows.get(i).findElements(By.tagName("td")); //identifying the number of columns in the Row
	    	
	    	for(int j=0;j<cols.size();j++) // will go to every Row of all the columns
	        {
	    		String data=cols.get(j).getText();
	    		System.out.print(data+" ");
	    	}
	        System.out.println();
	    
	    }
	    	
	
	}

	public static void main(String []args)
	{
		
		WebTable_Dynamic_CapturingData webTable = new WebTable_Dynamic_CapturingData();
		
		webTable.setUp();
		
		webTable.DynamicWebTable();
		
		webTable.tearDown();
		
		
				
	}
}
