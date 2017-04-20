package videos;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_web_elements {

	static WebDriver driver = null;
	static List<WebElement> radio = null;
	static WebElement element = null;

	public static void main(String[] args) {

		int i, x = 0;
		String j=null;

		// setting the path for chrome driver
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");

		// creating the driver class object for chrome
		driver = new ChromeDriver();

		// maximizing the page
		driver.manage().window().maximize();

		// making the window implicitly wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// getting the desired url
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");

		// obtaining the elements into list
		radio = driver.findElements(By.id("male"));

		// processing the data to find the real buttons among the hidden values
		for (i = 0; i < radio.size(); i++) {

			// extracting the data of the value into each webelement
			element = radio.get(i);

			// extracting the location into the "x"
			x = element.getLocation().getX();

			if (x != 0) {
				
				//getting the attribute value into "j"
				j=element.getAttribute("id");
				
				//displaying the button that is to be clicked
				if(j!=null)
				System.out.println("The clicked element is "+j);
				
				//clicking on the button
				element.click();
				break;
			}

		}

	}

}
