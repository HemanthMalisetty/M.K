package videos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions_Error_message_verification {

	WebDriver driver = null;

	@Test
	public void Errormessage() throws Exception {
		String actual_error = null;

		// setting the path for chrome driver
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");

		// creating the driver class object for chrome
		driver = new ChromeDriver();

		// maximizing the page
		driver.manage().window().maximize();

		// making the window implicitly wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// getting the desired url
		driver.get("https://accounts.google.com");

		// clicking on the next button of the gmail page
		driver.findElement(By.xpath(".//*[@id='next']")).click();

		// making the thread to sleep for 3 seconds
		Thread.sleep(3000);

		// collecting the error message
		actual_error = driver.findElement(By.xpath(".//*[@id='errormsg_0_Email']")).getText();

		// comparing the actual and expected values
		Assert.assertTrue(actual_error.contains("Please enter your email"));

		// output statement
		System.out.println("Test completed");

	}

}
