package videos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_buttons_check_boxes {

	static WebDriver driver=null;
	static List<WebElement> radio=null;
	
	public static void main(String[] args) {
		
		int i=0;
		WebElement buttons=null;
		String j=null;
		
		//setting the path for chrome driver
		System.setProperty("webdriver.chrome.driver","D:\\Software\\chromedriver_win32\\chromedriver.exe");
				
		//creating the driver class object for chrome
		driver= new ChromeDriver();
		
		//maximizing
        driver.manage().window().maximize();
        
        //opening the desired url
        driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
        
        //finding the radio buttons
        radio=driver.findElements(By.xpath("//input[@name='lang' and @type='radio']"));
        
        //processing the radio buttons
        for(i=0;i<radio.size();i++)
        {
        	buttons=radio.get(i);
        	
        	j=buttons.getAttribute("value");
        	
        	if(j.equalsIgnoreCase("ruby"))
        	{
        		System.out.println(j);
        		buttons.click();
        	}
        }
	}

}
