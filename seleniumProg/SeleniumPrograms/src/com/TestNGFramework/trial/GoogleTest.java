package com.TestNGFramework.trial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTest 
{
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
	}
	
	@Test
	public void googleTitleTest()
	{
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	@Test
	public void googleLogoTest()
	{
		boolean logo=driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
	}
	
	@Test
	public void mailLinkTest()
	{
		boolean b=driver.findElement(By.linkText("GMail")).isDisplayed();
	}
	
	@AfterMethod
	public void teerdown() throws InterruptedException
	{
		driver.quit();
	}
	

}
