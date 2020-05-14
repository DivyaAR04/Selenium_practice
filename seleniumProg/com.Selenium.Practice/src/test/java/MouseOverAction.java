
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOverAction 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
	//	driver.get("https://www.flipkar.com");
		Thread.sleep(1000);
		
/*   //THIS CODE IS FOR FLIPKART
 		//to close the popup window
 
	//	driver.findElement(By.xpath("X")).click();
		
		/*WebElement ele = driver.findElement(By.xpath("//span[.='Men']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		
		driver.findElement(By.xpath("//a[.='']")).click();*/
		
		//THIS CODE IS FOR REDBRICKS
		driver.get("https://home.redbrickhealth.com/");
		
		
		String xp="//a[.='RedBrick Health']/../..//a[.='Solutions']";
		WebElement menu = driver.findElement(By.xpath(xp));
		

		Actions act=new Actions(driver);
		act.moveToElement(menu).perform();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[.='Solutions']/..//a[.='Problems We Solve']")).click();
		
		Thread.sleep(2000);
				
		driver.quit();
	
	
	}

}
