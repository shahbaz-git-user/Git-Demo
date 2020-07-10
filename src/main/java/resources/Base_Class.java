package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class Base_Class {
	
	public static WebDriver driver;
	public Properties prop;
	public WebDriver initializeDriver() throws IOException{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("E:\\eclipse_workspace\\E2E_Project_New\\src\\main\\java\\resources\\browser_data.properties");
		prop.load(fis);
		
		String BrowserName = prop.getProperty("Browser");
		System.out.println(BrowserName);
		
		if(BrowserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","E:\\browser_drivers_for_selenium\\geckodriver.exe");
			driver= new FirefoxDriver();
		}
		else if(BrowserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "E:\\browser_drivers_for_selenium\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		
		else if(BrowserName.equals("IE")){
			System.setProperty("webdriver.ie.driver", "E:\\browser_drivers_for_selenium\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}

}
