package videos;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiple_windows {

	static WebDriver driver = null;

	public static void main(String[] args) {

		String parent = null;
		String child = null;

		driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get(
				"https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default");

		parent = driver.getWindowHandle();

		System.out.println("The window before switching to child window is " + driver.getTitle());

		driver.findElement(By.xpath("//a[text()='Learn more']")).click();

		Set<String> s1 = driver.getWindowHandles();

		Iterator<String> i1 = s1.iterator();

		while (i1.hasNext()) {
			child = i1.next();

			if (!parent.equals(child)) {

				driver.switchTo().window(child);

				System.out.println("The window after switching is " + driver.getTitle());

				driver.close();
			}

		}

		driver.switchTo().window(parent);

		System.out.println("The element after switching to parent frame is " + driver.getTitle());

	}

}
