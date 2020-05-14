package com.Selenium.Programs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopEx1 
{
	public static void main(String[] args)
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.javascriptkit.com/javatutors/alert2.shtml");
		
		WebElement link=driver.findElement(By.xpath("//input[@value='Click here for output>>']"));
		link.click();
		Alert a=driver.switchTo().alert();
		String text=a.getText();
		System.out.println(text);
		
		//a.accept();
		
		a.dismiss();
		driver.quit();
				
	}
}