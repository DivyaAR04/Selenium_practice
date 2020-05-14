

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMfb 
{
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(name="pass")
	private WebElement pass;
	
	@FindBy(xpath="//input[@value='Log In']")
	private WebElement login;
	
	public POMfb(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}

/*	public POMfb(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}*/

	public void AccEmail(String email1)
	{
		email.sendKeys(email1);
	}
	public void Password(String pass1)
	{
		pass.sendKeys(pass1);	
	}
	public void logbut()
	{
		login.click();
	}
	
	
}
