package videos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Element_not_clickble_at_point_exception {

	static WebDriver driver = null;
	static Actions act = null;

	public static void main(String[] args) {

		// creating the firefox driver object
		driver = new FirefoxDriver();

		// getting the desired url
		driver.get("https://login.yahoo.com");

		// maximizing
		driver.manage().window().maximize();

		// making it implicitly wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		/*
		 * //clicking on the link required
		 * driver.findElement(By.xpath("//label[text()='Stay signed in']")).
		 * click();
		 * 
		 * //creating the actions class object 
		 * act=new Actions(driver);
		 * 
		 * //locating the mouse and clicking it
		 * act.moveToElement(driver.findElement(By.id("persistent"))).click().
		 * build().perform();
		 */

		// calling the method
		Element_not_clickble_extension_class.clickById(driver, "persistent");
	}

}
