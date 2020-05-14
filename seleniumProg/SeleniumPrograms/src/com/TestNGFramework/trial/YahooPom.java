package com.TestNGFramework.trial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YahooPom 
{
	@FindBy(id="login-signin")
	private WebElement untb;
		
	@FindBy(id="login-signin")
	private WebElement logbtn;
	
	
	//to initialize the web page
	public YahooPom(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	public void enterusername(String un)
	{
		untb.sendKeys(un);
	}
	public void clickonlogin()
	{
		logbtn.click();
	}

}
