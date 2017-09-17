package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import base.Base;

public class Utility extends Base{
	public WebDriver navigate(String browser,String url)
	{
		if(prop.getProperty(browser).equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Selinium-Jars\\geckodriver.exe");
			
			driver=new FirefoxDriver();
			
			driver.get(prop.getProperty(url));
	
	return driver;
		}
		else
		{
			return null;
		}
	}
	
	public void launchurl(WebDriver driver)
	
	{
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

}
