package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FluentWait 
{
	public static void main()
	{
		System.setProperty("Webdriver.gecko.driver","./Driver/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.gmail.com ");
		WebElement email=driver.findElement(By.id("identifierId"));
		email.sendKeys("divyara04@gmail.com");
		
		driver.quit();
	}
}
