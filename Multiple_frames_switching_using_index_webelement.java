package videos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_frames_switching_using_index_webelement {

	static WebDriver driver = null;

	public static void main(String[] args) {

		int total_frames = 0;
		WebElement my_frame, element = null;
		JavascriptExecutor je = null;

		// setting the path for chrome driver
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");

		// creating the driver class object for chrome
		driver = new ChromeDriver();

		// maximizing the page
		driver.manage().window().maximize();

		// getting the desired url
		driver.get("D://javaPrograms//Selinium//Selenium_first//src//videos//myframes.html");

		// making it implicitly wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// gathering the total number of frames
		total_frames = driver.findElements(By.tagName("iframe")).size();

		// displaying the number of frames that are present
		System.out.println("The total number of frames that are present are " + total_frames);

		// gathering the details of the frame that is to be navigated and taking
		// it into Webelement
		my_frame = driver.findElement(By.xpath("//iframe[@title='selenium-news']"));

		// switching to the frame
		driver.switchTo().frame(my_frame);

		// clicking on the projects option
		driver.findElement(By.xpath(".//*[@id='menu_projects']/a")).click();

		// switching to the parent frame
		driver.switchTo().parentFrame();

		// switching to the other frame
		driver.switchTo().frame("selenium");

		// creating an instance of java script executor
		je = (JavascriptExecutor) driver;

		// finding the element after scrolling down and storing in the
		// webelement
		element = driver.findElement(By.xpath("//a[text()='Selenium Basic Concepts']"));

		// now performing the scroll operation
		je.executeScript("arguments[0].scrollIntoView(true);", element);

		// performing the clicking operation after it is scrolled
		element.click();

	}

}
