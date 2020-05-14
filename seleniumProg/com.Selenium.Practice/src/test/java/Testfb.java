

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testfb extends Pomfb1
{
	public Testfb(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static void  main(String[] args)
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		 Pomfb1 pfb=new  Pomfb1(driver);
		
		pfb.Accemail("viprava");
		pfb.Pass1("divya");
		pfb.logbut();
	}
}

public class Pomfb1 
{
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(name="pass")
	private WebElement pass;
	
	@FindBy(xpath="//input[@value='Log In']")
	private WebElement login;
	
	public Pomfb1(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}

	public void Accemail(String em)
	{
		email.sendKeys(em);
	}
	public void Pass1(String ps)
	{
		pass.sendKeys(ps);
	}
	public void logbut()
	{
		login.click();
	}
	
}