package videos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.Highlighting_element_helper_class;
import Utility.Screenshot_helper;

public class Test_case_highlighting {

	static WebDriver driver = null;
	static WebElement user, pass, login = null;

	public static void main(String[] args) throws Exception {

		// setting the path for chrome driver
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");

		// creating the driver class object for chrome
		driver = new ChromeDriver();

		// maximizing the page
		driver.manage().window().maximize();

		// making the window implicitly wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// getting the desired url
		driver.get("https://www.facebook.com/");

		// placing the cursor on the username
		user = driver.findElement(By.xpath(".//*[@id='email']"));

		// calling the helper class for highlighting the element
		Highlighting_element_helper_class.highLightElement(driver, user);

		Screenshot_helper.Capture(driver, "username2");
		
		// sending the data to the user
		user.sendKeys("9966033364");
		
		
		
		// placing the cursor on the password
		pass = driver.findElement(By.xpath(".//*[@id='pass']"));

		// calling the helper class to highlight the element
		Highlighting_element_helper_class.highLightElement(driver, pass);
		
		Screenshot_helper.Capture(driver, "password2");

		// sanding the data to the password
		pass.sendKeys("8121516960");

		
		
		// placing the cursor on the login button
		login = driver.findElement(By.xpath("//input[@value='Log In']"));

		// calling the helper class to highlight the button
		Highlighting_element_helper_class.highLightElement(driver, login);

		// clicking on the button
		login.click();

	}

}
