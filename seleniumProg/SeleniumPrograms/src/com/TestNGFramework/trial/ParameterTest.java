package com.TestNGFramework.trial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Selenium.Programs.Loginpage1;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class ParameterTest 
{
	WebDriver driver;
	
	@Test
	@Parameters({"url","browser","user_na"})
public void yahooLoginTest(String url,String browser,String user_na) throws InterruptedException
{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get(url);
		YahooPom lp=new YahooPom(driver);
		lp.enterusername(user_na);
		lp.clickonlogin();
		Thread.sleep(2000);
		
		driver.close();
}

}
