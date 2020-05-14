

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoProperties {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		driver.manage().window().maximize();
		
		Properties obj=new Properties();
		FileInputStream objfile=new FileInputStream(System.getProperty("user.dir")+"\\SampleProperties.properties");
		
		obj.load(objfile);
		
		driver.findElement(By.id(obj.getProperty("EmailTextBox"))).sendKeys("test.com");
		driver.findElement(By.id(obj.getProperty("SignUpButton"))).click();
		
		driver.quit();
	}

}
