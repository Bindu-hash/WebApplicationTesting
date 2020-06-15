package com.OrgangeHRM;

import java.util.List;

import org.omg.Messaging.SyncScopeHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMApplication_HomePage_LinksCount {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url = "http://opensource-demo.orangehrmlive.com/";
		
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		
		//<input name="txtUsername" id="txtUsername" type="text">
		
		WebElement username=driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		
			
		//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");
		
		
		//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		
		WebElement login=driver.findElement(By.id("btnLogin"));
		login.click();
		
		//<a href="/index.php/admin/viewAdminModule" id="menu_admin_viewAdminModule" class="firstLevelMenu"><b>Admin</b></a>
		//<a href="/index.php/pim/viewPimModule" id="menu_pim_viewPimModule" class="firstLevelMenu"><b>PIM</b></a>
		//<a href="/index.php/leave/viewLeaveModule" id="menu_leave_viewLeaveModule" class="firstLevelMenu"><b>Leave</b></a>
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		  
	    int linksCount=links.size();
	    System.out.println("The number of links on the OrangeHRM Application HomePage are: "+ linksCount);
	  
	   
	    //Display names of visible elements - links in the HomePage along with numbers
	    for(int i=0;i<linksCount;i++)
	    {
	    	if(links.get(i).isDisplayed())
	    	{
	    		   
		   String linkName=links.get(i).getText();
	    	
	    	System.out.println(i+" "+linkName);
	    	
	    		   	  
	    	    	
	    }
	    
	    }
	  
				 	    	    
	    driver.quit();
			
		

	}

}
