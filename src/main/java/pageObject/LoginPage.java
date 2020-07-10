package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
	this.driver = driver;	
	}
	
	
	By contactLink = By.xpath("//li[@id='contact']/a");
	
	public WebElement Contact_Link(){
		return driver.findElement(contactLink);
	}
	
	

}
