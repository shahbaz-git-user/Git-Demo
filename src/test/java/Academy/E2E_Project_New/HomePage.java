package Academy.E2E_Project_New;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LoginPage;
import pageObject.LoginProcess;
import resources.Base_Class;

public class HomePage extends Base_Class{
	
	@BeforeTest
	public void browser_invoke() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("URL"));
		
	}

	@Test(dataProvider="get_login_Data")
	public void MainPageNavigation(String username, String password) throws IOException{
		
		//LoginPage l = new LoginPage(driver);
		//l.Contact_Link().click();
		LoginProcess lp = new LoginProcess(driver);
		lp.Email_id().sendKeys(username);
		lp.Password().sendKeys(password);
		lp.Submit().click();
	}
	
	@DataProvider
	public Object[][] get_login_Data(){
		
		//to execute a above testcase "Web_Login"  for three times and passing two values every time
		Object[][] data = new Object[3][2];
		
		//first execution:
		data[0][0] = "provider@test.com";
		data[0][1] = "provider123";
		
		
		//second execution:
		data[1][0] = "shahbaz.careerdeveloper67@gmail.com";
		data[1][1] = "provider123";
		
		//third execution:
		data[2][0] = "shahbazhanif87@gmail.com";
		data[2][1] = "provider123";
		
		return data; 
		
	}
	
	@AfterTest
	public void browser_quite()
	{
		driver.quit();
		driver = null;
	}

}
