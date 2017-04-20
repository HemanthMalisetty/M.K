package videos;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Broken_links {

	static WebDriver driver = null;

	public static void main(String[] args) {

		List<WebElement> list = null;
		int i = 0;
		WebElement element = null;
		String url = null;

		// setting the path for chrome driver
		//System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");

		// creating the driver class object for chrome
		//driver = new FirefoxDriver();
		driver=new FirefoxDriver();

		// maximizing the window
		driver.manage().window().maximize();

		// getting the desired url
		driver.get("https://www.google.co.in");

		// collecting all the elements into the list
		list = driver.findElements(By.tagName("a"));

		// displaying the number of links
		System.out.println("The number of links that are found are " + list.size());

		// processing each links
		for (i = 0; i < list.size(); i++) {
			// collecting the each element into webelement
			element = list.get(i);

			// collecting the url of that particular element
			url = element.getAttribute("href");

			// calling the method to check the link
			Verifylink(url);
		}

	}

	public static void Verifylink(String linkurl) {
		URL url = null;

		try {
			// creating the url class object
			url = new URL(linkurl);

			// type casting the url openconnection object to HttpURLConnection
			// object
			HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();

			// making it wait for 3 seconds
			httpURLConnect.setConnectTimeout(3000);

			// making it to hit a request
			httpURLConnect.connect();

			// processing the response message
			if (httpURLConnect.getResponseCode() == 200) {
				System.out.println(linkurl + "-" + httpURLConnect.getResponseMessage());
			}
			if (httpURLConnect.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND) {
				System.out.println(
						linkurl + "-" + httpURLConnect.getResponseMessage() + "-" + HttpURLConnection.HTTP_NOT_FOUND);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
