package com.Selenium.Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadEg 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.actitime.com/contact-support");
		driver.findElement(By.id("first-name")).sendKeys("Viprava");
		driver.findElement(By.id("fileupload")).sendKeys("‪C:\\Users\\viprava\\Desktop\\XpathEG.txt");
		Thread.sleep(500);
		
		driver.quit();
	}

}
