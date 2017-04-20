package videos;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class ScrollForElement {

   WebDriver driver=null;
   JavascriptExecutor je=null;
   WebElement element=null;
   
   
   @Test
   public void scrolling()
  {
	
	 //setting the path for chrome driver
	 System.setProperty("webdriver.chrome.driver","D:\\Software\\chromedriver_win32\\chromedriver.exe");
	 				
	 //creating the driver class object for chrome
	 driver= new ChromeDriver();
	 
	 //maximizing the page
	 driver.manage().window().maximize();
	 
	 //getting the desired url
	 driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
	 
	 //creating the instance for javascript
	 je=(JavascriptExecutor)driver;
	 
	 //identifiying the element that is to be found and clicked
	 element=driver.findElement(By.xpath(".//*[@id='mCSB_3_container']/p[3]"));
	 
	 //executing the script to scroll and find the element
	 je.executeScript("arguments[0].scrollIntoView(true);",element);
	 
	 //displaying the text
	 System.out.println(element.getText());
  }
}