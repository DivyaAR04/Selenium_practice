package com.Selenium.Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DescendingList {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/viprava/Desktop/ListBox.html");
		WebElement ele = driver.findElement(By.id("fruits"));
		Select ele1=new Select(ele);
		List<WebElement> li=ele1.getOptions();
		
		ArrayList<String> l2=new ArrayList<String>();
		int count=li.size();
		for(WebElement lis:li)
		{
			l2.add(lis.getText());
		}
		
		Collections.reverseOrder();
		
		for(String a:l2)
		{
			System.out.println(a);
		}
		
		driver.quit();
	}

}
