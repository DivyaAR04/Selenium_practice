package com.XpathFor.FlipKart;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipKartXpaths {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		
		Actions actions=new Actions(driver);
		Action sendEsc=actions.sendKeys(Keys.ESCAPE).build();
		sendEsc.perform();
		Thread.sleep(100);
		
		//traverse through menu
		List<WebElement> elems = driver.findElements(By.xpath("//li[@class='Wbt_B2 _1YVU3_']"));
		for(int i=0;i<elems.size();i++)
		{
			String text = elems.get(i).getText();
			System.out.println(text);
			System.out.println("=====================");
		
			actions.moveToElement(elems.get(i)).build().perform();
			Thread.sleep(1000);
			
			String tryXpath="//li[@class='Wbt_B2 _1YVU3_']/descendant::a[contains(text(),'"+text+"')]";
			
		    List<WebElement> subele = driver.findElements(By.xpath(tryXpath));
			for(int j=0;j<subele.size();j++)
			{
				String namesub=subele.get(j).getText();
				System.out.println(namesub);
				
				actions.moveToElement(subele.get(j)).build().perform();
			}
		}
		
		
		//*************for Searchbox*********
		//WebElement ele = driver.findElement(By.xpath("//input[@class='LM6RPg']"));
		//ele.sendKeys("M");
		//Thread.sleep(1000);
		
		//*************cart***************	
	//	WebElement ele1=driver.findElement(By.xpath("//div[@class='_1jA3uo']/descendant::a[@class='_3ko_Ud']"));
		//ele1.click();
		//Thread.sleep(3000);
		
		//************More***************
	//	WebElement ele2 = driver.findElement(By.xpath("//div[@class='_2aUbKa']"));
		
		//**************login Button***********
		//WebElement ele3 = driver.findElement(By.xpath("//a[@class='_3Ep39l']"));
		
		//*******************For specific menu*************
	//	driver.findElement(By.XPath(""));
		
	//*******************For Time getting displayed with DEALS OF THE DAY*****************
	/*	WebElement ele = driver.findElement(By.xpath("//div[@class='Yg3scO']/span"));
		System.out.println(ele.getText());*/
		
		
		Thread.sleep(2000);
		
		
		driver.quit();
	}

}
