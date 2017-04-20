package videos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_verifiying_page_title {

	WebDriver driver = null;

	@Test

	public void Verify_App_Title() {

		String actual = null;

		// setting the path for chrome driver
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");

		// creating the driver class object for chrome
		driver = new ChromeDriver();

		// maximizing the page
		driver.manage().window().maximize();

		// making it implicitly wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// getting the desired url
		driver.get("http://learn-automation.com/");

		// getting the actual title
		actual = driver.getTitle();

		// displaying the title
		System.out.println("The actual Title is " + actual);

		// expected page title is
		//expected = "Selenium WebDriver-Complete Selenium Webdriver tutorials guide Online";

		// calling the assert function
		//Assert.assertEquals(actual, expected, "Title dosent match,Please file a bug");
        Assert.assertTrue(actual.contains("Selenium WebDriver"));
		
		// displaying the result
		System.out.println("Test is succeded");

	}

}
