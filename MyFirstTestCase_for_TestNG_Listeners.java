package videos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(videos.TestNGListener.class)
public class MyFirstTestCase_for_TestNG_Listeners {

	WebDriver driver = null;

	@Test
	public void verifyGoogleTitle() {
		// creating the driver class object
		driver = new FirefoxDriver();

		// maximizing the page
		driver.manage().window().maximize();

		// making it implicitly wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// launching the required url
		driver.get("http://www.facebook.com");

	}

	@Test
	public void TitleMatch() {

		//displaying some dummy statement
		System.out.println("Test case 2 Dummy");

		// we are forcefully failing the test case
		Assert.assertTrue(false);
	}

}
