package videos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Alert_validating_error_message {

	WebDriver driver = null;

   	@Test
	public void alertvalidation() throws InterruptedException {

		String actual_msg, expected_msg = null;

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
		Thread.sleep(5000);

		// gathering the actual error message
		actual_msg = driver.switchTo().alert().getText();

		// the expected message
		expected_msg = "Please select start place.";

		// comparing the actual and exprcted
		Assert.assertEquals(actual_msg, expected_msg);
		
		//closing the alert box
		driver.switchTo().alert().accept();

		// closing the driver class object
		driver.quit();

	}

}
