package videos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Element_not_clickble_extension_class {
	
	public static void clickById(WebDriver ldriver,String lid)
	{
		//creating the action class object
		Actions act=new Actions(ldriver);
		
		//moving to the desired location
		act.moveToElement(ldriver.findElement(By.id("persistent"))).click().build().perform();
	}

}
