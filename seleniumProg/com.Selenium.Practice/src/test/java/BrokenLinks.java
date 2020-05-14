

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks 
{
public static void main(String[] args) throws MalformedURLException, IOException
{
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
	driver.get("https://www.amazon.com/");
	
	List<WebElement> linklist = driver.findElements(By.tagName("a"));
	linklist.addAll(driver.findElements(By.tagName("img")));
	
	System.out.println("total number of links available "+linklist.size());
	
	
	List<WebElement> activelink=new ArrayList<WebElement>();
	
	
/*	for(int i=0;i<linklist.size();i++)
	{
		WebElement links=linklist.get(i);
		if(links.getAttribute("href")!=null)
		{
			activelink.add(linklist.get(i));
		}
	}*/
	
	Iterator listIter= linklist.iterator();
	while(listIter.hasNext())
	{
		WebElement iterList=(WebElement) listIter.next();
		if(iterList.getAttribute("href")!=null)
		{
			activelink.add(iterList);
		}
	
	
	}
	
	
	System.out.println("active links available "+activelink.size());
	
	for(int j=0;j<activelink.size();j++)
	{
		
		HttpURLConnection connection=(HttpURLConnection)new URL(activelink.get(j).getAttribute("href")).openConnection();
		connection.connect();
		String response = connection.getResponseMessage();
		connection.disconnect();
		System.out.println(activelink.get(j).getAttribute("href")+"   "+ response);
	}
	driver.close();
}
	
	
}
