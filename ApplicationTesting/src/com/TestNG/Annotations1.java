package com.TestNG;

import org.testng.annotations.Test;

public class Annotations1 {
	
	// @Test - represents to a Test Case
	// Any functionality we automate - should always be written using @Test Annotation
	
	@Test(priority=1)
	public void gmailApplicationLaunch()
	{
		System.out.println("Gmail Application Launch successfully");
	}
	
	@Test(priority=2)
	public void inBox()
	{
		System.out.println("Testing Inbox Functionality");
	}

	@Test(enabled=false)
	public void composeMail()
	{
		System.out.println("Testing ComposeMail Functionality");
	}
	
}
