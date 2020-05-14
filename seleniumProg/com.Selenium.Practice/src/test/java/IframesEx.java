

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframesEx 
{
	public static void main(String[] args)
	{
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("website name");
		
		driver.manage().window().maximize();
		
		List<WebElement> li = driver.findElements(By.tagName("iframe"));
		int size= li.size();
		
		for(WebElement li1:li)
		{
			String str=li1.getText();
			driver.switchTo().frame(str);
			try
			{
			WebElement ele=li1.findElement(By.linkText("linking"));
			ele.click();
			}		
		   	catch(Exception e)
			{
		   		
			}
		}
      }
}
