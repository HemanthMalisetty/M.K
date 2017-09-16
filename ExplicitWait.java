package videos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	static WebDriver driver = null;
	static WebDriverWait wait ;

	public static void main(String[] args) {

		WebElement ele = null;
		Boolean status = false;

		// setting the path for chrome driver
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");

		// creating the driver class object for chrome
		driver = new ChromeDriver();

		// maximizing the page
		driver.manage().window().maximize();

		// getting the desired url
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");

		// clicking on the timer button
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();

		// creating the wait class object 
		wait = new WebDriverWait(driver, 10);

		// making the condition wait until the "webdriver" element is displayed
		ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));

		// checking weather the statement is displayed or not
		status = ele.isDisplayed();

		// processing the data
		if (status) {
			System.out.println("element is displayed");

		} else {
			System.out.println("element is not displayed");
		}

	}

}
