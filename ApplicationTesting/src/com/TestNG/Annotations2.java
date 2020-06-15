package com.TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2 {
	
	// it executes before the Test Case
	@BeforeTest
	public void gmailApplicationLaunch()
	{
		System.out.println("Gmail Application Launch successfully");
	}

	@Test(priority=1)
	public void inBox()
	{
		System.out.println("Testing Inbox functionality");
	}
	
	@Test(priority=2)
	public void composeMail()
	{
		System.out.println("Testing ComposeMail functionality");
	}
	
	@Test(enabled=false)
	public void sentMail()
	{
		System.out.println("Testing SentMail functionality");
	}
	
	// This will be executed after completion of Testing all the Test Cases
	
	@AfterTest
	public void applicationClose()
	{
		System.out.println("Closing Gmail Application");
	}
}
