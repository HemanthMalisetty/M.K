package videos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alert_boxes {

	WebDriver driver = null;
	Alert alt = null;

	@Test
	public void handlealert() throws InterruptedException {
		// setting the path for chrome driver
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");

		// creating the driver class object for chrome
		driver = new ChromeDriver();

		// maximizing the page
		driver.manage().window().maximize();

		// making it implicitlye wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// getting the desired url
		driver.get("http://www.ksrtc.in");

		// finding and clicking on the Search for buses button
		driver.findElement(By.xpath(".//*[@id='searchBtn']")).click();

		// making the thread wait for 5 seconds
		Thread.sleep(6000);

		/*
		 * // switching to the alert box alt = driver.switchTo().alert();
		 * 
		 * // accepting the alert box alt.accept();
		 */
		// direct switching to alert box
		driver.switchTo().alert().accept();
		

	}

}
