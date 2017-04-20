package videos;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Demo {

	static WebDriver driver=null;
	
	public static void main(String[] args) throws Exception {
		
		//setting the path for chrome driver
		System.setProperty("webdriver.chrome.driver","D:\\Software\\chromedriver_win32\\chromedriver.exe");
				
		//creating the driver class object for chrome
		driver= new ChromeDriver();
		
		//maximizing the page
		driver.manage().window().maximize();
		
		//getting the desired url
		driver.get("http://jqueryui.com");
		
		//making the thread to sleep for 5 seconds
		Thread.sleep(5000);
		
		//performing the scroll operation
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");

		
	}

}
