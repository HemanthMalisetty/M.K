package videos;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class Fluent_wait {

	static WebDriver driver = null;

	public static void main(String[] args) {

		// setting the path for chrome driver
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");

		// creating the driver class object for chrome
		driver = new ChromeDriver();

		// maximizing the page
		driver.manage().window().maximize();

		// gttting the desired url
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");

		// clicking on the timer button
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();

		// Waiting 30 seconds for an element to be present on the page, checking
		// for its presence once every 5 seconds.
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(10, TimeUnit.MILLISECONDS).ignoring(NoSuchElementException.class);

		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				WebElement ele = driver.findElement(By.xpath("//p[@id='demo']"));
				String value = ele.getAttribute("innerHTML");
				if (value.equalsIgnoreCase("webdriver")) {
					return ele;
				} else {
					System.out.println("Text which is coming on screen is " + value);
					return null;
				}

			}
		});
		System.out.println("Element is Displayed? " + element.isDisplayed());

	}

}
