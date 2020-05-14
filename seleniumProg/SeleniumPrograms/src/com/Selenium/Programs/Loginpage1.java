package com.Selenium.Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage1 
{
	@FindBy(id="username")
	private WebElement untb;
	
	@FindBy(name="pwd")
	private WebElement pwtb;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement logbtn;
	
	
	//to initialize the web page
	public Loginpage1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	public void enterusername(String un)
	{
		untb.sendKeys(un);
	}
	public void enterpassword(String pw)
	{
		pwtb.sendKeys(pw);
	}
	public void clickonlogin()
	{
		logbtn.click();
	}
	
}
