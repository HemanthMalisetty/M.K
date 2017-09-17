package base;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Base {
	
	protected Properties prop=null;
	WebElement element=null;
	protected WebDriver driver=null;
	List<WebElement> list,list1=null;
	Actions act=null;
	
	public void loadproperties(String filepath)
	{
		try
		{
		prop=new Properties();
		
		File f= new File(filepath);
		
		FileInputStream fis= new FileInputStream(f);
		
		prop.load(fis);
		
		System.out.println(prop.getProperty("url"));
		
		System.out.println(prop.getProperty("browser"));
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void clickonelement(WebElement ele)
	{
		ele.click();
	}
	
	public void enterdata(WebElement ele,String data)
	{
		ele.sendKeys(data);
	}
	
	public WebElement getelement(WebDriver driver,String locator)
	{
		if(locator.endsWith("_xpath"))
		{
			element=driver.findElement(By.xpath(prop.getProperty(locator)));
		}
		else if(locator.endsWith("_id"))
		{
			element=driver.findElement(By.id(prop.getProperty(locator)));
		}
		else if(locator.endsWith("_tagname"))
		{
			element=driver.findElement(By.tagName(prop.getProperty(locator)));
		}
		else if(locator.endsWith("_classname"))
		{
			element=driver.findElement(By.className(prop.getProperty(locator)));
		}
		return element;
	}

	public List<WebElement> getlocators(WebDriver driver,String locator)
	{
		if(locator.endsWith("_xpath"))
		{
			list=driver.findElements(By.xpath(prop.getProperty(locator)));
		}
		else if(locator.endsWith("_id"))
		{
			list=driver.findElements(By.id(prop.getProperty(locator)));
		}
		else if(locator.endsWith("_tagname"))
		{
			list=driver.findElements(By.tagName(prop.getProperty(locator)));
		}
		else if(locator.endsWith("_classname"))
		{
			list=driver.findElements(By.className(prop.getProperty(locator)));
		}
		return list;
	}
	
	public void clickoncalender(WebDriver driver,String locator,String value)
	{
		list=getlocators(driver, locator);
		
		for(int i=0;i<list.size();i++)
		{
			list1=driver.findElements(By.tagName("td"));
			
			for(int j=0;j<list1.size();j++)
			{
				element=list1.get(j);
				
				String s=element.getText();
				
				if(s.equalsIgnoreCase(value))
				{
					element.click();
					break;
				}
			}
		}
	}
	
	public Actions action(WebDriver driver)
	{
		act=new Actions(driver);
		return act;
	}
}
