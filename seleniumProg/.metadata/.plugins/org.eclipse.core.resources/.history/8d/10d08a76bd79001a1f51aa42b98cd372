package com.Selenium.Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttributeNameofWebEle 
{
	public static void main(String[] args)
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		WebElement driv = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select sel=new Select(driv);
	
//***************************DISPLAY ALL THE ELEMENTS**************************
		List<WebElement> ele = sel.getOptions();
		
		for(WebElement ele1:ele)
		{
			String elename=ele1.getText();
			System.out.println(elename);
			
		}
		System.out.println();
//********************SELECTE ELEMENT BY INDEX*********************
		sel.selectByIndex(6);
		sel.selectByValue("8");
		sel.selectByVisibleText("Mar");
		List<WebElement> sel1=sel.getAllSelectedOptions();
		
		for(WebElement elem:sel1)
		{
		String ele11=elem.getText();
		System.out.println(ele11);
		}
		System.out.println();
//******************Sorting the select option values*******************
		List<WebElement> element = sel.getOptions();
		ArrayList<String> arrlist = new ArrayList();
		
		for(WebElement ele12:element)
		{
			String elemen=ele12.getText();
			arrlist.add(elemen);
		}
		Collections.sort(arrlist);
		
		for(String arr:arrlist)
		{
			System.out.println(arr);
		}
		System.out.println();
//*******************Reverse order**************************
		List<WebElement> ele14 = sel.getOptions();
		ArrayList<String> lis=new ArrayList();
		
		for(WebElement eleme:ele14)
		{
			String strname=eleme.getText();
			lis.add(strname);
		}
		Collections.reverse(lis);
		
		for(String ele16:lis)
		{
			System.out.println(ele16);
		}
		
		
		
		
		
		
		
		driver.quit();
	}
		
		
		
		
	}

