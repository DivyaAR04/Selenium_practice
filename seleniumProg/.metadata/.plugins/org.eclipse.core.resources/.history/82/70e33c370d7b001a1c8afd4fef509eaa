

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe1 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
	    driver.switchTo().frame("a077aa5e");
	    System.out.println("********We are switch to the iframe*******");
 		driver.findElement(By.xpath("html/body/a/img")).click();
		    //Clicks the iframe
   
			System.out.println("*********We are done***************");
		
		
		driver.quit();
	
	
	}

}
