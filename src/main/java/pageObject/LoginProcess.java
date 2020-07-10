package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginProcess {
	
	WebDriver driver;
	
	public LoginProcess(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='email']")
	WebElement emailid;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(className="redsubmit")
	WebElement submit;
	
	
	public WebElement Email_id()
	{
		return emailid;
	}
	
	public WebElement Password()
	{
		return password;
	}
	
	public WebElement Submit()
	{
		return submit;
	}

}
