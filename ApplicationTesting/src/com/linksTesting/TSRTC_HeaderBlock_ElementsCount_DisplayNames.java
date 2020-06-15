package com.linksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_HeaderBlock_ElementsCount_DisplayNames {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="https://www.tsrtconline.in/oprs-web/";
		
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		//Identify the Block of the WebPage which is under Test
		// class="menu-wrap" - property of the headerBlock
		
        WebElement headerBlock=driver.findElement(By.className("menu-wrap"));
		
        List<WebElement>headerBlockLinks=headerBlock.findElements(By.tagName("a"));
        
        System.out.println("The number of links on the Header Block are : "+ headerBlockLinks.size());
        
        for(int k=0;k<headerBlockLinks.size();k++)
        {
        	String headerBlockLinkName=headerBlockLinks.get(k).getText();
            System.out.println(k+" "+headerBlockLinkName);
        }
        
        driver.quit();
        
		
		

	}

}
