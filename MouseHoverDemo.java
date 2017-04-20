package videos;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo {

	static WebDriver driver = null;
	static WebElement ele, element = null;
	static List<WebElement> links = null;

	public static void main(String[] args) {

		Actions act = null;
		int i = 0;
		String j = null;

		// setting the path for chrome driver
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");

		// creating the driver class object for chrome
		driver = new ChromeDriver();

		// maximizing the page
		driver.manage().window().maximize();

		// making the window implicitly wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// getting the desired url
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-perform-mouse-hover-in-selenium.html");

		// finding the button automation tools and storing it in webelement
		ele = driver.findElement(By.xpath("//button[text()='Automation Tools']"));

		// creating the actions class object
		act = new Actions(driver);

		// moving the cursor to that mouse hover position
		act.moveToElement(ele).perform();

		// extracting the elements into list
		links = driver.findElements(By.xpath("//div[@class='dropdown-content']//a"));

		// processing the data of the list
		for (i = 0; i < links.size(); i++) {
			// extracting into webelement
			element = links.get(i);

			// extracting the inner html into string
			j = element.getAttribute("innerHTML");

			// checking for the condition
			if (j.equalsIgnoreCase("Appium")) {
				// displaying the button that is pressed
				System.out.println("the clicked elementy is " + j);

				// clicking on the element
				element.click();
				break;
			}

		}

	}

}
