package videos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.CaptureScreenshot;

public class ScreenShots {

	static WebDriver driver = null;
	static TakesScreenshot ts = null;

	public static void main(String[] args) throws Exception {
		
		

		// setting the path for chrome driver
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");

		// creating the driver class object for chrome
		driver = new ChromeDriver();

		// maximizing the window
		driver.manage().window().maximize();

		// making the window implicitly
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// opening the desired url
		driver.get("https://www.facebook.com/");

		// calling the screenshot utility class
		CaptureScreenshot.CaptuerScreenshot(driver,"facebook");

		// closing the driver objecj
		driver.quit();

	}

}
