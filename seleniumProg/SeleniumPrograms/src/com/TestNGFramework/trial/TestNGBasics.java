package com.TestNGFramework.trial;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics
{
	@BeforeSuite
	public void setup()
	{
		System.out.println("setup system property for firefox");
	}

	@BeforeClass
	public void launchBrowser()
	{
		System.out.println("launch firefox");
	}
	
	@BeforeTest
	public void login()
	{
		System.out.println("login to app");
	}

	@BeforeMethod
	public void enterURL()
	{
		System.out.println("enter the url");
	}
	
	@Test
	public void googleTitleTest()
	{
		System.out.println("Google Title Test");
	}
	
	@AfterMethod
	public void logOut()
	{
		System.out.println("Input from app");
	}
	
	@ AfterTest
	public void deleteAllCookies()
	{
		System.out.println("delete all cookies");
	}
	
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("close the browser");
	}

	@AfterSuite
	public void generateTestReport()
	{
		System.out.println("Gnerating report");
	}
}	

