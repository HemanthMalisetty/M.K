package main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utility.Utility;


public class Main1 {

WebDriver driver=null;
Actions act=null;
WebElement ele,ele1;
	
	@Test
	public void active()
	{
		
		Utility util=new Utility();
		
		util.loadproperties("D:\\javaPrograms\\Selinium\\eclipse oxygen\\com.mk.alpha\\src\\test\\resources\\locators.properties");
		
		driver=util.navigate("browser","url");
		
		util.launchurl(driver);
		
		ele=util.getelement(driver, "T-shirts_xpath");
		
		act=util.action(driver);
		
		act.moveToElement(ele);
		
		util.getelement(driver, "inside_tshirts_xpath").click();
		
	}
}
