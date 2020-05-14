package com.Selenium.Programs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Robot1 
{
	
	public static void main(String[] args) throws AWTException
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement link = driver.findElement(By.xpath("//a[.=\"actiTIME Inc.\"]"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(link).perform();
		
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		
		Robot r1=new Robot();
		
		r.keyPress(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_W);
		
		driver.quit();		
	}
}
