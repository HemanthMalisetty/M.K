package videos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_window_launching {

	static WebDriver driver=null;
	
	public static void main(String[] args) {
		
		//setting the path for chrome driver
		System.setProperty("webdriver.chrome.driver","D:\\Software\\chromedriver_win32\\chromedriver.exe");
		
		//creating the driver class object for chrome
		driver= new ChromeDriver();
		
		//getting the desired url
		driver.get("https://www.google.co.in");
		
		//maximizing the page
		driver.manage().window().maximize();
		
		//making it implicitly wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//getting the text of the page
		System.out.println("The title of the page is "+driver.getTitle());

	}

}
