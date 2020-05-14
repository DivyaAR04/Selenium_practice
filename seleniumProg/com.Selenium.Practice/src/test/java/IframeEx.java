

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeEx 
{
public static void main(String[] args)
{
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();
	
	driver.get("http://demo.guru99.com/test/guru99home/");
	
	driver.manage().window().maximize();
	driver.switchTo().frame("a077a5e");
	
	System.out.println("******we are switch to iframe*****");
	driver.quit();
}
}
