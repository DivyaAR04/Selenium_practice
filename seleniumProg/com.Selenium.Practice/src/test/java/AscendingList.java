

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AscendingList {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/viprava/Desktop/ListBox.html");
		WebElement ele = driver.findElement(By.id("fruits"));
		Select sele=new Select(ele);
		List<WebElement> webele=sele.getOptions();
		ArrayList<String> l=new ArrayList<String>();

		for(WebElement listweb:webele)
		{
			l.add(listweb.getText());
		}

		Collections.sort(l);
		
		for(String l1:l)
		{
			System.out.println(l1);
		}
	}

}
