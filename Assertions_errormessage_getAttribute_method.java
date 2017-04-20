package videos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions_errormessage_getAttribute_method {

	WebDriver driver = null;

	@Test

	public void errormessage() throws Exception {

		String actual_error = null;

		// setting the path for chrome driver
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");

		// creating the driver class object for chrome
		driver = new ChromeDriver();

		// maximizing the page
		driver.manage().window().maximize();

		// making it implicitly wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// getting the desired url
		driver.get("https://accounts.google.com");

		// clicking on the next button
		driver.findElement(By.xpath(".//*[@id='next']")).click();

		// making the thread sleep for 3 seconds
		Thread.sleep(3000);

		// collecting the error message into the actual_error
		actual_error = driver.findElement(By.xpath(".//*[@id='errormsg_0_Email']")).getAttribute("innerHTML");

		// comparing weather the actual value and expected values are equal
		Assert.assertTrue(actual_error.contains("Please enter your emai"));

		// displaying the output message
		System.out.println("verification success");

	}

}
