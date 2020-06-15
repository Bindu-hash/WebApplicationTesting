		
		package com.CapturingURLAddress;

		import org.openqa.selenium.chrome.ChromeDriver;

		public class CapturingURLAddress_SeleniumHomePage {

			public static void main(String[] args) {
				
		       String url="http://seleniumhq.org";
				
				System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		        ChromeDriver driver = new ChromeDriver();
		        
		        driver.get(url);
		        
		        //identifying the Title of the current WebPage
		        String actual_titleSeleniumWebSiteHomePage=driver.getTitle();
		       
		       //print the variable information as an output
		       System.out.println("The title of the Selenium HomePage is  :" + actual_titleSeleniumWebSiteHomePage);
		       
			   //identify the URL Address of the current WebPage 
		       String actual_WebPageURLAddress=driver.getCurrentUrl();
		       System.out.println("The Current Url Address of the HomePage is : " + actual_titleSeleniumWebSiteHomePage);
		       
		       driver.quit();
				

			}

	
			}


