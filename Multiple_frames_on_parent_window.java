package videos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_frames_on_parent_window {

	static WebDriver driver=null;
	
	public static void main(String[] args) {
	
		// setting the path for chrome driver
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");

		// creating the driver class object for chrome
		driver = new ChromeDriver();
		
		//maximizing the page
		driver.manage().window().maximize();
		
		//getting the desired url
		driver.get("D://javaPrograms//Selinium//Selenium_first//src//videos//myframes.html");
		
		//making it implicitly wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//switching to the required freme(w3c)
		driver.switchTo().frame("w3c");
		
		//finding the search button in the second frame
		driver.findElement(By.xpath("//a[@title='Search W3Schools']")).click();
		
		//passing the data to the search button
		driver.findElement(By.name("search")).sendKeys("CSS");
		
		//clicking on the search button
		driver.findElement(By.xpath("//td[@class='gsc-search-button']/input")).click();
		

	}

}
