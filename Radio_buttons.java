package videos;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_buttons {

	static WebDriver driver = null;

	public static void main(String[] args) {

		List<WebElement> checkbox = null;
		int i = 0;
		String j = null;
		WebElement element = null;

		// setting the path for chrome driver
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");

		// creating the driver class object for chrome
		driver = new ChromeDriver();

		// maximizing the page
		driver.manage().window().maximize();

		// getting the desired url
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");

		// making it implicitly wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// collecting the checkboxes into list
		checkbox = driver.findElements(By.xpath("//input[@name='lang' and @type='checkbox']"));

		// peocessing the data
		for (i = 0; i < checkbox.size(); i++) {
			element = checkbox.get(i);

			j = element.getAttribute("id");

			if (j.equalsIgnoreCase("code")) {

				System.out.println("The clicked element is " + j);

				element.click();
				
				break;

			}

		}

	}

}
