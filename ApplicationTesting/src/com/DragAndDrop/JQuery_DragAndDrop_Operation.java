package com.DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JQuery_DragAndDrop_Operation {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = null;
		String url="http://jqueryui.com/droppable/";
		
		System.setProperty("webdriver.chrome.driver","./DriverFiles/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();
	
		//<iframe src="/resources/demos/droppable/default.html" class="demo-frame"></iframe>
		
		//WebElement frame=driver.findElement(By.className("demo-frame"));
		//driver.switchTo().frame(frame);
		
		//OR
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		//sychronization
		Thread.sleep(10000); //Explicit Wait
		
		//id="draggable" - property of Drag Me To My Target Element
		WebElement drag_Element=driver.findElement(By.id("draggable"));
		
		String dragElementText=drag_Element.getText();
		System.out.println("The text of the WebElement is : "+dragElementText);

	    //id="droppable" - property of Drop Here Element
		WebElement drop_Element=driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		
		action.dragAndDrop(drag_Element,drop_Element).perform();
		
		//Exiting outOf the Frame
		driver.switchTo().defaultContent();
		
		//Automating Resizable Element
		//<a href="https://jqueryui.com/resizable/">Resizable</a>
		
		WebElement resizable=driver.findElement(By.linkText("Resizable"));
		resizable.click();
		
		System.out.println("The title of the Resizable WebPage is : "+driver.getTitle());
		
	}

}
