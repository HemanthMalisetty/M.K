package videos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utility.ConfigureProperty;


public class Configuration_File {

	WebDriver driver=null;
	ConfigureProperty prop=null;
	
	@BeforeTest
	public void setup()
	{
		prop=new ConfigureProperty();
		
		
	}
	
	@Test
	public void Authentication()
	{
		driver=new FirefoxDriver();
		
		String url=prop.launchurl();
		
		driver.manage().window().maximize();
		
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(prop.xpathuser())).sendKeys("admin");
		
		driver.findElement(By.xpath(prop.xpathpass())).sendKeys("demo123");
		
		driver.findElement(By.xpath(prop.xpathlogin())).click();
		
		driver.quit();
		
	}
}
