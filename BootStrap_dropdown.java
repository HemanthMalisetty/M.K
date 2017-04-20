package videos;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrap_dropdown {

	static WebDriver driver=null;
	static List<WebElement> menu=null;
	static WebElement element=null;
	
	public static void main(String[] args) {
		int i=0;
		String j=null;
		
		// setting the path for chrome driver
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");

		// creating the driver class object for chrome
		driver = new ChromeDriver();

		//getting the desired url
		driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");
		
		//making it implicitly wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//clicking on the required dropdown 
		driver.findElement(By.xpath(".//*[@id='menu1']")).click();
		
		//collecting the different links of dropdown into the webelement
		menu=driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));
		
		//processing the data
		for(i=0;i<menu.size();i++)
		{
			element=menu.get(i);
			
			j=element.getAttribute("innerHTML");
			
			if(j.equalsIgnoreCase("javascript"))
			{
				element.click();
				break;
			}
			
			System.out.println(j);
		}

	}

}
