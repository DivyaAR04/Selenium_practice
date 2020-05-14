

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class POMClass1
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		Loginpage1 lp=new Loginpage1(driver);
		lp.enterusername("admin");
		lp.enterpassword("damager");
		lp.clickonlogin();
		Thread.sleep(2000);
		
		lp.enterusername("admin");
		lp.enterpassword("manager");
		lp.clickonlogin();
		Thread.sleep(2000);
		driver.close();
	}
}

