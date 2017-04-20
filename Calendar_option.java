package videos;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar_option {

	static WebDriver driver = null;
	static List<WebElement> list = null;
	static WebElement date = null;

	public static void main(String[] args) throws InterruptedException {

		int i = 0;
		String j = null;

		// setting the path for chrome driver
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");

		// creating the driver class object for chrome
		driver = new ChromeDriver();

		// maximizing the page
		driver.manage().window().maximize();

		// making it implicitly wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// getting the desired url
		driver.get("https://www.redbus.in");

		// clicking on the onwards journey
		driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']")).click();

		// making the thread to sleep for 3 seconds
		Thread.sleep(3000);
		
		//closing the alert box
		//driver.switchTo().alert().dismiss();
		
		//making the thread wait for 2 seconds
		//Thread.sleep(2000);

		// collecting all the dates into list of webelement
		list = driver.findElements(
				By.xpath(".//*[@id='rb-calendar_onward_cal']/table/tbody/tr[7]/td"));

		// processing the list of elements
		for (i = 0; i < list.size(); i++) {
			// extracting each element into date
			date = list.get(i);

			// extracting into string "j"
			j = date.getText();

			if (j.equals("31")) {
				date.click();
				break;
			}

		}

	}

}
