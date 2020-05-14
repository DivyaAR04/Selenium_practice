

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/viprava/Desktop/ListBox.html");
		WebElement ele=driver.findElement(By.id("fruits"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
		sel.selectByValue("b");
		sel.deselectByVisibleText("Orange");
		List<WebElement> arg1=sel.getOptions();
		for(WebElement op1:arg1)
		{
			String opo1=op1.getText();
			System.out.println(opo1);
		}
		List<WebElement> arg2=sel.getAllSelectedOptions();
		for(WebElement op2:arg2)
		{
			String opo2=op2.getText();
			System.out.println(opo2);
		}
		
		WebElement arg3=sel.getFirstSelectedOption();
			String opo3=arg3.getText();		
	// count no. of elements
			int count=arg1.size();
			System.out.println(count);
	
			driver.quit();
	}

}
